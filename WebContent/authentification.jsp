<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%-- <link rel="stylesheet" href="styles1.css">--%>
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet">
<title>Insert title here</title>
		
<style>
table{
	width: 325px;
	height:300px;
	position: absolute;
	top: 60%;
	left: 50%;
	transform: translate(-50%,-50%);
	background: #191919;
	text-align: center;
	border-radius: 30px;
	}
	 h1{
	color: #898961;
	text-transform: uppercase;
	font-weight:500;
}


input[type = "text"] ,  input[type = "password"]{
	border: 0;
	background: none;
	display: block;
	margin: 20px auto;
	text-align: center;
	border: 2px solid #3498db ;
	padding: 14px 10px;
	width: 200px;
	outline: none;
	color: #081005;
	border-radius: 24px;
	transition: 0.25s;
}
input[type = "text"]:hover, input[type = "password"]:hover{
	width: 250px;
	border-color: #2ecc71;
	}

	 input[type="submit"]{
		border: 0;
	background: #0B4977;
	display: block;
	margin: 20px auto;
	text-align: center;
	border: 2px solid ;
	padding: 14px 40px;
	outline: none;
	color: white;
	border-radius: 30px;
	transition: 0.25s;
	cursor: pointer;
	
	}
	input[type="submit"]:hover{
		background: #20222b;
	}
	body{
	margin:0;
	padding: 0;
	background:;	
	}
	







</style>
</head>
<body>
<center><h1>  Gestion Des Etudiants    </h1></center>
<form name="form2" method="POST" action="verification">
<center>
	<table>
		<div>
			<tr> 
				
				<td><input type="text" class="form-control" name="user" placeholder="Username" ></td>   
			 </tr>
			 <tr>
				
				 <td><input type="password" class="form-control" name="mp" placeholder="password" ></td> 
			 </tr>
			 <tr>
				<td colspan="2" style="text-align:center"><input class="btn btn-success" type="submit" name="submit" value="SeConnecter" > </td>
			</tr>
		</div>
	</table>
</center>
</form>



<hr>
<hr>
</body>
</html>