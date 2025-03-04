<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>로그인</title>
</head>
<!-- css 초기화 -->
<link href="https://cdn.jsdelivr.net/npm/reset-css@5.0.2/reset.min.css" rel="stylesheet">
<!-- 페이지 css -->
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/common/common.css">
<%-- 페이지js --%>
<body>
    <jsp:include page="${pageContext.request.contextPath}/WEB-INF/views/common/Header.jsp"/>
    로그인페이지입니다
    <jsp:include page="${pageContext.request.contextPath}/WEB-INF/views/common/Footer.jsp"/>
</body>
</html>
