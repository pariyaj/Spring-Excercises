<html>
   <head>
      <title>Using GET and POST Method to Read Form Data</title>
   </head>
   
   <body>
      <center>
      <h1>Using POST Method to Read Form Data</h1>
      <p><b>First Name:</b>
       <h2> <%= request.getParameter("first_name")%></h2>
         </p>
		 <p><b>Last  Name:</b>
            <%= request.getParameter("last_name")%>
         </p>
		 <p><b>Year of Birth:</b>
	            <%= request.getParameter("years")%>
	         </p>
   </body>
</html>
