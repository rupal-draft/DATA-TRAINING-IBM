<%@ include file="/abc/taglibs.jsp" %>

<stripes:layout-render name="/abc/layout/standard.jsp" title="Account Summary">
    <stripes:layout-component name="contents">

        <jsp:useBean id="transaction" scope="page"
                     class="online.abc.domain.Transaction"/>

        
            <stripes:errors/>
			<p>Your current balance is INR ${actionBean.balance}</p> 
			<c:if test="${not empty actionBean.transactions}">
            <table class="display">
                <tr>
                	<th>Transaction ID</th>
                    <th>Date</th>
                    <th>Description</th>
                    <th>WIthdrawals</th>
                    <th>Deposits</th> 
                    <th>Balance</th>                   
                </tr>
                <c:forEach items="${actionBean.transactions}" var="transaction" varStatus="rowstat">
                    <tr class="${rowstat.count mod 2 == 0 ? "even" : "odd"}">
                        <td>${transaction.id}</td>
                        <td><fmt:formatDate value="${transaction.date}" dateStyle="short"/></td>
                        <td>${transaction.remarks}</td>
                        <td>${transaction.transactionAmount}</td>
                        <td></td>
                        <td>${transaction.balanceAmount}</td>
                    </tr>
                </c:forEach>
            </table>
            </c:if>

    
    </stripes:layout-component>
</stripes:layout-render>