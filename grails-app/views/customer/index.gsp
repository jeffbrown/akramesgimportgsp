<%@ page import="tst.Customer" %>
<html>
<body>

%{-- Embedding code like this in a GSP is a bad idea but this is--}%
%{-- a simple way to validate that the import is effective --}%
<g:set var="numberOfCustomers" value="${Customer.count()}"/>

<h2>There are ${numberOfCustomers} Customers in the database</h2>

</body>
</html>
