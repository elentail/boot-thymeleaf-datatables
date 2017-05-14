/**
 * 
 */
$(document).ready( function () {
	 var table = $('#eqpTable').DataTable({
			"sAjaxSource": "/requesteqp",
			"sAjaxDataProp": "",
			"order": [[ 0, "asc" ]],
			"stripeClasses": [ 'info', 'success', 'active' ],
			"aoColumns": [
				{ "mData": "eqpid"},
				{ "mData": "eqpip" },
				{ "mData": "eqpline" },
				{ "mData": "eqptype" }
			]
	 })
});
