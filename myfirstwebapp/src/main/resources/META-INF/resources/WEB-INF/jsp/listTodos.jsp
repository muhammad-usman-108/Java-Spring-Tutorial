<html>
    <head>
        <title>
            List Todos Page
        </title>
    </head>
    <body>
        <div>Welcome ${name}</div>
        <div>Your todos are ${todos}</div>
        <table>
	        <thead>
	        	<tr>
		        	<th>ID</th>
	        	</tr>
	        </thead>
	        <tbody>
		        <% for(int i = 0; i < 10; i+=1) { %>
			        <tr>      
			            <td><%=i%></td>
			        </tr>
		    	<% } %>
	        </tbody>
        </table>
        <a href="add-todos">Add Todo</a>
    </body>
</html>