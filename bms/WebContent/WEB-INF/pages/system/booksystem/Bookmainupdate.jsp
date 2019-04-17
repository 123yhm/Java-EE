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
	background: url(img/8.png);
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

h3 {
	font-size: 24px;
	width: 187px;
	height: 40px;
	line-height: 40px;
	background-color: #e4d3d3;
}

#submit {
	margin-left: 580px;
}
</style>
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
<div class="right">
	<h1 id="titlebook">
		<li class="btn btn-info"><span style="font-size: 30px"
			class="glyphicon glyphicon-home">图书管理</span></li>

	</h1>
	<h3>图书修改</h3>
	<c:if test="${!empty updatebook }">
		<form action="bm_updates" method="post" class="form-inline"
			style="font-size: 27px;"
			class="table table-striped table-bordered table-hover">
			<c:forEach items="${updatebook}" var="up">
				<input type="hidden" placeholder="请输入书本编号：" id="bookId"
					name="bmLiteraryBook.bookId" value="${up.bookId }" />
				<br />
				<div class="form-group" style="margin-left: 200px">
					<label for="">书本编号：</label><input type="text" style="width: 300px;"
						class="form-control" placeholder="请输入书本编号：" id="bookIsbn"
						name="bmLiteraryBook.bookIsbn" value="${up.bookIsbn }" />
				</div>
				<br />
				<div class="form-group" style="margin-left: 200px">
					<label for="">书本名称：</label><input type="text" style="width: 300px;"
						class="form-control" placeholder="请输入书本名称：" id="bookName"
						name="bmLiteraryBook.bookName" value="${up.bookName }" />
				</div>
				<br />
				<div class="form-group" style="margin-left: 200px">
					<label for="">书本作者：</label><input type="text" style="width: 300px;"
						class="form-control" placeholder="请输入书本作者：" id="bookAuthor"
						name="bmLiteraryBook.bookAuthor" value="${up.bookAuthor }" />
				</div>
				<br />
				<div class="form-group" style="margin-left: 200px">
					<label for="">书本数量：</label><input type="text" style="width: 300px;"
						class="form-control" placeholder="请输入书本数量：" id="bookRepertory"
						name="bmLiteraryBook.bookRepertory" value="${up.bookRepertory }" />
				</div>
				<br />
				<div class="form-group" style="margin-left: 200px">
					<label for="">书本价格：</label><input type="text" style="width: 300px;"
						class="form-control" placeholder="请输入书本价格：" id="bookPrice"
						name="bmLiteraryBook.bookPrice" value="${up.bookPrice }" />
				</div>
				<br />
				<div class="form-group" style="margin-left: 200px">
					<label for="">书本出版社:</label><input type="text"
						style="width: 300px;" class="form-control" placeholder="请输入书本出版社："
						id="bookPress" name="bmLiteraryBook.bookPress"
						value="${up.bookPress }" />
				</div>
				<br />
				<div class="form-group" style="margin-left: 200px">
					<label for="">书本地址：</label><input type="text" style="width: 300px;"
						class="form-control" placeholder="请输入书本地址：" id="bookAddres"
						name="bmLiteraryBook.bookAddres" value="${up.bookAddres }" />
				</div>
				<br />

			</c:forEach>

			<input type="submit" class="btn btn-danger" id="submit" value="提交" />
		</form>
		<h3>
			<a href="bookshow">返回图书列表</a>
		</h3>
	</c:if>
	<c:if test="${!empty updateChild }">
		<form action="bm_updatesChild" method="post" class="form-inline"
			style="font-size: 27px;"
			class="table table-striped table-bordered table-hover">
			<c:forEach items="${updateChild}" var="up">
				<input type="hidden" placeholder="请输入书本编号：" id="bookId"
					name="bmChildBook.bookId" value="${up.bookId }" />
				<br />
				<div class="form-group" style="margin-left: 200px">
					<label for="">书本编号：</label><input type="text" style="width: 300px;"
						class="form-control" placeholder="请输入书本编号：" id="bookIsbn"
						name="bmChildBook.bookIsbn" value="${up.bookIsbn }" />
				</div>
				<br />
				<div class="form-group" style="margin-left: 200px">
					<label for="">书本名称：</label><input type="text" style="width: 300px;"
						class="form-control" placeholder="请输入书本名称：" id="bookName"
						name="bmChildBook.bookName" value="${up.bookName }" />
				</div>
				<br />
				<div class="form-group" style="margin-left: 200px">
					<label for="">书本作者：</label><input type="text" style="width: 300px;"
						class="form-control" placeholder="请输入书本作者：" id="bookAuthor"
						name="bmChildBook.bookAuthor" value="${up.bookAuthor }" />
				</div>
				<br />
				<div class="form-group" style="margin-left: 200px">
					<label for="">书本数量：</label><input type="text" style="width: 300px;"
						class="form-control" placeholder="请输入书本数量：" id="bookRepertory"
						name="bmChildBook.bookRepertory" value="${up.bookRepertory }" />
				</div>
				<br />
				<div class="form-group" style="margin-left: 200px">
					<label for="">书本价格：</label><input type="text" style="width: 300px;"
						class="form-control" placeholder="请输入书本价格：" id="bookPrice"
						name="bmChildBook.bookPrice" value="${up.bookPrice }" />
				</div>
				<br />
				<div class="form-group" style="margin-left: 200px">
					<label for="">书本出版社:</label><input type="text"
						style="width: 300px;" class="form-control" placeholder="请输入书本出版社："
						id="bookPress" name="bmChildBook.bookPress"
						value="${up.bookPress }" />
				</div>
				<br />
				<div class="form-group" style="margin-left: 200px">
					<label for="">书本地址：</label><input type="text" style="width: 300px;"
						class="form-control" placeholder="请输入书本地址：" id="bookAddres"
						name="bmChildBook.bookAddres" value="${up.bookAddres }" />
				</div>
				<br />

			</c:forEach>

			<input type="submit" class="btn btn-danger" id="submit" value="提交" />
		</form>
		<h3>
			<a href="bookshowtwo">返回图书列表</a>
		</h3>
	</c:if>
	<c:if test="${!empty updateIt }">
		<form action="bm_updatesIt" method="post" class="form-inline"
			style="font-size: 27px;"
			class="table table-striped table-bordered table-hover">
			<c:forEach items="${updateIt}" var="up">
				<input type="hidden" placeholder="请输入书本编号：" id="bookId"
					name="bmItBook.bookId" value="${up.bookId }" />
				<br />
				<div class="form-group" style="margin-left: 200px">
					<label for="">书本编号：</label><input type="text" style="width: 300px;"
						class="form-control" placeholder="请输入书本编号：" id="bookIsbn"
						name="bmItBook.bookIsbn" value="${up.bookIsbn }" />
				</div>
				<br />
				<div class="form-group" style="margin-left: 200px">
					<label for="">书本名称：</label><input type="text" style="width: 300px;"
						class="form-control" placeholder="请输入书本名称：" id="bookName"
						name="bmItBook.bookName" value="${up.bookName }" />
				</div>
				<br />
				<div class="form-group" style="margin-left: 200px">
					<label for="">书本作者：</label><input type="text" style="width: 300px;"
						class="form-control" placeholder="请输入书本作者：" id="bookAuthor"
						name="bmItBook.bookAuthor" value="${up.bookAuthor }" />
				</div>
				<br />
				<div class="form-group" style="margin-left: 200px">
					<label for="">书本数量：</label><input type="text" style="width: 300px;"
						class="form-control" placeholder="请输入书本数量：" id="bookRepertory"
						name="bmItBook.bookRepertory" value="${up.bookRepertory }" />
				</div>
				<br />
				<div class="form-group" style="margin-left: 200px">
					<label for="">书本价格：</label><input type="text" style="width: 300px;"
						class="form-control" placeholder="请输入书本价格：" id="bookPrice"
						name="bmItBook.bookPrice" value="${up.bookPrice }" />
				</div>
				<br />
				<div class="form-group" style="margin-left: 200px">
					<label for="">书本出版社:</label><input type="text"
						style="width: 300px;" class="form-control" placeholder="请输入书本出版社："
						id="bookPress" name="bmItBook.bookPress" value="${up.bookPress }" />
				</div>
				<br />
				<div class="form-group" style="margin-left: 200px">
					<label for="">书本地址：</label><input type="text" style="width: 300px;"
						class="form-control" placeholder="请输入书本地址：" id="bookAddres"
						name="bmItBook.bookAddres" value="${up.bookAddres }" />
				</div>
				<br />

			</c:forEach>

			<input type="submit" class="btn btn-danger" id="submit" value="提交" />
		</form>
		<h3>
			<a href="bookshowthree">返回图书列表</a>
		</h3>
	</c:if>



</div>
<!-- onclick="return validate()" -->
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
	$(document).ready(
			function() {//导航栏点击事件
				$(".div2").click(
						function() {
							$(this).next("div").slideToggle("slow").siblings(
									".div3:visible").slideUp("slow");
						});

			});
	function exit(){
		var hint = "你确定退出当前系统吗？";
		if (confirm(hint) == true) {
			return true;
		} else {
			return false;
		}
	}
	setInterval("cg.innerHTML=new Date().toLocaleString()", 1000);
</script>
</body>
</html>