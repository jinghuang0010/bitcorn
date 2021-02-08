package com.itcast.servlet;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ImgServlet extends HttpServlet {

	//参数范围0~255   fc是最深灰度，bc是最浅灰度
	private Color getRandColor(int fc,int bc){ //给定范围获得随机颜色;
	    Random random = new Random();
	    if(fc>255)   fc=255;
	    if(bc>255)   bc=255;
	    int   r=fc+random.nextInt(bc-fc);
	    int   g=fc+random.nextInt(bc-fc);
	    int   b=fc+random.nextInt(bc-fc);
	//System.out.println("r = " + r + ", g = " + g + ", b = " + b);    
	    return   new   Color(r,g,b);
	    }
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//表示响应格式为一个图片
		resp.setContentType("image/jpeg");

		resp.addHeader("pragma", "NO-cache");

		resp.addHeader("Cache-Control", "no-cache");

		resp.addDateHeader("Expries", 0);

		// 在内存中创建图象
		int width = 100, height = 50;
		//画布
		BufferedImage image = new BufferedImage(width, height,
				BufferedImage.TYPE_INT_RGB);

		// 获取图形上下文
		//g就是画笔
		Graphics g = image.getGraphics();

		// 生成随机类
		Random random = new Random();

		// 设定背景色
		g.setColor(getRandColor(200, 255));
		g.fillRect(0, 0, width, height);

		// 设定字体
		g.setFont(new Font("黑体", Font.PLAIN, 36));

		// 画边框
		//g.drawRect(0, 0, width - 1, height - 1);

		// 随机产生20条干扰线，使图象中的认证码不易被其它程序探测到
		
		for (int i = 0; i < 20; i++) {
			g.setColor(getRandColor(50, 120));
			int x = random.nextInt(width);
			int y = random.nextInt(height);
			int xl = random.nextInt(400)-200;
			int yl = random.nextInt(400)-200;
			g.drawLine(x, y, x + xl, y + yl);
		}

		// 取随机产生的认证码(4位数字)
		String sRand = "";
		for (int i = 0; i < 4; i++) {
			String rand = ""+(char)(random.nextInt(26)+97);
			sRand += rand;
			// 将认证码显示到图象中
			g.setColor(new Color(20 + random.nextInt(110), 20 + random
					.nextInt(110), 20 + random.nextInt(110)));
			// 调用函数出来的颜色相同，可能是因为种子太接近，所以只能直接生成
			g.drawString(rand, 12 * i + 2, 32);
		}
		// 将认证码存入SESSION
		// req.setAttribute("code", sRand);
		req.getSession().setAttribute("code", sRand);
		// 图象生效
		g.dispose();

		// 输出图象到页面
		ImageIO.write(image, "JPEG", resp.getOutputStream());

	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
