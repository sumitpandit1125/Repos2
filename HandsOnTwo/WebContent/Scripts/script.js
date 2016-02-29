/**
 * 
 */

	element = document.getElementById("submit");
	custName = document.getElementById("custName");
	newName = "";
	locElement = document.getElementById("location");
	locValue = null;
	payModeElement = document.getElementsByName("payMode");
	giftElement = document.getElementsByName("gift");
	giftValue = "";
	payModeValue = "";


element.addEventListener("click", nameCheck);
	
function nameCheck(){
		
	newName = prompt("Customer Name",custName.value);
	if(newName != null){
		custName.value = newName;
	
	if(custName.value != ""){
		checkLocation();
	}
	else{
		custName.focus();
	}
	}
}


function checkLocation(){
	locValue = locElement.options[locElement.selectedIndex].text;
	if(locValue == "Select"){
		alert("please select a valid location");
		locElement.focus();
	}
	else {
		checkPaymentMode();
	}
}	


function checkPaymentMode(){
	
	for(var i = 0; i < payModeElement.length; i++){
	    if(payModeElement[i].checked){
	        payModeValue = payModeElement[i].value;
	    }
	}
	
	checkGift();  
}


function checkGift(){
	
	for(var i = 0; i < giftElement.length; i++){
	    if(giftElement[i].checked){
	        giftValue += " " + giftElement[i].value;
	    }
	}
	
	if(confirm(custName.value+" please confirm your choices :" +
			"\nLocation\t\t: "+locValue +
			"\nPayment Option\t: "+payModeValue+
			"\nGifts\t\t: "+giftValue) ){
		
		alert("Your Order has been placed successfully");
		
		var form = document.getElementById("form1");
		
		
	}
	newName = "";
	giftValue = "";
	payModeValue = "";
	
}

