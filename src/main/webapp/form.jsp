<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Formularz</title>
</head>
<body>

<form action="FirstServlet">
	
	 Imię: <input type="text" name="imie" />
	 <br />
	 Nazwisko: <input type="text" name="nazwisko" />
	 <br />
	 Email: <input type="email" name="email" />
	 <br />
	 Potwierdź email: <input type="Pemail" name="Pemail" />
	 <br />
	 Pracodawca: <input type="text" name="pracodawca" />
	 <br />
	 Skąd się dowiedziałeś o konferencji?
	 <br />
	 <input type="radio" name="skad" value="praca" /> Ogłoszenie w pracy
	 <br />
	 <input type="radio" name="skad" value="uczelnia" /> Ogłoszenie na uczelni
	 <br />
	 <input type="radio" name="skad" value="facebook" /> Facebook
	 <br />
	 <input type="radio" name="skad" value="znajomi" /> Znajomi
	 <br />
	 <input type="radio" name="skad" value="inne" /> Inne (jakie?)
	 <input type="text" name="skad2" />
	 <br />
	 Czym sie zajmujesz?
	 <input type="text" name="zajecie" />
	 <br />
	<input type="submit" name="wyslij" value="Prześlij">
</form>



</body>
</html>