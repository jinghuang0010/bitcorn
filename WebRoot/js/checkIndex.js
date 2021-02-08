	function checkIndex() {
		
		if(checkmoney() && checknum()){
			return true;
		}else{
			return false;
		}
	} 
	//validation amonut is a ingeter
	function checkmoney() {
		
		var money=document.getElementById("money").value;
		
		if(money.length >0){
			if(!(/(^[1-9]\d*$)/.test(money))){
				document.getElementById("one").innerHTML="fill in integer";
				return false;
				
			}else{
				
				document.getElementById("one").innerHTML="<font color='green'>¡Ì</font>";
				return true;
			}
			
		}else{
			document.getElementById("one").innerHTML="can not be null";
			return false;
		}
	}
	//validation psd is not null
	function checknum() {
		
		var sumnum=document.getElementById("sumnum").value;
		if(sumnum.length>0){

		if(!(/(^[1-9]\d*$)/.test(sumnum))){
		document.getElementById("two").innerHTML="fill in integer";
				return false;
			}else{
			document.getElementById("two").innerHTML="<font color='green'>¡Ì</font>";
				return true;
			}
		}else{
			document.getElementById("two").innerHTML="can not be null";
			return false;
		}
	}
	
	
	//reset function
	function resetform(){
		document.getElementById("money").value="";
		document.getElementById("one").innerHTML="";
		document.getElementById("sumnum").value="";
		document.getElementById("two").innerHTML="";
		
	}
	
	
	
	