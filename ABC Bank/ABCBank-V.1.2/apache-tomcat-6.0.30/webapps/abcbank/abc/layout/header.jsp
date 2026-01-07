<%@ include file="/abc/taglibs.jsp" %>

<div id="imageHeader">
    <table style="padding: 5px; margin: 0px; width: 100%;">
        <tr>
            <td id="pageHeader"></td>
            <td id="loginInfo">
                <c:if test="${not empty user}">
                    Welcome: ${user.firstName} ${user.lastName}
                    |
                    <stripes:link href="/online/abc/Logout.action">Logout</stripes:link>
                </c:if>
            </td>
        </tr>
    </table>
    <c:choose>
    <c:when test="${not empty user}">    
    <div id="navLinks">
        <stripes:link href="/online/abc/Search.action">Registered Payee List</stripes:link>
        <stripes:link href="/abc/Search.jsp">Search Payee</stripes:link>
        <stripes:link href="/abc/AddPayee.jsp">Add New Payee</stripes:link>
        <stripes:link href="/online/abc/TransferFund.action" event="accountSummary">Account Summary</stripes:link>
    </div>  
    </c:when>
    <c:otherwise>
    	<div id="image">
    	</div>    
    </c:otherwise>
    </c:choose>
</div>