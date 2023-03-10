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
<img src="img/wuzhi1.jpg" class="custom-logo ezlazyloaded">
<img src="img/wuzhi2.jpg" class="custom-logo ezlazyloaded">
<img src="img/wuzhi3.jpg" class="custom-logo ezlazyloaded">
<img src="img/wuzhi4.jpg" class="custom-logo ezlazyloaded">
<img src="img/wuzhi5.jpg" class="custom-logo ezlazyloaded">
<img src="img/wuzhi6.jpg" class="custom-logo ezlazyloaded">
<div id="hide button 1">1da</div>
<div id="hide button 2">2da</div>
<p>最後</p>
<script>
window.onload = function(){
	var images= document.getElementsByTagName("img");
	for(var i=0;i<images.length;i++){
		var image = images[i];
		if(image.addEventListener)
			image.addEventListener("click",hide,false);
		else
			image.attachEvent("onclick",hide);
	}
	
	function hide(event) { event.target.style.visibility = "hidden"; }
}
</script>
</body>
</html>
