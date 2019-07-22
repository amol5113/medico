 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib  prefix="spr" uri="http://www.springframework.org/tags/form" %>   
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Sign UP</title>
    <!-- Bootstrap core CSS -->
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</head>
<body>
    <!--navbar-->
    <nav class="navbar fixed-top navbar-expand-lg navbar-dark bg-primary fixed-top">
            <div class="container">
              <a class="navbar-brand" href="index.html">Medico</a>
              <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
              </button>
              <div class="collapse navbar-collapse" id="navbarResponsive">
                <ul class="navbar-nav ml-auto">
                  <li class="nav-item">
                    <a class="nav-link" href="signup.html">Sign Up</a>
                  </li> 
                  <li class="nav-item">
                    <a class="nav-link" href="login.html">Login</a>
                  </li> 
                </ul>
              </div>
            </div>
          </nav>
    <!--navbar-->

    <div class="container">
        <!--Sign UP foam-->
        <section class="testimonial py-5 mt-5" id="testimonial">
                <div class="container">
                    <div class="row ">
                        <div class="col-md-4 py-5 bg-primary text-white text-center ">
                            <div class=" ">
                                <div class="card-body">
                                    <img src="http://www.ansonika.com/mavia/img/registration_bg.svg" style="width:30%">
                                    <h2 class="py-3">Sign Up Doctor</h2>
                                    <p>Tation argumentum et usu, dicit viderer evertitur te has. Eu dictas concludaturque usu, facete detracto patrioque an per, lucilius pertinacia eu vel.
           </p>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-8 py-5 border">
                            <h4 class="pb-4">Doctor Sign Up</h4>
                            <%-- <spr:form action="user.htm" commandName="doctor">
                             --%>
                             <spr:form action="user.htm" commandName="user">
                                <div class="form-row">
                                    <div class="form-group col-md-4">
                                      <spr:input id="Full Name" path="userName" placeholder="Name" class="form-control" type="text"/>
                                    </div>
                                    <div class="form-group col-md-4">
                                      <spr:input type="email" path="emailId" class="form-control" id="inputEmail4" placeholder="Email"/>
                                    </div>
                                    <div class="form-group col-md-4">
                                      <spr:input type="password" path="password" class="form-control" id="passowrd" placeholder="Password"/>
                                    </div>
                                  </div>
                                <div class="form-row">
                                    <div class="form-group col-md-6">
                                    	<spr:select path="gender">
												<spr:option value="Male">Male</spr:option>
												<spr:option value="Female">Female</spr:option>
										</spr:select>
                                        <!--<spr:input id="gender" path="gender" placeholder="gender" class="form-control" required="required" type="text"/>-->
                                    <div class="form-group col-md-6">
                                        <spr:input id="CurrentPost" path="currentPost" placeholder="Current Post" class="form-control" type="text"/>
                                    </div> 
                                    </div>
                                    <div class="form-group col-md-6">
                                      <spr:input id="Contactno" path="contactNo" placeholder="Contact No" class="form-control" required="required" type="text"/>
                                    </div>
                                </div>
                                <div class="form-row">
                                        <div class="form-group col-md-6">
                                          <spr:input id="AdharNo" path="aadharNo" placeholder="AdharNo" class="form-control" type="text"/>
                                        </div>
                                        <div class="form-group col-md-6">
                                          <spr:input id="dob" path="dob" placeholder="dob" class="form-control" type="text"/>
                                        </div>
                                </div>
                                 <div class="form-row">
                                    <div class="form-group col-md-6">
                                        <spr:input id="Degree" path="Degree" placeholder="Degree" class="form-control" required="required" type="text"/>
                                    </div>
                                    <div class="form-group col-md-6">
                                        <spr:input id="DegreeImg" path="degreeImg" placeholder="Degree Img" class="form-control" required="required" type="file"/>
                                    </div>
                                </div>
                                
                                <div class="form-row">
                                        <div class="form-group col-md-6">
                                            <spr:input id="License" path="License" placeholder="License" class="form-control" required="required" type="text"/>
                                        </div>
                                        <div class="form-group col-md-6">
                                            <spr:input id="LicenseImg" path="licenseImg" placeholder="License Img" class="form-control" type="file"/>
                                        </div>
                                </div>
                                
                                <div class="form-row">
                                  <div class="form-group col-md-6">
                                    <spr:input id="YearsOfExp" path="yearsOfExperience" placeholder="Year of Experince" class="form-control" type="text"/>
                                  </div>
                                  <div class="form-group col-md-6">
                                    <spr:input id="ParcticeHours" path="practiceHours" placeholder="Parctice Hours" class="form-control" type="text"/>
                                  </div>
                                </div>
                                
                                <div class="form-row">
                                  <div class="form-group col-md-6">
                                    <spr:input id="Speclization" path="specialization" placeholder="Speclization" class="form-control" type="text"/>
                                  </div>
                                  <div class="form-group col-md-6">
                                    <spr:input id="Awards" path="awards" placeholder="Awards" class="form-control" type="text"/>
                                  </div>
                                </div>
                                <div class="form-row">
                                  <div class="form-group col-md-6">
                                    <spr:input id="Duration" path="duration" placeholder="Duration" class="form-control" type="text"/>
                                  </div>
                                  <div class="form-group col-md-6">
                                      <spr:input id="SpecialTraning" path="specialTraining" placeholder="SpecialTraning" class="form-control" required="required" type="text"/>
                                  </div>
                                </div>

                                <%-- <div class="form-row">
                                    <div class="form-group col-md-6">
                                          <label>Preferred language</label>
                                          <div class="checkbox">
                                            <label><spr:input type="checkbox" value="English"/>English</label>
                                          </div>
                                          <div class="checkbox">
                                            <label><spr:input type="checkbox" value="Marathi"/>Marathi</label>
                                          </div>
                                          <div class="checkbox">
                                            <label><spr:input type="checkbox" value="Hindi"/>Hindi</label>
                                          </div>
                                    </div>
                                </div> --%>
                                
								<div class="form-row">
                                        <div class="form-group col-md-6">
                                          <spr:input id="TypeOfUser" path="userType" placeholder="Type Of User" class="form-control" type="text"/>
                                        </div>
                                        <div class="form-group col-md-6">
                                          <spr:input id="isActive" path="isActive" placeholder="isActive" class="form-control" type="text"/>
                                        </div>
                                </div>                                
                              <div class="form-row">
                                <div class="form-group col-md-4">
                                    <input type="submit" value="submit"  class="btn btn-danger">
                                </div>
                                <div class="form-group col-md-4">
                                  
                               </div>
                                <div class="form-group col-md-4">
                                  
                                  <a href='login.html'><button class="btn btn-primary">Login</button></a>
                               </div>
                            </div>
                            </spr:form>
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
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</body>
</html>