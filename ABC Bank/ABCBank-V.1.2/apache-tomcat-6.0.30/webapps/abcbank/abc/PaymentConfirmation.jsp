<%@ page import="online.abc.domain.Status"%>
<%@ include file="/abc/taglibs.jsp" %>

<stripes:layout-render name="/abc/layout/standard.jsp" title="Confirmation - Payment Details">
    <stripes:layout-component name="contents">
		<c:set var="data" value="${actionBean}" />
        
        <stripes:errors/>
		
        <stripes:form action="/online/abc/TransferFund.action">
            <table class="reciptForm">
                
                        <stripes:hidden name="payee.id" value="${actionBean.payee.id}"/>
 				
                <tr>
                    <th>To Account:</th> 
                    <td>${actionBean.payee.accountNumber}</td>                  
                </tr>
                <tr>
                    <th>Amount:</th> 
                    <td>${actionBean.transaction.transactionAmount}</td>                  
                </tr>
                <tr>
                    <th>Name:</th> 
                    <td>${actionBean.payee.name}</td>                  
                </tr>
                <tr>
                    <th>Bank:</th> 
                    <td>${actionBean.payee.bank}</td>                      
                </tr>
                <tr>              
                    <th>Branch:</th>
                    <td> ${actionBean.payee.branch}</td>  
                </tr>
                <tr>
                    <th>Account Type: </th>
                    <td> Savings${actionBean.payee.transaction.date}</td>  
                </tr> 
                 <tr>
                    <th>Your account will be debited on : </th>
                    <td> <fmt:formatDate value="${actionBean.transaction.date}" dateStyle="medium"/></td>  
                </tr>
            </table>
            <div class="buttons">
            	<stripes:submit name="accountSummary" value="Back to Account Summary" /> 
            	<stripes:submit name="transfer" value="Make Another Transaction" />             	
            </div>

        </stripes:form>
    </stripes:layout-component>
</stripes:layout-render>