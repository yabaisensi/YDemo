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
<button id="debuglog" class="sdemo" onclick="debug(moveon)">click event tigger2</button>
<button id="debuglog2" onclick="hide(debuglog2,debuglog)">click event tigger3</button>
<button id="debuglog3" onclick="highlight(debuglog)">click event tigger4</button>
<script>
function moveon(){
	var answer = confirm("Ready to move on?");
	alert(answer);
	/* if (answer) window.location = "https://google.com"; */
	/* window.location = "http://localhost:12345/YDemo/"; */
}
function debug(msg){
	var log = document.getElementById("debuglog1");
	alert(log);
	if(!log){
		log=document.createElement("div");
/* 		log.id ="debuglog2";
		log.innerHTML ="<h1>Debug log</h1>" */
		document.body.appendChild(log);
	}
	
}
function hide(e,reflow){
	alert(reflow);
	if(reflow){
		e.style.display = "none"
	}else{
		e.style.visibility="hidden";
	}
}

function highlight(e){
	if(!e.className){
		e.className = "hilite"
	}else{
		e.className +="hilite";
	}
}
</script>
</body>
</html>
