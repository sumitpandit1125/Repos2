/**
 * 
 */

	element1 = document.getElementById("btn1");
	element1.addEventListener("click", normalFunction);
	
	element2 = document.getElementById("btn2");
	element2.addEventListener("click", function(){
		withArgFunction("Sumit");
	});
	
	element3 = document.getElementById("btn3");
	element3.addEventListener("click", function (){
		takeFunctionAsArg(returnFunction("Sumit"));
	});
	
	element4 = document.getElementById("btn4");
	element4.addEventListener("click", function(){
		alert(returnFunction("Sumit"));
	});
	
	element5 = document.getElementById("btn5");
	element5.addEventListener("click", function (){
		var funcList = returningFunctions();
		funcList.addClass();
		funcList.removeClass();
	});


function normalFunction(){
	alert("I am a normal function");
}

function withArgFunction(name){
	alert("welome to java script function " + name);
}

function takeFunctionAsArg(func){
	var recvd = func;
	alert(recvd);
	
}

function returnFunction(name){
	
	return "welome to java script function " + name;
}

function returningFunctions(){
	
	return {
		
		addClass:function(){
			alert("add class called");
		},
		removeClass:function(){
			alert("remove class called");
		}
	};
}