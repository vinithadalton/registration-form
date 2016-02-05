<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>
<div id="header" style="background-color:#337AB7;
    color:white;
    text-align:center;
    padding:5px;">
<b>SampleWebApplication</b>
</div>
<div class="container"style="width:446px;margin-top:100px">
<div class="panel panel-primary">
    <div class="panel-heading"><center> <b>Register Yourself</b> </center></div>
    <div class="panel-body">
<form action="registerServlet" method="post">  
              <label for="username">UserName:</label>
                   <input type="text" name="username" required="required"style="margin-left:40px" >  <br><br>
                   
              <label for="password">Password: </label>
                   <input type="password" name="userpass" required="required"style="margin-left:38px"> 
                   <br><br>
                    <label for="email">EmailAddress: </label>
                   <input type="text" name="email" required="required"style="margin-left:12px"> 
              <br><br>
               <label for="contactnumber">ContactNumber: </label>
                   <input type="text" name="contactnumber" required="required">    
             <br>   <br>
                
               <label for="dob">DateOfBirth: </label>
                   <input type="text" name="dateofbirth" required="required"style="margin-left:26px">    
             <br>   <br>
             <label for="gendermale">Gender: </label>
                <label style="margin-left:52px"> <input type="checkbox" name="gendermale"> Male</label>  
               <label> <input type="checkbox"name="genderfemale"> Female</label>  
             
             
             <br>
                  
                <input type="submit" value="Register" style="margin-left:151px">
                 
    </form>  
    </div>
    </div>
    </div>
    <div id="footer" style="background-color:#337AB7;color:white;
    clear:both;
    text-align:center;
    padding:5px;
    margin-top:80px">
Copyright © WebApplication.com
</div>
    
</body>
</html>