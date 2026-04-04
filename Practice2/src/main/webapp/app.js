//캔버스 크기 설정
function initialize(){
	graph1.width=document.getElementById('grl').offsetWidth;
	graph1.height=document.getElementById('grl').offsetHeight;
}
initialize();

//그래프 1 데이터
var graphInfo1 = {
					title: "주요 도시 연평균 미세먼지 농도",
					max: 35,
					data: [
						{city: "서울", range:23, color:"#fe802c"},
						{city: "부산", range:26, color:"#ffd100"},
						{city: "대구", range:26, color:"#81d733"},
						{city: "인천", range:29, color:"#666666"},
						{city: "광주", range:26, color:"#43cbff"},
						{city: "대전", range:28, color:"#3183c2"},
						{city: "진주", range:25, color:"#d4155b"}
					]
}