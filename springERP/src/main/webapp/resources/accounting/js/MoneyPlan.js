//현금 & 어음 체크하는 부분
function money() {
	document.moneyplan.action="/accounting/moneyPlan/MoneyPlan_Add";
	document.moneyplan.submit();
}

function promissory() {
	document.moneyplan.action="/accounting/moneyPlan/MoneyPlan_Add_promissory";
	document.moneyplan.submit();
}