<%@ include file="/abc/taglibs.jsp" %>

<stripes:layout-render name="/abc/layout/standard.jsp" title="Registered Payee List">
    <stripes:layout-component name="contents">
        <stripes:form action="/online/abc/Payee.action">
            <stripes:errors/>
        <c:choose>
          <c:when test="${not empty actionBean.payeeSearchResult}">
			<p>If you want to transfer funds to the payee who is not in the below list, click on 'Add New Payee' to register the payee. If you have already registered your payee, simply choose from the list below and transfer right away..</p>
            <table class="display">
                <tr>
                    <th>Name</th>
                    <th>Nick Name</th>
                    <th>Bank</th>
                    <th>Branch</th>
                    <th>Account Number</th>                    
                    <th colspan="3">Action</th>
                </tr>
                <c:forEach items="${actionBean.payeeSearchResult}" var="payee" varStatus="rowstat">
                    <tr class="${rowstat.count mod 2 == 0 ? "even" : "odd"}">                                       	
                        <stripes:hidden name="payee.id"/>
           
                        <td>${payee.name}</td>
                        <td>${payee.nickName}</td>
                        <td>${payee.bank}</td>
                        <td>${payee.branch}</td>
                        <td>${payee.accountNumber}</td>
                        <td>
                            <stripes:link href="/online/abc/AddEditPayee.action" event="edit">
                                Edit      
                                <stripes:param name="payee.id" value="${payee.id}"/>                                
                            </stripes:link>
                        </td>
                        <td>
                            <stripes:link href="/online/abc/AddEditPayee.action" event="delete"                                
                                onclick="return confirm('Delete ${payee.name}?');" >      
                                <stripes:param name="payee.id" value="${payee.id}"/>  
                                Delete                              
                            </stripes:link>
                        </td>
                        <td>
                            <stripes:link href="/online/abc/TransferFund.action" event="transfer">
                                Make Payment Now
                                <stripes:param name="payee.id" value="${payee.id}"/>
                                <stripes:param name="fromEdit" value="true"/>
                            </stripes:link>
                         </td>
                    </tr> 
               </c:forEach>           
            </table>
 			</c:when>
 			<c:otherwise>
 				<p>There is no payee registered in your account!</p>
 				<p>If you want to transfer funds, you can register a payee by,
 				 click on 'Add New Payee' link in the menu. </p> 			
 			</c:otherwise>
 		</c:choose>
        </stripes:form>
    </stripes:layout-component>
</stripes:layout-render>