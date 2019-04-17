<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/pages/include/taglib.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>主界面</title>
<%@include file="/WEB-INF/pages/include/head.jsp"%>
<style type="text/css">
* {
	margin: 0px;
	padding: 0px;
}

a {
	
	color: red;
}

ul, li {
	list-style: none;
}

body {
	font-size: 12px;
	font-family: "微软雅黑";
}

h1 {
	width: 100%;
	margin: auto;
	text-align: center;
}

#box {
	width: 1000px;
	height: 1000px;
	text-align: center;
	margin: 0px auto;
	background-color: #fff;
}

#box #top {
	width: 1000px;
	height: 200px;;
	background-image: url("img/bodyimg/a.png");
}

#box #top .exit {
	float: left;
	text-decoration: none;
	margin-top: 10px;
	color: #000;
	margin-left: 14px;
	font-size: 20px;
}

#box #top .name {
	width: 190px;
	height: 30px;
	float: right;
	text-align: left;
	line-height: 30px;
	font-size: 20px;
	font-weight: bold;
}

#box #top .time {
	width: 325px;
	float: right;
	height: 30px;
	text-align: left;
	line-height: 30px;
	font-size: 20px;
	font-weight: bold;
}

#box #top .time  #cg {
	color: red;
}

#box #top  .name {
	color: red;
}

#box #center {
	width: 1000px;
	height: 700px;
}

#box #button {
	width: 1000px;
	height: 100px;
}

#box #center #navigation {
	width: 998px;
	height: 30px;
	background-color: #000;
}

#box #center #navigation li {
	width: 122px;
	height: 30px;
	float: left;
	display: inline-block:30px;
}

#box #center #navigation li a {
	width: 122px;
	height: 30px;
	color: #FFF;
	font-weight: bold;
	line-height: 30px;
	font- size: 18px;
	text-align: center;
	cursor: pointer;
}

#box #center #navigation li a:hover {
	display: block;
	background-color: #FFF;
	color: #F00;
	font-weight: bold;
	text- decoration: none;
}

/*个人信息css  */
#boxcenter {
	width: 1000px;
	height: 671px;
	margin-top: -10px;
	font-size: 16px;
}
#boxcenter  #titilemessage{
    width: 1000px;
    height: 50px;
    border: 1px solid red;
    float: left;
}
#boxcenter  #titilemessage li{
float: left;
margin-left: 115px;
line-height: 50px;
}
#boxcenter  #boxbook{
border: 1px solid red;
    height: 570px;
    width: 1000px;
    float: left;
}
#boxbook .hmshowbook{
width: 1000px;
height: 100px;
margin-top: 10px;
}
#boxbook .showbook{
	float:left;
	    padding-left: 55px;
	     line-height: 100px;
}
#boxbook  .rowsbook{
	     float: left;
    width: 150px;
    font-size: 14px;
    /* padding-left: 100px; */
    margin-left: 80px;
	    line-height: 100px;
}
#boxbook .price{
    float: left;
    padding-left: 67px;
    line-height: 100px;
}
#boxbook .runber{
	float: left;
	padding-left: 100PX;
	line-height: 100px;
}
#boxbook .money{
float: left;
    padding-left: 97PX;
    line-height: 100px;
    color: red;
}
#boxbook .operation{
    float: left;
    padding-left: 83px;
    padding-top: 30px;
}
#boxbook .operation a{
color:#000;
}
#boxbook .operation a:hover{
color:red;
}
#boxcenter #buttonbook{
    border: 1px solid red;
    height: 50px;
    width: 1000px;
    float: left;
}
#boxcenter #buttonbook  li{
	float: left;
	margin-left:30px;
	line-height: 50px;
	
}
</style>

</head>
<body style="background-color: #00a2dd;">

	<div id="topimg">
		<img alt="" src="<%=request.getContextPath()%>/img/bodyimg/titletop4.jpg">
		<img alt="" src="<%=request.getContextPath()%>/img/bodyimg/titletop3.jpg">
		<img alt="" src="<%=request.getContextPath()%>/img/bodyimg/titletop1.jpg">
		<img alt="" src="<%=request.getContextPath()%>/img/bodyimg/titletop2.jpg">
	</div>
	<div id="box">
		<div id="top">
			<div class="exit">
				<a href="login.jsp" style="color: #2e09f3;">注销</a>
			</div>
			<div class="time">
				当前时间:<span id="cg">0000-00-00 上午00:00:00</span>
			</div>
			<div class="name">用户名:${loginname}</div>

		</div>
		<div id="center">
			<ul id="navigation">
				<li><a href="main">首&nbsp;&nbsp;&nbsp;页</a></li>
				<li><a href="Child">少儿童书</a></li>
				<li><a href="Literary">文学小说</a></li>
				<li><a href="itbook">IT科技</a></li>
				<li><a href="message">留&nbsp;&nbsp;&nbsp;言</a></li>
				<li><a href="person">个人信息</a></li>
				<li><a href="pwdmodil">修改密码</a></li>
				<li><a href="bookshop">购物车</a></li>
			</ul>
			<div id="boxcenter">
				<div id="titilemessage">
					<ul>
						<li><input type="checkbox" id="checkbox" name="checkbox">全选</li>
						<li>商品名称</li>
						<li>单价</li>
						<li>数量</li>
						<li>金额</li>
						<li>操作</li>
					</ul>
				</div>
				<div id="boxbook">
				<table>
					 <c:forEach items="${bmuser}" var="show" begin="0" end="3">
						<ul class="hmshowbook">
	
								<li class="showbook">
									<input type="checkbox" id="checkbox" name="checkbox">
									<img alt="" src="<%=request.getContextPath() %>/img/shopimg/jiu.png" style="width: 50px;height: 50px;"/>
								</li>
								<li class="rowsbook"><a href="#">${show.bookName}</a></li>
								<li class="price">￥${show.bookPrice }</li>
								<li class="runber">${show.bookRepertory}</li>
								<li class="money">￥${show.bookPrice }</li>
								<li class="operation"><a href="#">移入收藏夹</a><br/><a href="delBook?bmOrder.id=${show.id  }">删除</a></li>
						</ul>
					</c:forEach> 
					<tr style="font-size: 20px; font-weight: bold;width:1000px;">
							<th colspan="2" style="text-align: center;width: 200px;"><a
								style="color: red;" href="bookshop?page=1"><<首页>></a></th>
							<th colspan="2" style="text-align: center;width: 200px;"><c:if
									test="${page-1>=1 }">
									<a style="color: red;" href="bookshop?page=${page-1 }">上一页</a>
								</c:if></th>
							<th colspan="2" style="text-align: center;width: 200px;"><a
								style="color: red;">当前第${page}页</a></th>
							<th colspan="2" style="text-align: center;width: 200px;"><c:if
									test="${maxpage>page }">
									<a style="color: red;" href="bookshop?page=${page+1 }">下一页</a>
								</c:if></th>
							<th colspan="3" style="text-align: center;width: 200px;"><a
								style="color: red;" href="bookshop?page=${maxpage}"><<尾页>></a></th>


						</tr>
						</table>
				</div>
				<div id="buttonbook">
					<ul>
						<li><input type="checkbox" id="checkbox" name="checkbox">全选</li>
						<li><a href="#">删除</a></li>
						<li><a href="#">清除失效宝贝</a></li>
						<li><a href="#">收入收藏夹</a></li>
						<li><a href="#">分享</a></li>
						<li>已选商品2件</li>
						<li>合计(不含运费)：644.00</li>
						<li><a href="#">结算</a></li>
					</ul>
				</div>
			</div>


		</div>
		<div id="button" style="border: 1px solid red">
			<p class="links" style="margin-top: 10px;">
				<a href="" target="_blank">关于我们</a><span class="mod_copyright_split">|</span>
				<a href="" target="_blank">联系我们</a><span class="mod_copyright_split">|</span>
				<a href="#" target="_blank">联系客服</a><span
					class="mod_copyright_split">|</span> <a href="#" target="_blank">合作招商</a><span
					class="mod_copyright_split">|</span> <a href="#" target="_blank">商家帮助</a><span
					class="mod_copyright_split">|</span> <a href="#" target="_blank">营销中心</a><span
					class="mod_copyright_split">|</span> <a href="#" target="_blank">图书管理</a><span
					class="mod_copyright_split">|</span> <a href="#" target="_blank">友情链接</a><span
					class="mod_copyright_split">|</span> <a href="#" target="_blank">销售联盟</a><span
					class="mod_copyright_split">|</span> <a href="#" target="_blank">图书社区</a><span
					class="mod_copyright_split">|</span> <a href="#" target="_blank">风险监测</a><span
					class="mod_copyright_split">|</span> <a href="#" target="_blank">隐私政策</a><span
					class="mod_copyright_split">|</span> <a href="#" target="_blank">图书公益</a><span
					class="mod_copyright_split">|</span> <a href="#" target="_blank">English
					Site</a><span class="mod_copyright_split">|</span> <a href="#"
					target="_blank">Media &amp; IR</a>
			</p>
			<span style="font-size: 20px; font-weight: bold; line-height: 80px;">湖南机电职业技术学院@<a
				href="http://ww.baidu.com">校园图书商城</a> 版权所有2018-2018 YHM
				AllRightsReserved
			</span>
		</div>

	</div>

	<script type="text/javascript">
		setInterval("cg.innerHTML=new Date().toLocaleString()", 1000);
	</script>
</body>
</html>