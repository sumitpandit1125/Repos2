/**
 * 
 */

function updatePatient(){
	
	var patCode = $('#patCode').val();
	var patName = $('#patName').val();
	var patDOB = $('#patDOB').val();
	var mobile = $('#mobile').val(); 
	
	
	
	
	$.ajax({
			url : "PatientServlet",
			type: "GET",
			data: {patCode : patCode.valueOf()},
			dataType: "text",
		  	success : function(data){
		  		var pat = $.parseJSON(data);
		  		
		  		$("#patName").val(pat.name);
		  		$("#patDOB").val(pat.dOB);
		  	    $("#mobile").val(pat.mobile);
		    }
	
	});
	
}

$(function(){
	
	$("#patCode").on('blur',updatePatient);
});