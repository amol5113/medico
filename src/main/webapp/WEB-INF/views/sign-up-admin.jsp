<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html>
<html>
<head>

 <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Sign Up</title>
     <link href="${pageContext.request.contextPath}/resources/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <!-- Bootstrap core CSS -->
	<!-- Custom styles for this template -->
  <link href="${pageContext.request.contextPath}/resources/css/modern-business.css" rel="stylesheet">
</head>
<body>
    <!--navbar-->
    <nav class="navbar fixed-top navbar-expand-lg navbar-dark bg-primary fixed-top">
            <div class="container">
              <a class="navbar-brand" href="/medico">Medico</a>
              <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
              </button>
              <div class="collapse navbar-collapse" id="navbarResponsive">
                <ul class="navbar-nav ml-auto">
          <li class="nav-item dropdown">
            <a href="#" class="nav-link dropdown-toggle" data-toggle="dropdown">Sign Up</a>
                    <div class="dropdown-menu">
                        <a href="signUpDoctor" class="dropdown-item">Doctor</a>
                        <a href="signUpPatient" class="dropdown-item">Patient</a>
                        <a href="signUpAdmin" class="dropdown-item">Admin</a>
                    </div>
          </li> 
          <li class="nav-item">
            <a class="nav-link" href="login_form">Login</a>
          </li> 
        </ul>
              </div>
            </div>
          </nav>
    <!--navbar-->

    <div class="container">
        <!--Sign UP foam-->
        <section class="testimonial py-5" id="testimonial">
                <div class="container">
                    <div class="row ">
                        <div class="col-md-4 py-5 bg-primary text-white text-center ">
                            <div class=" ">
                                <div class="card-body">
                                    <img src="https://lh3.googleusercontent.com/8g540BSYIHps3dUywQU09dTIOs2NNLme7Pg0tUjI6KnNm2VYCVFDI_nWZ_FmNboZj4fBucya-dGY2TNjxROMh7xIOAXKQ811bEnpRlcbKB8mBsgdx0EfDFHoXRktIwudg993_XXah7VabMqYFkNmGoR_1PBK5StKHgl0eUPIWdcBmZJfuCOwxFH9g5I0t9f49TRDqsL19s3SNLr8WSgaa2QB8yB98tNp102R4Th6QjNG7IBT0lGv6hDKlO_SSf9zOWcW9bm29CZHczzjH3SCr6hmbu6S9oYR_Hzdl5LVcrNrFEq2URfPA56ZnDKj2KgOVfJSnB8l91X3e-JG39Os3Zb_r7qrxDiS6h-q780sotQGPkg53VIRhusntEP4qqg1WwjWBuDwc1mXj9X-mcSuaOtbca3uztKFFjPBV2FdjCEAbSynCqFZqhNbhlqTaEUs3WG8fxOrkGC6HAV7SnmRIX74n9cUCCwnq79WXz2VwpIfL3nBAtB_ale6Oc_Y5YoiKHcyvTDTf-FDvDRmCUWtuVuaNNNXJJxEn7bQ42VwhfuaBDNHr9NyO1o90VthXUaP_VLovVHZYb6X2dmtxlgbQ9m7K35tgyOjPMFiKpWN_HBkTsGvbTSxxhSL1wcZXvSaGRl81Nn-mGMDS-nqIFV1aMuMRZpc9gliAUd8vly8n6bK2-SmelHT6wrkP3KtVsZZDIcaS4_7FIIm7omi1vwJAcQjsQ=w650-h520-no"
									style="width: 70%">
                                    
                                    <h2 class="py-3">Sign Up Admin</h2>
                                    <p>Tation argumentum et usu, dicit viderer evertitur te has. Eu dictas concludaturque usu, facete detracto patrioque an per, lucilius pertinacia eu vel.
           </p>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-8 py-5 border">
                            <h4 class="pb-4">Please fill with your details</h4>
                            <form action="saveAdmin" method="post">
                                <div class="form-row">
                                    <div class="form-group col-md-6">
									<spring:bind path="user.userName">
									<input id="Full Name" required="required" name="userName" placeholder="Full Name"
										class="form-control" type="text">
									</spring:bind>
								</div>
                                    <div class="form-group col-md-6">
									<spring:bind path="user.emailId">
									<input type="email" name="emailId" required="required"  pattern=".{8,}" title="8 or more character"
										class="form-control" id="inputEmail4" placeholder="Email">
									</spring:bind> 
									<!-- ajax response -->
                                     		<div id="ajaxResponse" style="color:red"></div>                                   
									</div>
                                  </div>
                                
                                  <div class="form-row">
                                    <div class="form-group col-md-6">
									<spring:bind path="user.password">
									<input id="Password" name="password" required="required" placeholder="Password"
										pattern=".{8,}" title="8 or more character"
										class="form-control" type="password">
									</spring:bind>                                    
									</div>
                                    <div class="form-group col-md-6">
									<spring:bind path="user.contactNo">
									<input type="text" name="contactNo" class="form-control" required="required" id="Contact"
										pattern=".{10}" title="plaease enter valid number"
										placeholder="Contact">
									</spring:bind>    
									</div>
                                  </div>

                                
                                  <div class="form-row">
                                    <div class="form-group col-md-6">
                                      <spring:bind path="user.gender">
									<select name="gender" class="form-control">
										<option selected>Gender</option>
										<option value="Male">Male</option>
										<option value="Female">Female</option>
										<option value="Transgender"> Transgender </option>
									</select>
									</spring:bind>
                                    </div>
                                    <div class="form-group col-md-6">
									<spring:bind path="user.dob">
									<input type="date" class="form-control" id="dateofbirth"
									name="dob"
										placeholder="Dateofbirth">
									</spring:bind>                                    
									</div>
                                   </div>

                                  <div class="form-row">
                                      <div class="form-group col-md-6">
									<spring:bind path="user.aadharNo">
									<input id="Addhar" name="aadharNo" required="required" placeholder="Addhar No"
										pattern=".{18}"
										title="plaease enter valid AdharNo and no space between number"
										class="form-control" type="number">
									</spring:bind>                                      
									</div>
									
                                  </div>

                                

                                <div class="form-row">
                                    <div class="form-group">
                                        <div class="form-group">
                                            <div class="form-check">
                                              <input class="form-check-input" type="checkbox" value="" id="invalidCheck2" required>
                                              <label class="form-check-label" for="invalidCheck2">
                                                <small>By clicking Submit, you agree to our Terms & Conditions, Visitor Agreement and Privacy Policy.</small>
                                              </label>
                                            </div>
                                          </div>
                                
                                      </div>
                                </div>

                              <div class="form-row">
                                <div class="form-group col-md-4">
                                <input type="submit" value="Sign Up" class="btn btn-danger">
                                    
                                </div>
                                <div class="form-group col-md-4">
                                  
                               </div>
                                <div class="form-group col-md-4">
                                  
                             <a href="login_form"><button type="button" class="btn btn-primary">Sign Up</button></a>
                               </div>
                            </div>
                            </form>
                        </div>
                    </div>
                </div>
            </section>
            
    </div>
    <!-- Footer -->
    <footer class="py-5 bg-dark">
            <div class="container">
              <p class="m-0 text-center text-white">Copyright &copy; Your Website 2019</p>
            </div>
    </footer>
     <!-- Ajax -->
    
    <script src="https://code.jquery.com/jquery-1.10.2.js"
	type="text/javascript"></script>
	<script type="text/javascript">
	$(document).ready(function() {
		$('#inputEmail4').blur(function() {
			$.ajax({
				url : 'getEmailAjax',
				data : {
					emailId : $('#inputEmail4').val()
				},
				success : function(responseText) {
					$('#ajaxResponse').text(responseText);
				}
			});
		});
	});
	</script>
	 <!-- Bootstrap core JavaScript -->
  <script src="${pageContext.request.contextPath}/resources/vendor/jquery/jquery.min.js"></script>
  
  <script src="${pageContext.request.contextPath}/resources/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

</body>
</html>