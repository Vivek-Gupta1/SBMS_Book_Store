<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <form action="book">
      Book ID::<input type="text" name="id">
      <input type="submit" value="Search">
      </form>
      <hr>
      Book ID::${book.book_id}<br>
      Book Name::${book.book_Name}<br>
      Book Price::${book.book_Price}<br>
</body>
</html>