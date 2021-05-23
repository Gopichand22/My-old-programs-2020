<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
<!-- endinject -->
<!-- plugin css for this page -->
<!-- End plugin css for this page -->
<!-- inject:css -->
<link rel="stylesheet" href="css/style3.css">
<!-- endinject -->
<link rel="shortcut icon" href="images/favicon.png" />
<script async custom-element="amp-ad"
	src="https://cdn.ampproject.org/v0/amp-ad-0.1.js"></script>

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"
	integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN"
	crossorigin="anonymous">
</head>

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
							<a class="mdc-drawer-link" href="insert.jsp"> Insert
								Staff/Student </a>
						</div>


						<div class="mdc-list-item mdc-drawer-item">
							<a class="mdc-drawer-link" href="stafflist"> View Staff </a>
						</div>
						<div class="mdc-list-item mdc-drawer-item">
							<a class="mdc-drawer-link" href="studentslist"> View Student
							</a>
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
			<div class="mdc-layout-grid">
				<div class="mdc-layout-grid__inner">
					<div class="container">
						<div class="row">
							<div class="col-md-8 col-lg-8">
								<a href="crud.jsp">Back </a>
								<form action="RegisterMe" class="justify-content-center mx-auo"
									method="post">

									<div class="form-group">
										<label>Name</label>
										<input type="text" name="name" class="form-control"
											placeholder="Enter name" required>
									</div>
									<div class="form-group">
										<label>Email</label>
										<input type="email" name="email" class="form-control"
											placeholder="Enter email" required>
									</div>
									<div class="form-group">
										<label>password</label>
										<input type="password" name="pass" class="form-control"
											placeholder="Enter Password" required>
									</div>
									<div class="form-group">
										<label>Confirm password</label>
										<input type="password" name="cpass" class="form-control"
											placeholder="Enter Password again" required>
									</div>
									<div class="form-check">
										<input class="form-check-input" type="radio" name="role"
											id="flexRadioDefault1" value="staff">
										<label class="form-check-label" for="flexRadioDefault1">
											Staff</label>
									</div>
									<div class="form-check">
										<input class="form-check-input" type="radio" name="role"
											id="flexRadioDefault1" value="student">
										<label class="form-check-label" for="flexRadioDefault1">
											Student</label>
									</div>


									<button type="submit" class="btn btn-primary">Register</button>
								</form>
							</div>
						</div>
						
					</div>
				</div>
			</div>
			</main>

			<!-- partial -->
		</div>
	</div>
	
	<script src="js/jquery-3.2.1.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/mixitup.min.js"></script>
	<script src="js/circle-progress.min.js"></script>
	<script src="js/owl.carousel.min.js"></script>
	<script src="js/main.js"></script>
	<!-- End custom js for this page-->
</body>

</html>