
	 function ckeckform() {
			if(checkname() && checkpwd()){
				return true;
			}else{
				return false;
			}
		} 
		//USENAME CAN NOT BE NULL
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
		
		//PSD CAN NOT BE NULL
		function checkpwd() {
			var d=document.getElementById("pwd").value;
			if(d.length >0){
				document.getElementById("two").innerHTML="<font color='green'>¡Ì</font>";
					return true;
			}else{
				document.getElementById("two").innerHTML="CAN NOT BE NULL";
				return false;
			}
		}
		
		//RESET FUNCTION
		function resetform(){
			document.getElementById("username").value="";
			document.getElementById("one").innerHTML="";
			document.getElementById("pwd").value="";
			document.getElementById("two").innerHTML="";
			document.getElementById("yzm").value="";
			document.getElementById("three").innerHTML="";
			
		}