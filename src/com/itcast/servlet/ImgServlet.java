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

	//������Χ0~255   fc������Ҷȣ�bc����ǳ�Ҷ�
	private Color getRandColor(int fc,int bc){ //������Χ��������ɫ;
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
		//��ʾ��Ӧ��ʽΪһ��ͼƬ
		resp.setContentType("image/jpeg");

		resp.addHeader("pragma", "NO-cache");

		resp.addHeader("Cache-Control", "no-cache");

		resp.addDateHeader("Expries", 0);

		// ���ڴ��д���ͼ��
		int width = 100, height = 50;
		//����
		BufferedImage image = new BufferedImage(width, height,
				BufferedImage.TYPE_INT_RGB);

		// ��ȡͼ��������
		//g���ǻ���
		Graphics g = image.getGraphics();

		// ���������
		Random random = new Random();

		// �趨����ɫ
		g.setColor(getRandColor(200, 255));
		g.fillRect(0, 0, width, height);

		// �趨����
		g.setFont(new Font("����", Font.PLAIN, 36));

		// ���߿�
		//g.drawRect(0, 0, width - 1, height - 1);

		// �������20�������ߣ�ʹͼ���е���֤�벻�ױ���������̽�⵽
		
		for (int i = 0; i < 20; i++) {
			g.setColor(getRandColor(50, 120));
			int x = random.nextInt(width);
			int y = random.nextInt(height);
			int xl = random.nextInt(400)-200;
			int yl = random.nextInt(400)-200;
			g.drawLine(x, y, x + xl, y + yl);
		}

		// ȡ�����������֤��(4λ����)
		String sRand = "";
		for (int i = 0; i < 4; i++) {
			String rand = ""+(char)(random.nextInt(26)+97);
			sRand += rand;
			// ����֤����ʾ��ͼ����
			g.setColor(new Color(20 + random.nextInt(110), 20 + random
					.nextInt(110), 20 + random.nextInt(110)));
			// ���ú�����������ɫ��ͬ����������Ϊ����̫�ӽ�������ֻ��ֱ������
			g.drawString(rand, 12 * i + 2, 32);
		}
		// ����֤�����SESSION
		// req.setAttribute("code", sRand);
		req.getSession().setAttribute("code", sRand);
		// ͼ����Ч
		g.dispose();

		// ���ͼ��ҳ��
		ImageIO.write(image, "JPEG", resp.getOutputStream());

	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
