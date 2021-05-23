$(document)
		.ready(
				function() {
					$("#name_success").hide();
					$("#uname_success").hide();
					$("#pass_success").hide();
					$("#cpass_success").hide();
					$("#name_error").hide();
					$("#uname_error").hide();
					$("#pass_error").hide();
					$("#cpass_error").hide();
					$("#name_msg").hide();
					$("#uname_msg").hide();
					$("#pass_msg").hide();
					$("#cpass_msg").hide();
					$("#error_msg_gender").hide();
					
					var err_name=false;
					var err_uname=false;
					var err_pass=false;
					var err_cpass=false;
					var err_gender=false;
					var err_option=false;

					$("#name").focusout(function() {
						check_name();
					});

					$("#uname").focusout(function() {
						check_uname();
					});

					$("#pass").focusout(function() {
						check_pass();
					});

					$("#cpass").focusout(function() {
						check_cpass();
					});

					$("#gen").focusout(function() {
						check_gender();
					});
					
					$("#gen").focusout(function() {
						check_option();
					});
					

					// name validation
					function check_name() {
						var pattern = /^(?!.*[0-9])(?=.*[a-z])(?!.*\s).{8,}$/;
						var my_name = $("#name").val();
						if (pattern.test(my_name) && my_name !== '') {
							$("#name_error").hide();
							$("#name_success").css("color", "palegreen");
							$("#name_success").show();
							$("#name_msg").html("<small>OK</small>");
							$("#name_msg").css("color", "green");
							$("#name_msg").show();
							$("#name").css("border", "2px groove palegreen");
							err_name=true;
						} else {
							if (my_name == "") {
								$("#name_success").hide();
								$("#name_error").css("color", "red");
								$("#name_error").show();
								$("#name_msg").html(
										"<small>Do not leave empty</small>");
								$("#name_msg").css("color", "red");
								$("#name_msg").show();
								$("#name").css("border", "2px groove red");

							} else {
								$("#name_success").hide();
								$("#name_error").css("color", "red");
								$("#name_error").show();
								$("#name_msg")
										.html(
												"<small>Only alphas are allowed length must be 8 or more</small>");
								$("#name_msg").css("color", "red");
								$("#name_msg").show();
								$("#name").css("border", "2px groove red");
							}
						}

					}
					// ^(?=.*[a-z])(?=.*[A-Z])(?=.*[!#$%&? "])(?!.*\s).{8,16}$/
					// user name validation
					function check_uname() {
						var pattern = /^(?!=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!#$%&? "])(?!.*\s).{8,}$/;
						var user_name = $("#uname").val();
						if (pattern.test(user_name) && user_name !== '') {
							$("#uname_error").hide();
							$("#uname_success").css("color", "palegreen");
							$("#uname_success").show();
							$("#uname_msg").html("<small>OK</small>");
							$("#uname_msg").css("color", "green");
							$("#uname_msg").show();
							$("#uname").css("border", "2px groove palegreen");
							err_uname=true;
						} else {
							if (user_name == "") {
								$("#uname_success").hide();
								$("#uname_error").css("color", "red");
								$("#uname_error").show();
								$("#uname_msg").html(
										"<small>Do not leave empty</small>");
								$("#uname_msg").css("color", "red");
								$("#uname_msg").show();
								$("#uname").css("border", "2px groove red");
							} else {
								$("#uname_success").hide();
								$("#uname_error").css("color", "red");
								$("#uname_error").show();
								$("#uname_msg")
										.html(
												"<small>Username should be unique (Alphas, Chars, length must be 8 or more )</small>");
								$("#uname_msg").css("color", "red");
								$("#uname_msg").show();
								$("#uname").css("border", "2px groove red");
							}
						}
					}

					// password validation
					function check_pass() {
						var pattern = /^(?=.*[0-9])(?=.*[A-Z].*[A-Z])(?=.*[a-z])(?=.*[!#$@%&? "])(?!.*\s).{8,}$/;
						var password = $("#pass").val();
						if (pattern.test(password)) {
							$("#pass_error").hide();
							$("#pass_success").css("color", "palegreen");
							$("#pass_success").show();
							$("#pass_msg").html("<small>OK</small>");
							$("#pass_msg").css("color", "green");
							$("#pass_msg").show();
							$("#pass").css("border", "2px groove palegreen");
							err_pass=true;
						} else {
							if (password == "") {
								$("#pass_success").hide();
								$("#pass_error").css("color", "red");
								$("#pass_error").show();
								$("#pass_msg").html(
										"<small>Do not leave empty</small>");
								$("#pass_msg").css("color", "red");
								$("#pass_msg").show();
								$("#pass").css("border", "2px groove red");
							} else {
								$("#pass_success").hide();
								$("#pass_error").css("color", "red");
								$("#pass_error").show();
								$("#pass_msg")
										.html(
												"<small>Password should contain (Alphanumeric, char, length must be 8 or more )</small>");
								$("#pass_msg").css("color", "red");
								$("#pass_msg").show();
								$("#pass").css("border", "2px groove red");
							}
						}
					}

					// confirm password
					function check_cpass() {
						var main_password = $("#pass").val();
						var confirm_password = $("#cpass").val();
						if (main_password !== '' && confirm_password !== '') {
							if (main_password == confirm_password) {
								$("#cpass_error").hide();
								$("#cpass_success").css("color", "palegreen");
								$("#cpass_success").show();
								$("#cpass_msg").html(
										"<small>OK, Matched</small>");
								$("#cpass_msg").css("color", "green");
								$("#cpass_msg").show();
								$("#cpass").css("border",
										"2px groove palegreen");
								err_cpass=true;
							} else {
								$("#cpass_success").hide();
								$("#cpass_error").css("color", "red");
								$("#cpass_error").show();
								$("#cpass_msg")
										.html(
												"<small>Passwords are not matching</small>");
								$("#cpass_msg").css("color", "red");
								$("#cpass_msg").show();
								$("#cpass").css("border", "2px groove red");

							}
						} else {
							$("#cpass_success").hide();
							$("#cpass_error").css("color", "red");
							$("#cpass_error").show();
							$("#cpass_msg").html(
									"<small>Do not leave empty</small>");
							$("#cpass_msg").css("color", "red");
							$("#cpass_msg").show();
							$("#cpass").css("border", "2px groove red");
						}
					}

					function check_gender() {
						var result = 0;
						result = $('input[type="radio"]:checked');
						if (result.length > 0) {
							$("#error_msg_gender").html("<small>Ok</small>");
							$("#error_msg_gender").css("color", "green");
							$("#error_msg_gender").show();
							err_gender=true;
						}else{
							$("#error_msg_gender").html("<small>Please enter gender</small>");
							$("#error_msg_gender").css("color", "green");
							$("#error_msg_gender").show();
						}
					}
					$("#form").submit(function(){
						err_name=false;
						err_uname=false;
						err_pass=false;
						err_cpass=false;
						err_gender=false;
						
						
						check_name();
						check_uname();
						check_pass();
						check_cpass();
						check_gender();
						
						
						if(err_name === true && err_uname === true && err_pass===true&& err_cpass===true && err_gender===true){
							alert("registration success");
						}else{
							alert("Please fill the form correctly");
						}
					});
				});