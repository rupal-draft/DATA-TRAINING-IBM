<%@ page import="online.abc.domain.Status"%>
<%@ include file="/abc/taglibs.jsp" %>

<stripes:layout-render name="/abc/layout/standard.jsp" title="Transfer Fund">
    <stripes:layout-component name="contents">

        
        <stripes:errors/>

        <stripes:form action="/online/abc/TransferFund.action">
            <table class="leftRightForm">
                
                        <stripes:hidden name="payee.id"/>
                        <stripes:hidden name="payee.transaction.date" />
                        
 
                <tr>
                    <th>Name:</th>
                    <td>${actionBean.payee.name}</td>
                    <stripes:hidden name="payee.name"/>
                </tr>
                <tr>
                    <th>Nick Name:</th>
                    <td>${actionBean.payee.nickName}</td>
                    <stripes:hidden name="payee.nickName"/>
                </tr>
                <tr>
                    <th>Bank:</th>
                    <td>
                        ${actionBean.payee.bank}
                        <stripes:hidden name="payee.bank"/>
                    </td>
                </tr>
                <tr>
                    <th>Branch:</th>
                    <td>
                       ${actionBean.payee.branch}
                       <stripes:hidden name="payee.branch"/>
                    </td>
                </tr>
                <tr>
                    <th>Account Number:</th>
                    <td>
                    	${actionBean.payee.accountNumber}
                    	<stripes:hidden name="payee.accountNumber"/>
                    </td>
                       <c:choose>
                    <c:when test="${actionBean.confirmTransfer}">
                       	<tr>
                    		<th>Amount:</th>
                    		<td>${actionBean.transaction.transactionAmount}</td>
                    		<stripes:hidden name="transaction.transactionAmount"/>
                		</tr>
                		<tr>
                    		<th>Transaction Remark:</th>
                    		<td>${actionBean.transaction.remarks}</td>
                    		<stripes:hidden name="transaction.remarks"/>
                		</tr>                 		                    
                    </c:when>                           
                    <c:otherwise>                    	
                        <tr>
                    		<th>Amount:</th>
                    		<td><stripes:text name="transaction.transactionAmount" value ="${actionBean.transaction.transactionAmount}"/></td>
                		</tr>
                		<tr>
                    		<th>Transaction Remark:</th>
                    		<td><stripes:text name="transaction.remarks" value ="${actionBean.transaction.remarks}"/></td>
                		</tr>                   
                    </c:otherwise>
                </c:choose>
                
            </table>
            <c:if test="${actionBean.confirmTransfer== true}">    
            <p></p>
				Note:

					<p>1.Please ensure that your account is funded sufficiently for us to process your request.</p>

					<p>2.You are advised that the Bank shall effect credit based solely on the beneficiary details

					so indicated by you. Please note that the Bank shall not be required to ascertain and / or 

					verify the beneficiary name and / or account number prior to effecting the fund transfer. 

					Remittance instructions so provided by you shall be based solely on the beneficiary account 

					number information so recorded with the Bank.</p> 
              <stripes:checkbox name="deleteIds" value="${person.id}"/>I understand and agree to the above. I have also read and accept the<b> Terms & 

				Conditions </b>for conducting a fund transfer.
             </c:if>       	
            <div class="buttons">
            <c:choose>
            <c:when test="${actionBean.confirmTransfer}">            	
                <stripes:submit name="cancel" value="Cancel"/>
                <stripes:submit name="transfer" value="Edit"/>
                <stripes:submit name="confirmTransfer" value="Confirm"/>                               
            </c:when>
             <c:otherwise>
             	<stripes:submit name="preTransfer" value="Transfer Fund"/>
                <stripes:submit name="cancel" value="Cancel"/> 
             </c:otherwise>
            </c:choose>
            </div>
        </stripes:form>
    </stripes:layout-component>
</stripes:layout-render>