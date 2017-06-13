<html>
<body>
<h2>Hello World!</h2>
<p>
SUCCESS!!!
hejhej
</p>
<button>
<a onclick="getBankMessage()"> Get bank message</a>
</button>
<p id="getBankMessageResponse"></p>


<script>
 function getBankMessage(){
	 var id = document.getElementById("getBankMessageResponse");
	 http_get('/tester/bank', function(error,response){
		if(error){
			id.innerText  = 'ERROR SORRY status: ' + error.status;
		} else {
			id.innerText  = response.message;
		}
	 })
 }

 
 function http_get(url,callback){
	 var xhr = new XMLHttpRequest();
	 xhr.open('GET', url);
	 xhr.send(null);
	 xhr.onreadystatechange = function () {
		  var DONE = 4; // readyState 4 means the request is done.
		  var OK = 200; // status 200 is a successful return.
		  if (xhr.readyState === DONE) {
		    if (xhr.status === OK) 
		    	callback(null,{message : xhr.responseText,status : xhr.stats })
		    } else {
		     	callback({message : xhr.responseText, status : xhr.status}); // An error occurred during the request.
		    }
		  }
		
	 }
</script>
</body>

</html>
