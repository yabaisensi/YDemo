function hide(e,reflow){
	alert(reflow);
	if(reflow){
		e.style.display = "none"
	}else{
		e.style.visibility="hidden";
	}
}