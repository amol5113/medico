<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="form-row">
								<div class="form-group col-md-6">
									<spring:bind path="doctor.degree">
							<select id="inputState" name="degree" required="required" class="form-control">
                                                <option selected>Degree</option>
                                                <option value="amolgawade51.ag@gmail.com">Bachelor of Medicine,Bachelor of surgery(MBBS) </option>
                                                <option value="Bachelor of Dental Surgery(BDS)"> Bachelor of Dental Surgery(BDS)</option>
                                        		<option value=" Bachelor of Ayurvedic Medicine and Surgery(BAMS)">  Bachelor of Ayurvedic Medicine and Surgery(BAMS) </option>
                                                <option value="Bachelor of Unani Medicine and Surgery(BUMS)"> Bachelor of Unani Medicine and Surgery(BUMS)Hematologists </option>
                                                <option value="Bachelor of Homeopathy Medicine and Surgery(BHMS)"> Bachelor of Homeopathy Medicine and Surgery(BHMS) </option>
                                                <option value="Doctor of Medicine (MD)"> Doctor of Medicine (MD) </option>
                                                <option value="Masters of Surgery (MS)"> Masters of Surgery (MS) </option>
                                                <option value="Diplomate of National Board(DNB)"> Diplomate of National Board(DNB) </option>
                                                <option value="Doctor of Osteopathic Medicine(DO)"> Doctor of Osteopathic Medicine(DO)Allergists/Immunologists </option>
                                                <option value="Doctor of Surgery(DS)"> Doctor of Surgery(DS) </option>
                                                <option value="Other"> Other </option>
                                              </select><!-- required removed required="required" -->
									</spring:bind>
								</div>
									<div class="form-group col-md-6">
									<spring:bind path="user.gender">
									<select id="gender" name="gender" required="required" class="form-control">
										<option selected>Gender</option>
										<option value="Male">Male</option>
										<option value="Female">Female</option>
									</select>
									</spring:bind>
								</div>
							</div>
							
							
							 <script src="https://code.jquery.com/jquery-1.10.2.js"
	type="text/javascript"></script>
	<script type="text/javascript">
	$(document).ready(function() {
		$('#inputState').change(function() {
			$.ajax({
				url : 'getEmailAjax',
				data : {
					emailId : $('#inputState').val()
				},
				success : function(responseText) {
					$('#gender').text(responseText);
				}
			});
		});
	});
	</script>
	<script src="${pageContext.request.contextPath}/resources/vendor/jquery/jquery.min.js"></script>
  
  <script src="${pageContext.request.contextPath}/resources/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
	
</body>
</html>