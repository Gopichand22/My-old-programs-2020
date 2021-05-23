<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">

<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Admin</title>
<!-- plugins:css -->
<link rel="stylesheet"
	href="node_modules/mdi/css/materialdesignicons.min.css">
<link
	href="https://fonts.googleapis.com/css?family=Raleway:400,400i,500,500i,600,600i,700,700i,800,800i"
	rel="stylesheet">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.1.1/animate.min.css" />
<!-- Stylesheets -->
<link rel="stylesheet" href="css/bootstrap.min.css" />
<link rel="stylesheet" href="css/font-awesome.min.css" />
<link rel="stylesheet" href="css/owl.carousel.css" />
<link rel="stylesheet" href="css/style.css" />




<!-- bootstrap cdn -->

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
<link rel="stylesheet" href="css/style3.css">
<!-- endinject -->
<link rel="shortcut icon" href="images/favicon.png" />
<script async custom-element="amp-ad"
	src="https://cdn.ampproject.org/v0/amp-ad-0.1.js"></script>
	<style>
table {
	display: flex;
	align-items: center;
}

table th, td {
	color: #888;
	font-weight: bold;
}

table td {
	border: 1px groove #fff;
	background-color: #fff;
}

th, td {
	padding: 15px;
	text-align: left;
}
tr:nth-child(even) {background-color: #f2f2f2;}
</style>
</head>
<%
	request.getAttribute("all_stu");
%>
<body>
	<div class="body-wrapper">
		<!-- partial:partials/_sidebar.html -->
		<aside class="mdc-persistent-drawer mdc-persistent-drawer--open">
			<nav class="mdc-persistent-drawer__drawer">
				<div class="mdc-persistent-drawer__toolbar-spacer">
					<a href="crud.jsp" class="brand-logo"> VIrtual Classroom </a>
				</div>
				<div class="mdc-list-group">
					<nav class="mdc-list mdc-drawer-menu">
						<div class="mdc-list-item mdc-drawer-item">
							<a class="mdc-drawer-link" href="crud.jsp"> Dashboard </a>
						</div>
						
						
						<div class="mdc-list-item mdc-drawer-item">
							<a class="mdc-drawer-link" href="logout" style="color: red;">
								Logout </a>
						</div>
					</nav>
				</div>
			</nav>
		</aside>
		<!-- partial -->
		<!-- partial:partials/_navbar.html -->
		<header class="mdc-toolbar mdc-elevation--z4 mdc-toolbar--fixed">
			<div class="mdc-toolbar__row"></div>
		</header>
		<!-- partial -->
		<div class="page-wrapper mdc-toolbar-fixed-adjust">
			<main class="content-wrapper">
			<div
				class="mdc-layout-grid__cell stretch-card mdc-layout-grid__cell--span-12">
				<div class="mdc-card table-responsive">
					<div class="table-heading px-2 px-1 border-bottom">
						<h1 class="mdc-card__title mdc-card__title--large">Students Data</h1>
					</div>
					<table>
					<tr>
						<th>Student Id</th>
						<th>Student Name</th>
						<th>Student Email</th>
						
						
					</tr>
					<c:forEach var="i" items="${all_stu}">

						<tr>
							<td>${i.id}</td>
							<td>${i.name}</td>
							<td>${i.email}</td>
							
						</tr>
					</c:forEach>
				</table>
				</div>
			</div>
			</main>
			<!-- partial:partials/_footer.html -->
			<footer>
				<div class="mdc-layout-grid">
					<div class="mdc-layout-grid__inner">
						<div
							class="mdc-layout-grid__cell stretch-card mdc-layout-grid__cell--span-6">
							
							</span>
						</div>
						<div
							class="mdc-layout-grid__cell stretch-card mdc-layout-grid__cell--span-6 d-flex justify-content-end">
							
						</div>
					</div>
				</div>
			</footer>
			<!-- partial -->
		</div>
	</div>
	<!-- body wrapper -->
	<!-- plugins:js -->
	<script
		src="node_modules/material-components-web/dist/material-components-web.min.js"></script>
	<script src="node_modules/jquery/dist/jquery.min.js"></script>
	<!-- endinject -->
	<!-- Plugin js for this page-->
	<script src="node_modules/chart.js/dist/Chart.min.js"></script>
	<script src="node_modules/progressbar.js/dist/progressbar.min.js"></script>
	<!-- End plugin js for this page-->
	<!-- inject:js -->
	<script src="js/misc.js"></script>
	<script src="js/material.js"></script>
	<!-- endinject -->
	<!-- Custom js for this page-->
	<script src="js/dashboard.js"></script>
	<!-- End custom js for this page-->
</body>

</html>