/**
 * 
 */

function deleteRequest(urlToDelete,successUrl) {
	$.ajax({
		url: urlToDelete,
		type: 'DELETE',
		success: function(results) {
			location.assign(successUrl);
		}
	});
}