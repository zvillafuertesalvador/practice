$(document).ready(function(){
	
	$.ajax({
		url: baseUrl + "module/findBy",
		type: "GET",
		success: function(data){
			console.log(data);
		}
		
	});
	
	
});