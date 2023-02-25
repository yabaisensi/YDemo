<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
<script type="text/javascript" src="js/jquery-3.6.2.js"></script>
<title>kumichounoHead</title>
</head>
<body>
<p>先頭部分</p>
<p>最後</p>
<button onclick="moveon()">click event tigger</button>
<button id="debuglog" onclick="debug(moveon)">click event tigger2</button>
<script>
function moveon(){
	var answer = confirm("Ready to move on?");
	alert(answer);
	/* if (answer) window.location = "https://google.com"; */
	/* window.location = "http://localhost:12345/YDemo/"; */
}
function debug(msg){
	var log = document.getElementById("debuglog1");
	
	if(!log){
		log=document.createElement("div");
		log.id ="debuglog2";
		log.innerHTML ="<h1>Debug log</h1>"
		document.body.appendChild(log);
	}
	
	var pre =document.createElement("pre");
	var text = document.createTextNode(msg);
	pre.appendChild(text);
	log.appendChild(pre);
}
</script>
</body>
</html>
