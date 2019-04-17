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

#box #top .name {
	width: 190px;
	height: 30px;
	float: right;
	text-align: left;
	line-height: 30px;
	font-size: 20px;
	font-weight: bold;
}
#box #top .exit{
	float: left;
	text-decoration: none;
   margin-top:10px;
    color: #000;
    margin-left: 14px;
    font-size: 20px;
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
/* 留言框 */
#boxcenter {
	width: 1000px;
	height: 200px;
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

#messagenew {
	width: 1000px;
	height: 500px;
}
/*显示留言记录  */
#messagenew #user {
	width: 100px;
	text-align: left;
	font-size: 29px;
}

#messagenew #message {
	width: 400px;
	text-align: left;
}

#messagenew #messagetime {
	width: 300px;
	text-align: left;
}

#messagenew #messagetime p span {
	color: #2f0aea;
	font-weight: bold;
	font-size: 15px;
}
#messagenew #messagetime p  a{
color:red;
}
#messagenew #user h5 {
	font-size: 20px;
	font-weight: bold;
}

#messagenew #user h5 a {
	color: red;
}
#messagenew h6{font-size: 14px;
    font-weight: bold;
    text-align: right;}
#messagenew h6 a{color:#000;}
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
				<!--留言发表  -->
				<form action="add_ags" method="post">
					<div class="form-group" style="width: 100%; height: 30px;">
						<label for="name"
							style="margin-right: -24%; font-size: 30px; color: #0b4ce4;">留言框</label>
						<textarea class="form-control"
							style="width: 400px; margin-left: 57%;" rows="3"
							placeholder="请输入留言（30字以内）" maxlength="30"
							name="bmLeaveWord.leaveword" cols="10"></textarea>
						<input type="submit" style="margin-left: 88%; margin-top: 10px;"
							class="btn btn-danger" value="提交">
					</div>
				</form>


			</div>
			<!--留言显示最新的5条记录  -->
			<c:if test="${empty messagelist}"><h1 style="color:red;">您暂时没有留言记录</h1></c:if>
			<c:if test="${!empty messagelist}">
			<div id="messagenew">
				<c:forEach items="${messagelist}" var="mess" begin="0" end="2">
					<div id="user">
						<h5>
							用户：<a href="#">${mess.loginName}</a>
						</h5>
					</div>
					<div id="message">${mess.leaveword }</div>

					<div id="messagetime">
						<p>
							<span>时间：${mess.leavewordTime }</span> <a href="#">回复</a>
						</p>
					</div>
				</c:forEach>
				<h6 style="font-size: 15px; font-weight: bold;">
							<th style="text-align: center;"><a 
								href="message?page=1"><<首页>></a></th>
							<th style="text-align: center;"><c:if test="${page-1>=1 }">
									<a  href="message?page=${page-1 }">上一页</a>
								</c:if></th>
							<th style="text-align: center;"><a>当前第${page}页</a></th>
							<th style="text-align: center;"><c:if
									test="${maxpage>page }">
									<a  href="message?page=${page+1 }">下一页</a>
								</c:if></th>
							<th style="text-align: center;"><a 
								href="message?page=${maxpage}"><<尾页>></a></th>


						</h6>
			</div>
			</c:if>
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