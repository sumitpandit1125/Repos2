/**
 * 
 */


function init(){
	
	var item = {
			"itemName" : "TV",
			"itemImage": "Image/tv.jpg",
			showItem:function(){
				var ele = document.getElementById("itemName");
				ele.innerHTML = this.itemName;
				document.getElementsByTagName("img")[0].src = this.itemImage;
			}
			
	};
	
	console.log("Init Called");
	console.log(item.itemName);
	item.showItem();
}

(function(){
	init();
})();