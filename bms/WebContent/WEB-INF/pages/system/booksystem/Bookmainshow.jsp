<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/pages/include/taglib.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>主界面</title>
<%@ include file="/WEB-INF/pages/include/head.jsp"%>
<style type="text/css">
a {
	color: red;
}

body {
	margin: 0;
	font-family: 微软雅黑;
}

.top {
	width: 100%;
	height: 100px;
	border: 1px solid red;
}

.left {
	width: 200px;
	height: 600px;
	border: 1px solid #F00;
	color: #000000;
	font-size: 14px;
	text-align: center;
	float: left;
}

.div1 {
	text-align: center;
	width: 200px;
	padding-top: 10px;
}

.div2 {
	height: 40px;
	line-height: 40px;
	cursor: pointer;
	font-size: 13px;
	position: relative;
	border-bottom: #ccc 1px dotted;
}

.jbsz {
	position: absolute;
	height: 20px;
	width: 20px;
	left: 40px;
	top: 10px;
	background: url(img/systemimg/1.png);
}

.xwzx {
	position: absolute;
	height: 20px;
	width: 20px;
	left: 40px;
	top: 10px;
	background: url(img/systemimg/2.png);
}

.zxcp {
	position: absolute;
	height: 20px;
	width: 20px;
	left: 40px;
	top: 10px;
	background: url(img/systemimg/4.png);
}

.lmtj {
	position: absolute;
	height: 20px;
	width: 20px;
	left: 40px;
	top: 10px;
	background: url(img/systemimg/8.png);
}

.hm {
	position: absolute;
	height: 20px;
	width: 20px;
	left: 40px;
	top: 10px;
	background: url(img/systemimg/8.png);
}

.div3 {
	display: none;
	cursor: pointer;
	font-size: 13px;
}

.div3 ul {
	margin: 0;
	padding: 0;
}

.div3 li {
	height: 30px;
	line-height: 30px;
	list-style: none;
	border-bottom: #ccc 1px dotted;
	text-align: center;
}

.right {
	margin-left: 200px;
	height: 600px;
	width: 89.5%;
	border: 1px solid red;
}

#user div {
	height: 100%;
	width: 89%;
	display: none;
	position: absolute;
}

#user div.active {
	display: block;
}
/*图书管理  */
#cg {
	color: red;
}

#time {
	width: 325px;
	float: right;
	height: 30px;
	text-align: left;
	line-height: 30px;
	font-size: 20px;
	font-weight: bold;
}

#name {
	width: 190px;
	height: 30px;
	float: right;
	text-align: left;
	line-height: 30px;
	font-size: 20px;
	font-weight: bold;
}

#name span {
	color: red;
}

#titlebook {
	font-size: 30px;
	margin-left: 0px;
	width: 120px;
	width: 155px;
	margin-top: 0px;
}

#bookbox {
	margin: 0px auto;
}

h2 {
	font-size: 24px;
	width: 200px;
	height: 40px;
	line-height: 40px;
	background-color: #e4d3d3;
}

h3 {
	font-size: 24px;
	width: 100%;
	line-height: 40px;
	background-color: #e4d3d3;
	margin-right: 3px;
	text-align: center;
}
</style>
</head>


<body>
	<div class="top">
		<h1>校园图书商城系统</h1>
<a href="login.jsp" style="float: right;margin-top:-60px;color:#fff" class="btn btn-danger" onclick="javascript:return exit()">退出系统</a>
		<div id="time">
			当前时间:<span id="cg">0000-00-00 上午00:00:00</span>
		</div>
		<div id="name">
			用户名:<span>${loginname}</span>
		</div>


	</div>
	<div class="left">
		<div class="div1">
			<div class="left_top">
				<img src="<%=request.getContextPath()%>/img/systemimg/bbb_01.jpg"> <img
					src="<%=request.getContextPath()%>/img/systemimg/bbb_02.jpg" id="2"> <img
					src="<%=request.getContextPath()%>/img/systemimg/bbb_03.jpg"> <img
					src="<%=request.getContextPath()%>/img/systemimg/bbb_04.jpg">
			</div>

			<div class="div2">
				<div class="jbsz"></div>
				用户管理
			</div>
			<div class="div3">
				<ul>
					<li><a href="usermain">用户显示</a></li>
					<li><a href="bm_addUser">用户添加</a></li>
				</ul>

			</div>
			<div class="div2">
				<div class="xwzx"></div>
				图书管理
			</div>
			<div class="div3">
				<ul id="lists">
					<li class="li1"><a href="bookshow">图书管理</a></li>
					<li><a href="bookbank">图书分类</a></li>
				</ul>
			</div>
			<div class="div2">
				<div class="zxcp"></div>
				留言管理
			</div>
			<div class="div3">
				<ul>
					<li><a href="messagex">留言显示</a></li>

				</ul>
			</div>
			<div class="div2">
				<div class="lmtj"></div>
				管理员管理
			</div>
			<div class="div3">
				<ul>
					<li><a href="adminmess">管理员信息</a></li>
					<li><a href="#">添加管理员</a></li>
					<li><a href="#">管理员权限</a></li>
				</ul>
			</div>
		</div>
		<div class="div2">
			<div class="hm"></div>
			用户购书管理
		</div>
		<div class="div3">
			<ul>
				<li><a href="userBokk">用户购书记录</a></li>
			</ul>
		</div>
	</div>
	</div>
	</div>

	<div class="right">


		<h1 id="titlebook">
			<li class="btn btn-info"><span style="font-size: 30px"
				class="glyphicon glyphicon-home">图书管理</span></li>


		</h1>
		<h2>详细信息</h2>

		<table id="bookbox" cellpadding="0px" cellspacing="0px"
			class="table table-striped table-bordered table-hover">
			<c:if test="${!empty showbook }">
				<c:forEach items="${showbook }" var="emp" varStatus="status">

					<tr>
						<td>书编:</td>
						<th>${emp.bookIsbn }</th>

					</tr>
					<tr>
						<td>作者:</td>
						<th>${emp.bookAuthor }</th>
					</tr>
					<tr>
						<td>书名:</td>
						<th>${emp.bookName }</th>
					</tr>
					<tr>
						<td>库存:</td>
						<th>${emp.bookRepertory }</th>
					</tr>
					<tr>
						<td>价格:</td>
						<th style="color: red">￥${emp.bookPrice }</th>
					</tr>
					<tr>
						<td>投书时间:</td>
						<th>${emp.bookTime }</th>
					</tr>
					<tr>
						<td>出版社:</td>
						<th>${emp.bookPress }</th>
					</tr>
					<tr>
						<td>地点:</td>
						<th>${emp.bookAddres }</th>
					</tr>
				</c:forEach>
				<h3>
					<a href="bookshow">返回图书列表</a>
				</h3>

			</c:if>
			<!--表二  -->
			<c:if test="${!empty Childbook }">
				<c:forEach items="${Childbook }" var="emp" varStatus="status">

					<tr>
						<td>书编:</td>
						<th>${emp.bookIsbn }</th>

					</tr>
					<tr>
						<td>作者:</td>
						<th>${emp.bookAuthor }</th>
					</tr>
					<tr>
						<td>书名:</td>
						<th>${emp.bookName }</th>
					</tr>
					<tr>
						<td>库存:</td>
						<th>${emp.bookRepertory }</th>
					</tr>
					<tr>
						<td>价格:</td>
						<th style="color: red">￥${emp.bookPrice }</th>
					</tr>
					<tr>
						<td>投书时间:</td>
						<th>${emp.bookTime }</th>
					</tr>
					<tr>
						<td>出版社:</td>
						<th>${emp.bookPress }</th>
					</tr>
					<tr>
						<td>地点:</td>
						<th>${emp.bookAddres }</th>
					</tr>
				</c:forEach>
				<h3>
					<a href="bookshowtwo">返回图书列表</a>
				</h3>

			</c:if>
			<!--表三 -->
			<c:if test="${!empty Itbook }">
				<c:forEach items="${Itbook }" var="emp" varStatus="status">

					<tr>
						<td>书编:</td>
						<th>${emp.bookIsbn }</th>

					</tr>
					<tr>
						<td>作者:</td>
						<th>${emp.bookAuthor }</th>
					</tr>
					<tr>
						<td>书名:</td>
						<th>${emp.bookName }</th>
					</tr>
					<tr>
						<td>库存:</td>
						<th>${emp.bookRepertory }</th>
					</tr>
					<tr>
						<td>价格:</td>
						<th style="color: red">￥${emp.bookPrice }</th>
					</tr>
					<tr>
						<td>投书时间:</td>
						<th>${emp.bookTime }</th>
					</tr>
					<tr>
						<td>出版社:</td>
						<th>${emp.bookPress }</th>
					</tr>
					<tr>
						<td>地点:</td>
						<th>${emp.bookAddres }</th>
					</tr>
				</c:forEach>
				<h3>
					<a href="bookshowthree">返回图书列表</a>
				</h3>

			</c:if>
		</table>
	</div>



	<div
		style="text-align: center; margin: 50px 0; font: normal 14px/24px 'MicroSoft YaHei';">
		<p class="links" style="margin-top: 10px;">
			<a href="" target="_blank">关于我们</a><span class="mod_copyright_split">|</span>
			<a href="" target="_blank">联系我们</a><span class="mod_copyright_split">|</span>
			<a href="#" target="_blank">联系客服</a><span class="mod_copyright_split">|</span>
			<a href="http://www.baidu.com">合作招商</a><span
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
			href="http://ww.baidu.com">校园图书系统</a> 版权所有2018-2018 YHM
			AllRightsReserved <img alt=""
			src="<%=request.getContextPath()%>/img/bodyimg/g.png"
			style="width: 100px; height: 100px;">
		</span>
	</div>
	<script type="text/javascript"
		src="<%=request.getContextPath()%>/jsAndCss/js/jquery.js"></script>
	<script type="text/javascript">
	function exit(){
		var hint = "你确定退出当前系统吗？";
		if (confirm(hint) == true) {
			return true;
		} else {
			return false;
		}
	}
		$(document).ready(
				function() {//导航栏点击事件
					$(".div2").click(
							function() {
								$(this).next("div").slideToggle("slow")
										.siblings(".div3:visible").slideUp(
												"slow");
							});

				});
		setInterval("cg.innerHTML=new Date().toLocaleString()", 1000);
	</script>
</body>
</html>