<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/pages/include/taglib.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>主界面</title>
<%@ include file="/WEB-INF/pages/include/head.jsp"%>
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/jsAndCss/mycss/booksysmaincrud.css"
	type="text/css" />
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

#right {
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

/*添加管理  */
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

h3 {
	font-size: 24px;
	background-color: #acbdad;
	width: 178px;
	height: 30px;
	float: right;
	margin-top: -30px;
}

.h1, h1 {
	font-size: 36px;
	text-align: left;
}

#titlebook {
	
}

#right #submit {
	margin-left: 1160px;
	float: left;
	margin-top: -35px;
}

h4 {
	font-size: 24px;
	background-color: #acbdad;
	width: 178px;
	height: 30px;
	margin-top: -38px;
}
</style>
</head>
<body>
	<div class="top">
		<h1>校园图书商城系统</h1>
<a href="login.jsp" style="float: right;margin-top:-34px;color:#fff" class="btn btn-danger" onclick="javascript:return exit()">退出系统</a>
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
	<div id="right">
		<h1 id="titlebook">
			<li class="btn btn-info"><span style="font-size: 30px"
				class="glyphicon glyphicon-home">用户管理</span></li>
		</h1>
		<h3>用户添加</h3>
		<c:if test="${adduser==1 }">
			<form action="bm_useradd" method="post"
				class="table table-striped table-bordered table-hover">
				<input type="text" style="width: 300px; margin: auto;"
					class="form-control" placeholder="请输入用户名：" id="loginName"
					name="bmuser.loginName" value="" /><br /> <input type="text"
					style="width: 300px; margin: auto;" class="form-control"
					placeholder="请输入密码：" id="password" name="bmuser.password" value="" /><br />
				<input type="text" style="width: 300px; margin: auto;"
					class="form-control" placeholder="请输入姓名：" id="bmusername"
					name="bmuser.name" value="" /><br /> <input type="text"
					style="width: 300px; margin: auto;" class="form-control"
					placeholder="请输入学生编号：" id="serialnumber" name="bmuser.serialnumber"
					value="" /><br />
				<div type="text" style="width: 300px; margin: auto;">
					<input id="input7" type="radio" name="bmuser.sex" value="2"
						checked="checked" />男 <input type="radio" name="bmuser.sex"
						value="1" />女
				</div>
				<br /> <input type="text" style="width: 300px; margin: auto;"
					class="form-control" placeholder="请输入年龄：" id="age"
					name="bmuser.age" value="" /><br /> <input type="text"
					style="width: 300px; margin: auto;" class="form-control"
					placeholder="请输入学校：" id="school" name="bmuser.school" value="" /><br />
				<input type="text" style="width: 300px; margin: auto;"
					class="form-control" placeholder="请输入邮箱：" id="email"
					name="bmuser.email" value="" /><br /> <input type="text"
					style="width: 300px; margin: auto;" class="form-control"
					placeholder="请输入电话：" id="phone" name="bmuser.phone" value="" /><br />
				<input type="text" style="width: 300px; margin: auto;"
					class="form-control" placeholder="请输入手机号：" id="mobile"
					name="bmuser.mobile" value="" /><br /> <input type="submit"
					class="btn btn-danger" id="submit" value="提交" />
			</form>
			<h4>
				<a href="usermain">返回用户列表</a>
			</h4>
		</c:if>


	</div>



	<!-- onclick="return validate()" -->

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
								$(this).next("div").slideToggle("slow")
										.siblings(".div3:visible").slideUp(
												"slow");
							});

				});
		setInterval("cg.innerHTML=new Date().toLocaleString()", 1000);
		/* function validate() {
			
			 var bookId=document.getElementById("bookId").value;
			var bookName=document.getElementById("bookName").value;
			var bookAuthor=document.getElementById("bookAuthor").value;
			var bookRepertory=document.getElementById("bookRepertory").value;
			var bookPrice=document.getElementById("bookPrice").value;
			var bookPress=document.getElementById("bookPress").value;
			var bookAddres=document.getElementById("bookAddres").value;
			if(bookId=="" && bookName=="" && bookAuthor=="" && bookRepertory=="" && bookPrice=="" && bookPress=="" && bookAddres==""){
				alert("还有输入框未输入值");
					return false;
			}else{
					
					return true;
			}
		 }
		 */
		 function exit(){
				var hint = "你确定退出当前系统吗？";
				if (confirm(hint) == true) {
					return true;
				} else {
					return false;
				}
			}
		var liDoms = document.querySelectorAll("#lists li");
		var tabDoms = document.querySelectorAll("#user div");
		var index = 0;
		// 给每个li 绑定事件
		for (var i = 0; i < liDoms.length; i++) {
			// 给个标记
			liDoms[i].pig = i;
			liDoms[i].onclick = function() {
				// 让相对应的tab显示  你要知道的是你点的是哪一个liDoms

				tabDoms[index].className = '';
				liDoms[index].className = '';
				// 保存上一次 索引
				index = this.pig;
				tabDoms[this.pig].className = 'active';
				this.className = 'li1';
			}
		}
	</script>
</body>
</html>