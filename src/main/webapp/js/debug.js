function debug(msg){
	var log = document.getElementById("debuglog");
	if(!log){
		log=document.createElement("div");
 		log.id ="debuglog";
		log.innerHTML ="<h1>Debug log</h1>"; 
		document.body.appendChild(log); 
	}
	// メッセージを<pre>で囲んで、ログに追加する
	var pre = docment.createElement("pre"); //pre タグを作成する
	var text = docment.createElement(msg); // テキストノードにmsgを格納
	pre.appendChild(text); // テキストに<pre>を追加
	log.append(pre); // <pre> をログに追加
	
}