function debug(msg){
	var log = document.getElementById("debuglog1");
	alert(log);
	if(!log){
		log=document.createElement("div");
 		log.id ="debuglog2";
		log.innerHTML ="<h1>Debug log</h1>"; 
		document.body.appendChild(log); 
	}
}