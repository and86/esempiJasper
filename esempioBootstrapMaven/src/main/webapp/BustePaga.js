/**
 * 
 */

//$(function() {
//	$('#dataEm').datepicker({
//		minDate : 0
//		
//	});
//
//});

$(function() {
	$('#dataEm').datepicker({
		minDate : 0,
		dateFormat: 'dd/mm/yy'
		
	});

});

function checkData() {

	if (document.getElementById("imp").value < 0) {
		var result = confirm("Importo negativo. Continuare?");
		if (result == true) {
			document.getElementById("bustaPaga").action = "doBustaPaga.jsp";
			// alert("Valore importo non valido");
			// document.bustaPaga.importo.focus(); //posiziona il cursore sul
			// campo di nome importo nel form di nome bustaPaga
			// return false;
		}
	} else {
		document.getElementById("bustaPaga").action = "doBustaPaga.jsp";
	}
}
