<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
<script type="text/javascript" src="js/jquery-3.6.2.js"></script>
<script type="text/javascript" src="js/debug.js"></script>
<script type="text/javascript" src="js/hide.js"></script>
<title>kumichounoHead</title>
</head>
<body>
<p>先頭部分</p>
<div id="hide button 1">1da</div>
<div id="hide button 2">2da</div>
<button onclick="hide(this,true);debug(moveon());">Hide1</button>
<button onclick="hide(this);debug('hide button 2');">Hide2</button>
<p>最後</p>
<script>
function moveon(){
	var answer = confirm("Ready to move on?");
	alert(answer);
	/* if (answer) window.location = "https://google.com"; */
	/* window.location = "http://localhost:12345/YDemo/"; */
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
