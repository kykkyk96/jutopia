<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<header>

    <div id="header-container">
        <div class="header--flexBox">
            <div class="flex-content">
                <div class="content-lt">
                    <div class="logo-container">
                        <a href="http://localhost:8080">로고</a>
                    </div>
                </div>
                <div class="content-rt">
                    <div class="login-container">
                        <a class="" href="<%=request.getContextPath()%>/member/login">로그인/회원가입</a>
                    </div>
                    <div class="shoppingCart-container">
                        장바구니
                    </div>
                </div>
            </div>
        </div>
    </div>

</header>