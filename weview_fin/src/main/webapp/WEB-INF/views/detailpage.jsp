<%@page import="weview.dto.DetailDto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
DetailDto dto = (DetailDto) request.getAttribute("detail");

String ageLimit = null;
if (dto.getAge() == 20) {
	ageLimit = "청소년 관람 불가";
} else {
	ageLimit = dto.getAge() + "세 관람가";
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Weview - 영화 정보</title>
<script src="//code.jquery.com/jquery-3.3.1.min.js"></script>

<link href="resources/css/styles.css" rel="stylesheet" />    
</head>
<body>

	
	<!-- Navigation-->

	<jsp:include page="includes/navigation.jsp" />

	<!-- Section-->
	<section class="py-5" style="display: flex;">
		<div class="container1 movie_ex">
			<img src="resources/images/<%=dto.getPoster()%>" alt=""
				class="movie_img">
			<div class="information ">
				<div class="score">
					<div class="TITLE sc_1">
						<div class="sc_1_1">
							<span style="font-size:16pt" id="TITLE"><b><%=dto.getTitle()%></b></span>
						</div>
					</div>
					<div class="RATE sc_2" id="RATE">
				
					</div>
					
				</div>
				<div class="details">
					<dl>
						<dt>
							<span>개요</span>
						</dt>
						<dd class="개요">
							<p>
								<span class="span_1"><%=dto.getGenre()%></span> 
								<span class="span_2"><%=dto.getCountry()%></span> 
								<span class="span_2"><%=dto.getRunningtime()%>분</span> 
								<span class="span_2"><%=dto.getCreated()%> 개봉</span>
							</p>
						</dd>
						<dt class="director">감독</dt>
						<dd>
							<p>
								<span> <%=dto.getDirector()%>
								</span>
							</p>
						</dd>
						<dt class="actor">배우</dt>
						<dd>
							<p>
								<span><%=dto.getActor()%> </span>
							</p>
						</dd>
						<dt class="age">관람등급</dt>
						<dd>
							<p>
								<span><%=ageLimit%>
								</span>
							</p>
						</dd>
					</dl>
				</div>
				<div class="picture">
					<div class="pic_1">
		
					</div>
					<a href="<%=dto.getTrailer()%>">
					<button type="button" class="btn btn-outline-secondary" id="show" 
							style="margin-left: 500px;" 
							>예고편</button> </a>
					&nbsp;						
					<button class="btn btn-outline-secondary"><div>♡</div></button>
						
								
				</div>
					
			</div>

		</div>
		
	</section>
	
	<%-- <script type="text/javascript">
		function newPage()  {
		  window.open('<%=dto.getTrailer%>');
		}
	</script> --%>
</body>
</html>

