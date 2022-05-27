/*$(document).ready(function () {

	$("#search-form").submit(function (event) {

		//stop submit the form, we will post it manually.
		event.preventDefault();

		fire_ajax_submit();

	});

});*/

function fire_ajax_submit(id) {
alert(id);
	$.ajax({
		type: "POST",
		contentType: "application/text",
		url: "deleteRecord",
		data: id,
		dataType: 'text',
		success: function(result) {
			alert("Success!")
			console.log(result);
		},
		error: function(e) {
			alert("Error!")
			console.log("ERROR: ", e);
		}

	});
}