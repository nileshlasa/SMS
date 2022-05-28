/*$(document).ready(function () {

	$("#search-form").submit(function (event) {

		//stop submit the form, we will post it manually.
		event.preventDefault();

		fire_ajax_submit();

	});

});*/

function fire_ajax_submit(abc) {
	var selectedID = abc;

	$.ajax({
		type: "Post",
		url: "deleteRecord",
		data: {'id': selectedID},
		success: function(result) {
			//window.location="ShowAll";
			$("#" +selectedID + "").hide("fast");
			console.log(result);
		},
		error: function(e) {
			alert("Error!")
			console.log("ERROR: ", e);
		}

	});
}