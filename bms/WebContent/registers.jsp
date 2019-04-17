 <%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册页面</title>
<style type="text/css">

a {
	text-decoration: none;
	color: #333;
}

ul, li {
	list-style: none;
}

body {
	font-size: 14px;
	font-family: "微软雅黑";
	background-image:url("<%=request.getContextPath() %>/img/engi/engi.jpg");
	width: 1300px;
	font-weight: bold;
}

#box {
	width: 800px;
	height: 800px;
	color: #07f111;
	margin: 100px auto;
	background-image: url("<%=request.getContextPath() %>/img/engi/engi2.gif");
}

#box .box2 {
	width: 700px;
	height: 30px;
	margin: 17px 10px 18px 207px;
}

#box .box2 .decorate {
	line-height: 30px;
	height: 30px;
	width: 200px;
}

h1 {
	text-align: center;
	color: #e6b05b;
	font-size: 30px;
}

#boxa {
	color: #F00;
}

#input5 {
	color: #F00;
}

#box .e0 {
	width: 100px;
	height: 30px;
	float: left;
	line-height: 30px;
}

#box .e1 {
	width: 200px;
	height: 30px;
	float: left;
	line-height: 30px;
}

#box .e2 {
	width: 300px;
	height: 30px;
	float: left;
	line-height: 30px;
	margin-left: 30px;
}

#box .boxs {
	width: 800px;
	height: 50px;

}

#input2 {
	width: 200px;
	height: 50px;
	margin-left: 555px;
	line-height: 50px;
	background: #999;
	color: #F00;
	font-weight: 800;
}

#tip {
	background: rgba(0, 0, 0, .8);
	width: 130px;
	height: 40px;
	line-height: 40px;
	color: #fff;
	font-size: 14px;
	text-align: center;
	position: absolute;
	top: 40%;
	left: 50%;
	margin-top: -20px;
	margin-left: -52px;
	z-index: -1;
	opacity: 0;
	transition: opacity .5s, top .5s;
}

#tip.show {
	top: 50%;
	z-index: 1;
	opacity: 1;
}

#tip1 {
	background: rgba(0, 0, 0, .8);
	width: 130px;
	height: 40px;
	line-height: 40px;
	color: #fff;
	font-size: 14px;
	text-align: center;
	position: absolute;
	top: 40%;
	left: 50%;
	margin-top: -20px;
	margin-left: -52px;
	z-index: -1;
	opacity: 0;
	transition: opacity .5s, top .5s;
}

#tip1.show {
	top: 50%;
	z-index: 1;
	opacity: 1;
}

#tip2 {
	background: rgba(0, 0, 0, .8);
	width: 130px;
	height: 40px;
	line-height: 40px;
	color: #fff;
	font-size: 14px;
	text-align: center;
	position: absolute;
	top: 40%;
	left: 50%;
	margin-top: -20px;
	margin-left: -52px;
	z-index: -1;
	opacity: 0;
	transition: opacity .5s, top .5s;
}

#tip2.show {
	top: 50%;
	z-index: 1;
	opacity: 1;
}

#box .titlename {
	width: 100px;
	height: 50px;
	margin-left: 0px;
	float: left;
	background-color: chartreuse;
	line-height: 50px;
}

#loginpage {
	width: 100px;
	height: 50px;
	line-height: 50px;
	background: azure;
	font-weight: bold;
}
</style>

</head>
<body >
	<center>
		<div id="box">
			<h1>账号注册</h1>
			<form action="engi" method="post">
				<div class="box2">
					<div class="e0">用户名:</div>
					<div class="e1">
						<input class="decorate" id="input1" type="text" size="20"
							name="bmuser.loginName" placeholder="请输入用户名" onBlur="show1()"
							onFocus="func()" />
					</div>
					<div class="e2">
						<li id="boxa1">请输入汉字或字母</li>
					</div>

				</div>

				<div class="box2">
					<div class="e0">密码:</div>
					<div class="e1">
						<input type="password" maxlength="16" size="20"
							class="decorate" id="input3" name="bmuser.password" placeholder="请输入密码"
							onBlur="show2()" onFocus="func1()" />
					</div>
					<div class="e2">
						<li id="boxa2">密码至少是6位数</li>
					</div>

				</div>
				<div class="box2">
					<div class="e0">再次输入密码:</div>
					<div class="e1">
						<input id="input4" type="password" maxlength="16" size="20"
							class="decorate" name="pwd1" placeholder="请再次输入密码"
							onBlur="show3()" onFocus="func2()" />
					</div>
					<p id="tip">两次密码输入不一致</p>
				</div>
				<div class="box2">
					<div class="e0">真实姓名:</div>
					<div class="e1">
						<input id="input5" type="text" size="20" name="bmuser.name"
							class="decorate" placeholder="请输入姓名" onBlur="show4()"
							onFocus="func3()" />
					</div>
					<div class="e2">
						<li id="boxa4">只能输入汉字</li>
					</div>
				</div>
				<div class="box2">
					<div class="e0">编号:</div>
					<div class="e1">
						<input id="input6" type="text" size="20"
							name="bmuser.serialnumber" class="decorate"
							placeholder="请输入4位数的数字" onBlur="show5()" onFocus="func4()" />
					</div>
					<div class="e2">
						<li id="boxa5">请输入4位数的数字</li>
					</div>
				</div>
				<div class="box2">
					<div class="e0">性别:</div>
					<div class="e1">
						<input id="input7" type="radio" name="bmuser.sex" value="2"
							checked="checked" />男 <input type="radio" name="bmuser.sex"
							value="1" />女
					</div>
					<div class="e2">
						<li id="boxa6"></li>
					</div>
				</div>
				<div class="box2">
					<div class="e0">年龄:</div>
					<div class="e1">
						<input id="input8" type="text" size="20" name="bmuser.age"
							class="decorate" placeholder="请输入你的年龄" onBlur="show6()"
							onFocus="func5()" />
					</div>
					<div class="e2">
						<li id="boxa7"></li>
					</div>
				</div>
				<div class="box2">
					<div class="e0">请选择学校:</div>
					<div class="e1">
						<select class="decorate" name="bmuser.school" size="1" id="input9">
							<option value="湖南大众传媒学院">湖南大众传媒学院</option>
							<option value="长沙师范高等专科学校">长沙师范高等专科学校</option>
							<option value="湖南工程职业技术学院">湖南工程职业技术学院</option>
							<option value="湖南信息职业技术学校">湖南信息职业技术学校</option>
							<option value="湖南安全职业技术学校">湖南安全职业技术学校</option>
							<option value="湖南机电职业技术学校">湖南机电职业技术学校</option>
							<option value="物流学校">物流学校</option>
							<option value="长沙大学">长沙大学</option>
						</select>
					</div>

				</div>

				<div class="box2">
					<div class="e0">邮箱:</div>
					<div class="e1">
						<input id="input10" type="text" name="bmuser.email" size="20"
							placeholder="请输入备用邮箱" class="decorate" onBlur="show7()"
							onFocus="func6()" />
					</div>
					<div class="e2">
						<li id="boxa8">请输入邮箱号</li>
					</div>
				</div>
				<div class="box2">
					<div class="e0">手机号:</div>
					<div class="e1">
						<input id="input11" type="text" size="20" placeholder="请输入手机号"
							name="bmuser.phone" class="decorate" onBlur="show8()"
							onFocus="func7()" />
					</div>
					<div class="e2">
						<li id="boxa9">请输入手机号</li>
					</div>
				</div>
				<div class="box2">
					<div class="e0">电话:</div>
					<div class="e1">
						<input id="input12" type="text" size="20" name="bmuser.mobile"
							placeholder="请输入电话号码" class="decorate" onBlur="show9()"
							onFocus="func8()" />
					</div>
					<div class="e2">
						<li id="boxa10">请输入电话号码</li>
					</div>
				</div>

				<div class="boxs">
					<input id="input2" type="submit" value="注册申请">
				</div>
			</form>
			<!-- <div>${insertError}</div> -->
			<div id="loginpage">
				<a href="login.jsp">返回登录页面</a>
			</div>
		</div>

	</center>

	<script type="text/javascript">
		//用户名
		function show1() {
			var pwd = document.getElementById("input1").value;
			var reg = /^[A-Za-z0-9\u4e00-\u9fa5]+$/;
			if (!reg.test(pwd)) {
				document.getElementById("boxa1").innerHTML = "<font color=red>用户名输入不正确</font>";
				document.getElementById("input1").value = "";
			}
		}
		function func() {
			document.getElementById("boxa1").innerHTML = "只能输入汉字和英文";

		}
		function show2() {
			var pwd = document.getElementById("input3").value;
			var reg = /^\w{6,16}$/;
			if (!reg.test(pwd)) {
				document.getElementById("boxa2").innerHTML = "<font color=red>密码输入不正确</font>";
				document.getElementById("input3").value = "";
			}
		}
		function func1() {
			document.getElementById("boxa2").innerHTML = "密码至少是6位数";

		}
		//密码
		function show2() {
			var pwd = document.getElementById("input3").value;
			var reg = /^\w{6,16}$/;
			if (!reg.test(pwd)) {
				document.getElementById("boxa2").innerHTML = "<font color=red>密码输入不正确</font>";
				document.getElementById("input3").value = "";
			}
		}
		function func1() {
			document.getElementById("boxa2").innerHTML = "密码至少是6位数";

		}

		//三
		function show3() {
			var pwd = document.getElementById("input3").value;
			var pwds = document.getElementById("input4").value;
			if (pwd !== pwds) {
				document.getElementById("tip").className = 'show';
				timer = setInterval(function() {
					document.getElementById("tip").className = '';
				}, 6000);
				document.getElementById("input3").value = "";
				document.getElementById("input4").value = "";
				this.focus();
			}
		}
	</script>
</body>
</html>