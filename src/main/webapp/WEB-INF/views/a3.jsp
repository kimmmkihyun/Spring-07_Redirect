<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
views \ a3.jsp <br>

mod1 : <%=request.getAttribute("model_attr") %><br>
mod2 : ${model_attr}<br>
mod3 : <%=request.getParameter("model_attr") %><br>
-----------------------<br>
req1 : <%=request.getAttribute("req_attr") %><br>
req2 : ${ req_attr }<br>
req3 : <%=request.getParameter("req_attr") %><br>













