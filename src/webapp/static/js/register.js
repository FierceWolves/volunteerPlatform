var path = $("#jspPath").val();
var IS_MEMBER;
var IS_EIGHTEEN;
function isMemebers(str){
	IS_MEMBER = str;
	$(".tripe1").hide();
	$(".tripe2").fadeIn();
}
function isEighteen(str){
	IS_EIGHTEEN = str;
	$(".tripe2").hide();
	window.location.href=path+"/user/register?ismember=' + IS_MEMBER + '&iseighteen=' + IS_EIGHTEEN;";
}