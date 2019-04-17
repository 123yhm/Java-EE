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
	text-decoration: none;
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
#box #top .exit{
	float: left;
	text-decoration: none;
   margin-top:10px;
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
#box #top  .name{
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

#boxcenter {
	width: 1000px;
	height: 310px;
	margin-top: -10px;
}

#boxcenter  .menuleft {
	width: 200px;
	height: 310px;
	float: left;
}

#boxcenter  .menuleft li {
	width: 200px;
	height: 44px;
	border-bottom: 1px dotted #849555;
	/* margin-left: 9px; */
	/* position: relative; */
	/* overflow: hidden; */
	/* padding-top: 3px; */
	padding-bottom: 2px;
	text-align: cce;
	text-align: center;
}

#boxcenter  .menuleft li a {
	color: #487a6f;
	font-size: 14px;
	height: 43px;
	line-height: 43px;
	font-weight: bold;
	display: block;
	margin-left: 37px;
	text-align: left;
}

#imgcenter {
	width: 598px;
	height: 310px;
	float: left;
}

#boxcenter .right {
	width: 200px;
	height: 310px;
	float: left;
}

#boxcenter .right  .book_right_button {
	width: 200px;
	height: 210px;
}
/*首页css  */
.boxtitle {
	height: 41px;
	width: 200px;
	text-align: center;
	font-size: 18px;
	background: #487a6f;
	border-radius: 4px 4px 0 0;
	line-height: 41px;
	color: #fff;
	font-family: "Microsoft Yahei";
	margin-top: 0px;
}
/*右方宣传栏  */
.book_new_state {
	width: 200px;
	height: 100px;
}

.box_right_title {
	font-size: 21px;
	margin-top: 0px;
	margin-left: -103px;
}

.book_new_state ul {
	font-size: 12px;
}

.book_new_state ul .li {
	margin-top: -5px;
}

.book_new_state ul li {
	margin-top: 8px;
}

.book_new_state ul li a {
	margin-left: 9px;
	color: #080115;
}

.book_new_state ul li a:hover {
	color: red;
	text-decoration: underline;
}
/* 轮播图2 */
.line4 p {
	margin-left: 5px;
	margin-left: 12px;
}

.line4 .name {
	margin-left: -110px;
	margin-top: 0px;
}

.line4 .star {
	margin-left: -58px;
	margin-top: -13px;
}

.line4 .price {
	margin-left: -90px;
	margin-top: -13px;
}

.line4 .price .num {
	color: red;
}

.line4 .shopping {
	margin-top: -15px;
	margin-left: 110px;
}
/*图书展示  */
#bookshowcenter {
	width: 1000px;
	height: 360px;
}

#bookshowcenter a {
	color: red;
}

#bookshowcenter .booktop {
	width: 1000px;
	height: 180px;
}

#bookshowcenter .booktop .bookleftshow {
	width: 320px;
	height: 180px;
	float: left;
	margin-top: -10px;
	margin-right: 10px;
	border: 1px solid #CDC5BF;
}

#bookshowcenter .booktop .bookleftshow:hover {
	width: 320px;
	height: 180px;
	border: 2px solid #ce1e7f;
}

#bookshowcenter .bookbotton {
	width: 1000px;
	height: 180px;
	margin-top: -10px;
}

#bookshowcenter .bookbotton .bookbottonshow {
	width: 320px;
	height: 178px;
	float: left;
	margin-right: 10px;
	border: 1px solid #CDC5BF;
}

#bookshowcenter .bookbotton .bookbottonshow:hover {
	width: 320px;
	height: 180px;
	border: 2px solid #ce1e7f;
}
/* 上下图片展示 */

/* 上 */
.bookleftshow .img {
	float: left;
}

.bookleftshow .name {
	margin-right: 60px;
	margin-top: 13px;
}

.bookleftshow .star {
	margin-right: 39px;
}

.bookleftshow .price {
	margin-right: 55px;
}

.bookleftshow .price .num {
	color: red;
}

.bookleftshow .shopping {
	margin-right: -97px;
}

/*下  */
.bookbottonshow .img {
	float: left;
}

.bookbottonshow .name {
	margin-right: 45px;
	margin-top: 13px;
}

.bookbottonshow .star {
	margin-right: 39px;
}

.bookbottonshow .price {
	margin-right: 55px;
}

.bookbottonshow .price .num {
	color: red;
}

.bookbottonshow .shopping {
	margin-right: -97px;
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
			<div class="exit"><a href="login.jsp" style="color: #2e09f3;">注销</a></div>
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
				<!--首页图  -->
				<ul class="menuleft">
					<li>
						<h4 class="boxtitle">图书分类</h4>
					</li>
					<li><a href="Child">少年儿童</a></li>
					<li><a href="Literary">文学小说</a></li>
					<li><a href="itbook">IT科技</a></li>
					<li><a href="http://book.dangdang.com">其他类型</a></li>
					<li><a
						href="http://mini.eastday.com/bdmip/180416105150076.html">四季好书</a></li>
					<li><a href="http://www.rs66.com/">成功/ 励志</a></li>
				</ul>
				<div id="imgcenter">
					<div id="myCarousel" class="carousel slide">
						<!-- 轮播（Carousel）指标 -->
						<ol class="carousel-indicators">
							<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
							<li data-target="#myCarousel" data-slide-to="1"></li>
							<li data-target="#myCarousel" data-slide-to="2"></li>
							<li data-target="#myCarousel" data-slide-to="3"></li>
						</ol>
						<!-- 轮播（Carousel）项目 -->
						<div class="carousel-inner">
							<div class="item active">
								<img src="<%=request.getContextPath()%>/img/mainimg/home1.png"
									style="width: 596px; height: 307px;" alt="First slide">
							</div>
							<div class="item">
								<img src="<%=request.getContextPath()%>/img/mainimg/home2.png"
									style="width: 596px; height: 307px;" alt="Second slide">
							</div>
							<div class="item">
								<img src="<%=request.getContextPath()%>/img/mainimg/home3.png"
									style="width: 596px; height: 307px;" alt="Third slide">
							</div>
							<div class="item">
								<img src="<%=request.getContextPath()%>/img/mainimg/home4.png"
									style="width: 596px; height: 307px;" alt="Third slide">
							</div>
						</div>
						<!-- 轮播（Carousel）导航 -->
						<a class="left carousel-control" href="#myCarousel"
							style="border: none;" role="button" data-slide="prev"> <span
							style="margin-top: -9px;"
							class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
							<span class="sr-only">Previous</span>
						</a> <a class="right carousel-control" href="#myCarousel"
							style="border: none;" role="button" data-slide="next"> <span
							class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
							<span class="sr-only">Next</span>
						</a>
					</div>
				</div>
				<ul class="right">
					<!-- 导航栏 -->
					<div class="book_new_state">
						<h2 class="box_right_title" ddt-pit="1">促销专场:</h2>

						<ul class="" ddt-area="5355">
							<li class="li"><a href="#" target="_blank" class=""
								title="618开门红，科技图书每满200减100">开门红，科技图书每满200减100</a></li>

							<li><a href="#">开门红，社科图书每满200减100</a></li>
							<li><a href="#">开门红，文艺图书每满200减100</a></li>
						</ul>
					</div>
					<!--轮播物品图  -->
					<div class="book_right_button">
						<div id="myCarousel-class" class="carousel slide">
							<!-- 轮播（Carousel）指标2 -->
							<ol class="carousel-indicators">
								<li data-target="#myCarousel-class" data-slide-to="0"
									class="active"></li>
								<li data-target="#myCarousel-class" data-slide-to="1"></li>
								<li data-target="#myCarousel-class" data-slide-to="2"></li>
							</ol>
							<!-- 轮播（Carousel）项目2 -->
							<div class="carousel-inner">
								<div class="item active">
									<li class="line4"><a class="img" href="#" target="_blank">
											<img
											src="<%=request.getContextPath()%>/img/mainimg/main.webp"
											style="width: 200px; height: 100px;" alt="增长黑客：如何低成本实现爆发式成长">
									</a>
										<p class="name">
											<a href="#" target="_blank" style="">作者：浩明</a>
										</p>
										<p class="star">
											<span class="title">书名：</span> <span class="level"><span
												style="width: 96.8%;">九鼎记全集1</span></span>
										</p>

										<p class="price">
											<span class="rob"><span class="sign">价格：</span> <span
												class="num">￥56.0</span> </span>
										</p>
										<p class="shopping">
											<a href="#">加入购物车</a>
										</p></li>
								</div>
								<div class="item">
									<li class="line4"><a class="img" href="#" target="_blank">
											<img
											src="<%=request.getContextPath()%>/img/mainimg/main1.webp"
											style="width: 200px; height: 100px;" alt="增长黑客：如何低成本实现爆发式成长">
									</a>
										<p class="name">
											<a href="#" target="_blank" style="">作者：浩明</a>
										</p>
										<p class="star">
											<span class="title">书名：</span> <span class="level"><span
												style="width: 96.8%;">九鼎记全集2</span></span>
										</p>

										<p class="price">
											<span class="rob"><span class="sign">价格：</span> <span
												class="num">￥56.0</span> </span>
										</p>
										<p class="shopping">
											<a href="#">加入购物车</a>
										</p></li>
								</div>
								<div class="item">
									<li class="line4"><a class="img" href="#" target="_blank">
											<img
											src="<%=request.getContextPath()%>/img/mainimg/main2.webp"
											style="width: 200px; height: 100px;" alt="增长黑客：如何低成本实现爆发式成长">
									</a>
										<p class="name">
											<a href="#" target="_blank" style="">作者：浩明</a>
										</p>
										<p class="star">
											<span class="title">书名：</span> <span class="level"><span
												style="width: 96.8%;">九鼎记全集3</span></span>
										</p>

										<p class="price">
											<span class="rob"><span class="sign">价格：</span> <span
												class="num">￥56.0</span> </span>
										</p>
										<p class="shopping">
											<a href="#">加入购物车</a>
										</p></li>
								</div>

							</div>
							<!-- 轮播（Carousel）导航 2-->
							<a class="conteolleft" href="#myCarousel-class" id="leftblanner"
								role="button" data-slide="prev"> <span
								style="margin-left: -4px; margin-top: -14px;"
								class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
								<span class="sr-only">Previous</span>
							</a> <a class="conteolright" href="#myCarousel-class"
								style="margin-left: 154px;" id="rightblanner" role="button"
								data-slide="next"> <span
								class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
								<span class="sr-only">Next</span>
							</a>
						</div>



					</div>

				</ul>

			</div>
			<!--图书展示  -->
			<div id="bookshowcenter">

				<ul class="booktop">

					<li class="bookleftshow">
					<c:forEach items="${listChild}"
							var="lit" begin="15" end="15">
							<a class="img" href="#" target="_blank"> <img
								src="<%=request.getContextPath()%>/img/mainimg/main3.webp"
								style="width: 150px; height: 176px;" alt="增长黑客：如何低成本实现爆发式成长">
							</a>
							<p class="name">
								<a href="#" target="_blank" style="">作者：${lit.bookAuthor }</a>
							</p>
							<p class="star">
								<span class="title">书名：</span> <span class="level"><span
									style="width: 96.8%;">${lit.bookName }</span></span>
							</p>

							<p class="price">
								<span class="rob"><span class="sign">价格：</span> <span
									class="num">￥${lit.bookPrice}</span> </span>
							</p>
							<p class="shopping">
								<a href="adds_lit?bmChildBook.bookId=${lit.bookId }">加入购物车</a>
							</p>
						</c:forEach></li>
					<li class="bookleftshow"><c:forEach items="${listChild}"
							var="lit" begin="18" end="18">
							<a class="img" href="#" target="_blank"> <img
								src="<%=request.getContextPath()%>/img/mainimg/main4.webp"
								style="width: 150px; height: 176px;" alt="增长黑客：如何低成本实现爆发式成长">
							</a>
							<p class="name">
								<a href="#" target="_blank" style="">作者：${lit.bookAuthor }</a>
							</p>
							<p class="star">
								<span class="title">书名：</span> <span class="level"><span
									style="width: 96.8%;">${lit.bookName }</span></span>
							</p>

							<p class="price">
								<span class="rob"><span class="sign">价格：</span> <span
									class="num">￥${lit.bookPrice}</span> </span>
							</p>
							<p class="shopping">
								<a href="adds_lit?bmChildBook.bookId=${lit.bookId }">加入购物车</a>
							</p>
						</c:forEach></li>
					<li class="bookleftshow"><c:forEach items="${listChild}"
							var="lit" begin="20" end="20">
							<a class="img" href="#" target="_blank"> <img
								src="<%=request.getContextPath()%>/img/mainimg/main5.webp"
								style="width: 150px; height: 176px;" alt="增长黑客：如何低成本实现爆发式成长">
							</a>
							<p class="name">
								<a href="#" target="_blank" style="">作者：${lit.bookAuthor }</a>
							</p>
							<p class="star">
								<span class="title">书名：</span> <span class="level"><span
									style="width: 96.8%;">${lit.bookName }</span></span>
							</p>

							<p class="price">
								<span class="rob"><span class="sign">价格：</span> <span
									class="num">￥${lit.bookPrice}</span> </span>
							</p>
							<p class="shopping">
								<a href="adds_lit?bmChildBook.bookId=${lit.bookId }">加入购物车</a>
							</p>
						</c:forEach></li>
				</ul>
				<ul class="bookbotton">
					<c:forEach items="${listLiter}" var="lit" begin="0" end="0">
						<li class="bookbottonshow"><a class="img" href="#"
							target="_blank"> <img
								src="<%=request.getContextPath()%>/img/mainimg/main6.webp"
								style="width: 150px; height: 176px;" alt="增长黑客：如何低成本实现爆发式成长">
						</a>
							<p class="name">
								<a href="#" target="_blank" style="">作者：${lit.bookAuthor }</a>
							</p>
							<p class="star">
								<span class="title">书名：</span> <span class="level"><span
									style="width: 96.8%;">${lit.bookName }</span></span>
							</p>

							<p class="price">
								<span class="rob"><span class="sign">价格：</span> <span
									class="num">￥${lit.bookPrice}</span> </span>
							</p>
							<p class="shopping">
								<a href="adds_lit?bmChildBook.bookId=${lit.bookId }">加入购物车</a>
							</p>
					</c:forEach>

					</li>

					<li class="bookbottonshow"><c:forEach items="${listLiter}"
							var="lit" begin="10" end="10">
							<a class="img" href="#" target="_blank"> <img
								src="<%=request.getContextPath()%>/img/mainimg/main7.webp"
								style="width: 150px; height: 176px;" alt="增长黑客：如何低成本实现爆发式成长">
							</a>
							<p class="name">
								<a href="#" target="_blank" style="">作者：${lit.bookAuthor }</a>
							</p>
							<p class="star">
								<span class="title">书名：</span> <span class="level"><span
									style="width: 96.8%;">${lit.bookName }</span></span>
							</p>

							<p class="price">
								<span class="rob"><span class="sign">价格：</span> <span
									class="num">￥${lit.bookPrice}</span> </span>
							</p>
							<p class="shopping">
								<a href="adds_lit?bmChildBook.bookId=${lit.bookId }">加入购物车</a>
							</p>
						</c:forEach></li>

					<li class="bookbottonshow"><c:forEach items="${listLiter}"
							var="lit" begin="13" end="13">

							<a class="img" href="#" target="_blank"> <img
								src="<%=request.getContextPath()%>/img/mainimg/main8.webp"
								style="width: 150px; height: 176px;" alt="增长黑客：如何低成本实现爆发式成长">
							</a>
							<p class="name">
								<a href="#" target="_blank" style="">作者：${lit.bookAuthor}</a>
							</p>
							<p class="star">
								<span class="title">书名：</span> <span class="level"><span
									style="width: 96.8%;">${lit.bookName }</span></span>
							</p>

							<p class="price">
								<span class="rob"><span class="sign">价格：</span> <span
									class="num">￥${lit.bookPrice}</span> </span>
							</p>
							<p class="shopping">
								<a href="adds_lit?bmChildBook.bookId=${lit.bookId }">加入购物车</a>
							</p>
						</c:forEach></li>


				</ul>
			</div>
		</div>
		<div id="button">
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