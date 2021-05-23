<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>Home page</title>

	<meta charset="UTF-8">

	<!-- Google Fonts -->
	<link href="https://fonts.googleapis.com/css?family=Raleway:400,400i,500,500i,600,600i,700,700i,800,800i" rel="stylesheet">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.1.1/animate.min.css" />
	<!-- Stylesheets -->
	<link rel="stylesheet" href="css/bootstrap.min.css"/>
	<link rel="stylesheet" href="css/font-awesome.min.css"/>
	<link rel="stylesheet" href="css/owl.carousel.css"/>
	<link rel="stylesheet" href="css/style.css"/>



<!-- font and icons cdn -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"
	integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN"
	crossorigin="anonymous">

<!-- Jquery cdn -->
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"
	integrity="sha512-894YE6QWD5I59HgZOGReFYm4dnWc1Qt5NtvYSaNcOP+u1T9qYdvdihz0PPSiiqn/+/3e7Jo4EaG7TubfWGUrMQ=="
	crossorigin="anonymous"></script>

</head>

<body>

	

	<!-- Header section -->
	<header class="header-section">
		<div class="container-fluid">
			<div class="row">
				<div class="col-lg-3 col-md-3">
					<div class="site-logo">
						<h4 class="animate__animated animate__slideInDown animate__slow"
							style="color:white; padding: 1px;">
							Virtual Classroom</h4>
					<h5 style="color:white;"></h5>
					</div>
					<div class="nav-switch">
						<i class="fa fa-bars"></i>
					</div>
				</div>
				<div class="col-lg-12 col-md-12 animate__animated animate__slideInUp animate__slow"  style="background-color:black;">
					<a class="site-btn header-btn ml-1" href="crud.jsp">Admin Dashboard</a>
					<a href="logout" class="site-btn header-btn">Logout</a>
					<nav class="main-menu">
						<ul>
							<li><a href="admin.jsp">Home</a></li>
							<li><a href="classroom.jsp">Classroom</a></li>
							<li><a href="news.jsp">News</a></li>
							<li><a href="aboutUs.html">About us</a></li>
							<li><a href="contact.html">Contact Us</a></li>
						</ul>
					</nav>
				</div>
			</div>
		</div>
	</header>
	<!-- Header section end -->


	<!-- Hero section -->
	<section class="hero-section set-bg" data-setbg="img/bg8.jpg">
		<div class="container">
			<div class="hero-text text-white">
				<h3>This is an admin page where admin can perform root operations to whole website</h3>
			</div>
			
		</div>
	</section>
	
	<!-- signup section -->
	
	<!-- signup section end -->


	<!-- footer section -->
	<footer class="footer-section spad pb-0">
		<div class="footer-top">
			<div class="footer-warp">
				<div class="row">
					<div class="widget-item">
						<h4 class="animate__animated animate__slideInLeft">Contact Info</h4>
						<ul class="contact-list animate__animated animate__slideInUp animate__delay-1s">
							<li>Nellore,AndhraPradesh</li>
							
						</ul>
					</div>
					
					<div class="widget-item">
						<h4 class="animate__animated animate__slideInLeft">Website Developed by</h4>
						<ul class="contact-list animate__animated animate__slideInUp animate__delay-1s">
							<li>P Gopichand Reddy</li>
						</ul>
					</div>
					<div class="widget-item">
						<h4 class="animate__animated animate__slideInLeft">Technologies Used</h4>
						<ul class="contact-list animate__animated animate__slideInRight animate__delay-1s">
							<li><a href="">Java</a></li>
							<li><a href="">Servlets</a></li>
							<li><a href="">MySQL</a></li>
							<li><a href="">Bootstrap</a></li>
							<li><a href="">Jquery</a></li>
						</ul>
					</div>
					
				</div>
			</div>
		</div>
		<div class="footer-bottom">
			<div class="footer-warp">
				<div class="copyright">
Copyright &copy;2021 All rights reserved</div>
			</div>
		</div>
	</footer> 
	<!-- footer section end -->


	<!--====== Javascripts & Jquery ======-->
	<script src="js/jquery-3.2.1.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/mixitup.min.js"></script>
	<script src="js/circle-progress.min.js"></script>
	<script src="js/owl.carousel.min.js"></script>
	<script src="js/main.js"></script>
	
</body>
</html>