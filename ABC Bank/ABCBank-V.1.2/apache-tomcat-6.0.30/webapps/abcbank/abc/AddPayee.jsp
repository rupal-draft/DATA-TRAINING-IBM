<%@ page import="online.abc.domain.Bank"%>
<%@ page import="online.abc.domain.Branch"%>
<%@ include file="/abc/taglibs.jsp" %>

<stripes:layout-render name="/abc/layout/standard.jsp" title="Payee -Add">
    <stripes:layout-component name="contents">
        <stripes:errors/>

        <stripes:form action="/online/abc/AddEditPayee.action" focus="payee.name">
            <table class="leftRightForm">
                
                 <stripes:hidden name="payee.id" value="${actionBean.payee.id}"/>

                <tr>
                    <th>Name:</th>
                    <td><stripes:text name="payee.name" value="${actionBean.payee.name}"/></td>
                </tr>
                <tr>
                    <th>Nick Name:</th>
                    <td><stripes:text name="payee.nickName" value="${actionBean.payee.nickName}"/></td>
                </tr>
                    <th>Bank:</th>
                    <td>
                        <stripes:select name="payee.bank" value="${actionBean.payee.bank}">
                        	<stripes:option value=""/>
                            <stripes:options-enumeration enum="online.abc.domain.Bank"/>
                        </stripes:select>                       
                    </td>
                </tr>
                </tr>
                    <th>Branch:</th>
                    <td>
                        <stripes:select  name="payee.branch" disabled="${status}" value="${actionBean.payee.branch}">
                        	<stripes:option value=""/>
                            <stripes:options-enumeration enum="online.abc.domain.Branch"/>
                        </stripes:select>                        
                    </td>
                </tr>
                <tr>
                    <th>Account Number:</th>
                    <td><stripes:text  name="payee.accountNumber" value="${actionBean.payee.accountNumber}"/></td>
                </tr>                
            </table>

            <div class="buttons">
            	<stripes:submit name="save" value="Save" /> 
            	<stripes:submit name="saveAndTransfer" value="Save and Transfer Now" />           	 
           		<stripes:submit name="cancel" value="Cancel" />
            </div>
        </stripes:form>        
        
    </stripes:layout-component>
</stripes:layout-render>