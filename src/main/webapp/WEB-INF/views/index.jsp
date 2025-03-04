<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="utf-8">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>주토피아</title>
  <meta name="viewport" content="width=device-width, initial-scale=1, minimum-scale=1, maximum-scale=1">
<!-- css 초기화 -->
<link href="https://cdn.jsdelivr.net/npm/reset-css@5.0.2/reset.min.css" rel="stylesheet">
<!-- 페이지 css -->
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/common/common.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/index.css">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/swiper@11/swiper-bundle.min.css" />
<%-- 페이지js --%>
<script defer src="${pageContext.request.contextPath}/js/index.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/swiper@11/swiper-bundle.min.js"></script>
</head>
<body>

  <jsp:include page="${pageContext.request.contextPath}/WEB-INF/views/common/Header.jsp"/>

  <div id="main-container">

  <%--  메인 카테고리 --%>
    <div class="category-nav">
      <div class="nav-flexBox">
        <div class="category-elements">
          <div class="categoryel">
            <a class="" href="">홈</a>
          </div>
          <div class="categoryel">
            <a class="" href="">전체상품</a>
          </div>
          <div class="categoryel">
            <a class="" href="">신상품</a>
          </div>
          <div class="categoryel">
            <a class="" href="">인기상품</a>
          </div>
          <div class="categoryel">
            <a class="" href="">고객센터</a>
          </div>
        </div>
      </div>
    </div> <!-- category-nav -->

  <%--  배너슬라이드  --%>
    <div class="banner-container">
      <section id="slider1" class="slider">
        <div class="box">1</div>
        <div class="box">2</div>
        <div class="box">3</div>
        <div class="box">4</div>
        <div class="box">5</div>
      </section>
    </div> <!-- banner-container -->

  <%--  주류 세부 카테고리  --%>
    <div class="alchol-category">
      <div class="alCategory-flexBox">
        <div class="alCategory-elements">
          <div class="alCategory-element">
            <a href=""></a>
          </div>
          <div class="alCategory-element">
            <a href=""></a>
          </div>
          <div class="alCategory-element">
            <a href=""></a>
          </div>
          <div class="alCategory-element">
            <a href=""></a>
          </div>
          <div class="alCategory-element">
            <a href=""></a>
          </div>
          <div class="alCategory-element">
            <a href=""></a>
          </div>
        </div> <!-- alCategory-elements -->
      </div> <!-- alCategory-flexBox -->
    </div> <!-- alchol-category -->

  <%--  카테고리별 주류 소개 슬라이드  --%>
    <div class="showAlchol-slider1">
  <%--  주류슬라이드 제목  --%>
      <div class="slider-box">
        <div class="box-title">

          <div class="titleBox">
            <div class="title-img" style="border: 1px solid pink;">
              <img src="${pageContext.request.contextPath}/img/new_icon.png">
            </div>
            <div class="title-content" style="border: 1px solid;">
              <div style="border: 1px solid;">
                <p>주토피아에만 있는 신상이에요!</p>
              </div>
              <div style="border: 1px solid;">
                <p>최근 입점한 신상품 증류주에요.</p>
              </div>
            </div>
          </div>

          <div style="border: 1px solid;">
            <p>더보기</p>
          </div>
        </div>

        <%-- 주류슬라이드 내용 박스 --%>
        <div class="slider-box-1">
          <div class="swiper mySwiper">
            <div class="swiper-wrapper">
              <div class="swiper-slide">Slide 1</div>
              <div class="swiper-slide">Slide 2</div>
              <div class="swiper-slide">Slide 3</div>
              <div class="swiper-slide">Slide 4</div>
              <div class="swiper-slide">Slide 5</div>
            </div>
          </div>
            <div class="navigation-wrapper">
              <!-- 화살표 -->
              <div class="swiper-button-prev"></div>
              <div class="swiper-button-next"></div>
            </div>
          </div>


      </div>
    </div> <!-- showAlchol-slider1 -->

    <div class="showAlchol-slider2">

    </div>

    <div class="showAlchol-slider3">

    </div>

    <div class="showAlchol-slider4">

    </div>

  </div> <!-- main-container -->

  <jsp:include page="${pageContext.request.contextPath}/WEB-INF/views/common/Footer.jsp"/>
</body>
</html>