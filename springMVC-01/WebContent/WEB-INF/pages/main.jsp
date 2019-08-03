<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>main</title>
</head>
<body>
<p>登陆的人：${loginUser }</p>
<p>错误信息：${error }</p>
<a href="${pageContext.request.contextPath }/index.jsp">index.jsp</a>
<p><a href="${pageContext.request.contextPath }/product/findProduct.action?pid=100">苹果</a></p>
</body>
</html>