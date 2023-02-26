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
<p>最後</p>
<button onclick="hide(this,true);debug('hide button 1');">Hide1</button>
<button onclick="hide(this);debug('hide button 2');">Hide2</button>
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
