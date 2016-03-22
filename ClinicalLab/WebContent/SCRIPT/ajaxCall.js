/**
 * 
 */

var dataList = document.getElementById("jSonList");
var input = document.getElementById("labCode");

var request = new XMLHttpRequest();
request.open("GET","DATA/labCodeList.json",true);

request.onreadystatechange = function (response) {
	
	if(request.readyState === 4 && request.status === 200){
		
		var jSonOptions = JSON.parse(request.responseText);
		jSonOptions.forEach(function(item){
			var option = document.createElement("option");
			option.value = item.code;
			dataList.appendChild(option);
		});
		
		
	}
	
};


request.send();