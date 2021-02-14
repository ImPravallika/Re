<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AddNotes</title>
</head>
<body>
<%@include file ="all_js_css.jsp"%>

<form method="post" action="/First">
  <div class="form-group">
    <label for="exampleInputEmail1">Title</label>
    <input type="text" name="title" requried class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter Title">
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Conent</label>
    <textarea cols="6" rows="6" class="form-control" id="exampleInputPassword1" placeholder="Enter Content" name="content"></textarea>
  </div>
  <div class="container text-center">
    <button type="submit" class="btn btn-danger">Submit</button>
    </div>
</form>
</body>
</html>