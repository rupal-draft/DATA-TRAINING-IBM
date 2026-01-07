<%@ page import="online.abc.domain.Status"%>
<%@ include file="/abc/taglibs.jsp" %>

<stripes:layout-render name="/abc/layout/standard.jsp" title="Update Payee">
    <stripes:layout-component name="contents">

        
        <stripes:errors/>

        <stripes:form action="/online/abc/AddEditPayee.action">
            <table class="leftRightForm">
                
                        <stripes:hidden name="payee.id"/>
 
                <tr>
                    <th>Name:</th>
                    <td>${actionBean.payee.name}</td>
                    <stripes:hidden name="payee.name"/>
                </tr>
                <tr>
                <th>Nick Name:</th>  
                    	<td><stripes:text name="payee.nickName" value="${actionBean.payee.nickName}"/></td> 
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
                       
            </table>

            <div class="buttons">            
             	<stripes:submit name="update" value="Update"/>
             	<stripes:submit name="updateAndTransfer" value="Update and Transfer Now"/>             	
             	<stripes:submit name="cancel" value="Cancel"/>
            </div>
        </stripes:form>
    </stripes:layout-component>
</stripes:layout-render>