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

ul, li {
	list-style: none;
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

#user #titlebook {
	font-size: 30px;
	margin-left: 0px;
	width: 120px;
	width: 155px;
	margin-top: 0px;
}

#user .boxBank {
	width: 151px;
	float: left;
	height: 47px;
	margin-top: -55px;
	/* border: 1px solid red; */
	line-height: 50px;
	margin-left: 176px;
	text-decoration: underline;
	font-size: 16px;
	text-align: left;
}

#user .boxBank a {
	color: red;
	font-weight: bold;
	margin-left: 15px;
}

#user .book {
	background-color: red;
}

h2 {
	margin-left: 600px;
	margin-top: -42px;
}

#adminbox{
width: 600px;
    height: 544px;
    margin: auto;
}
#adminbox #userbox{
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
	
	<div class="right">
		<div id="user">
			<div class="active">
				<h1 id="titlebook">
					<li class="btn btn-info"><span style="font-size: 30px"
						class="glyphicon glyphicon-home">管理员信息</span></li>
				</h1>
				<c:forEach items="${adminme}" var="ad">
					<form action="amdin_update?bmAdmin.id=${ad.id }" class="table table-striped table-bordered table-hover" method="post" id="adminbox">
						<div  class="form-group" style="width: 600px;margin-top: 30px;">
							<label for="" style="    height: 34px;float: left;line-height: 34px; margin-left: 200px;">用户名：</label>
							<input type="text" class="form-control" name="bmAdmin.loginName" value="${ad.loginName }" style="width: 200px;"/>
						</div><br/>
						<div  class="form-group" style="width: 600px;margin-top: 55px;">
							<label for="" style="line-height: 34px;float: left;margin-left: 188px;">真实姓名：</label>
							<input type="text" class="form-control" name="bmAdmin.name" value="${ad.name }" style="width: 200px;"/>
						</div><br/>
						<div  class="form-group" style="width: 600px;margin-top: 80px;">
							<label for="" style="line-height: 34px;float: left;margin-left:175px;">管理员编号：</label>
							<input type="text" class="form-control" name="bmAdmin.serialnumber" value="${ad.serialnumber }" style="width: 200px;"/>
						</div><br/>
						<div  class="form-group" style="width: 600px;margin-top: 103px;">
							<label for="" style="line-height: 34px;float: left;margin-left: 217px;">邮箱：</label>
							<input type="text" class="form-control" name="bmAdmin.email" value="${ad.email }" style="width: 200px;"/>
						</div><br/>
						<div  class="form-group" style="width: 600px;margin-top: 130px;">
							<label for="" style="line-height: 34px;float: left;margin-left: 206px;">手机号：</label>
							<input type="text" class="form-control" name="bmAdmin.mobile" value="${ad.mobile }" style="width: 200px;"/>
						</div><br/>
						<div  class="form-group">
							<input type="submit" class="btn btn-danger" style="margin-left: 496px;margin-top: 300px;" value="编辑">
						</div>
					
					</form>
				</c:forEach>
				
			
			</div>

		</div>

	</div>
	<div style="text-align: center; margin: 50px 0;">
		<p class="links" style="margin-top: 10px;">
			<a href="#">关于我们</a><span>|</span> <a href="#">联系我们</a><span>|</span>
			<a href="#">联系客服</a><span>|</span> <a
				href="http://www.baidu.com">合作招商</a><span>|</span> <a
				href="#">商家帮助</a><span>|</span> <a href="#">营销中心</a><span>|</span>
			<a href="#">图书管理</a><span>|</span> <a href="#">友情链接</a><span>|</span>
			<a href="#">销售联盟</a><span>|</span> <a href="#">图书社区</a><span>|</span>
			<a href="#">风险监测</a><span>|</span> <a href="#">隐私政策</a><span>|</span>
			<a href="#">图书公益</a><span>|</span> <a href="#">English
				Site</a><span>|</span> <a href="#">Media &amp; IR</a>
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

		function del() {
			var hint = "你确定要删除吗？";
			if (confirm(hint) == true) {
				return true;
			} else {
				return false;
			}
		}
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