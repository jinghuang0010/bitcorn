
	 function ckeckform() {
			if(checkname() && checkpwd()&&checkyzm()){
				return true;
			}else{
				return false;
			}
		} 
		// VALIDATION USERNAME NOT NULL
		function checkname() {
			var username=document.getElementById("username").value;
			if(username.length >0){
				document.getElementById("one").innerHTML="<font color='green'>¡Ì</font>";
					return true;
			}else{
				document.getElementById("one").innerHTML="CAN NOT BE NULL";
				return false;
			}
		}
		//PAD NOT BU NULL
		function checkyzm() {
			var d=document.getElementById("pwd").value;
			if(d.length >0){
				document.getElementById("two").innerHTML="<font color='green'>¡Ì</font>";
					return true;
			}else{
				document.getElementById("two").innerHTML="NOT BE NULL";
				return false;
			}
		}
		//VERIFY NUMBER NOT BE NULL
		function checkpwd() {
			var d=document.getElementById("yzm").value;
			if(d.length >0){
				document.getElementById("three").innerHTML="<font color='green'>¡Ì</font>";
					return true;
			}else{
				document.getElementById("three").innerHTML="NOT BE NULL";
				return false;
			}
		}
		
		
		//RESET FUNCTION ON LOGIN PAGE
		function resetform(){
			document.getElementById("username").value="";
			document.getElementById("one").innerHTML="";
			document.getElementById("pwd").value="";
			document.getElementById("two").innerHTML="";
			document.getElementById("yzm").value="";
			document.getElementById("three").innerHTML="";
			
		}	
	
		function huan(){
			//GET NEW VERIFY PIC
			document.getElementById("img").src="ImgServlet.do?a="+new Date().getTime();
		}
		
		//REGISTER USER TRANSFER PAGE
		function changeuserjsp(){
			alert("inter add function");
			window.location.href="adduser.jsp";
		}
	