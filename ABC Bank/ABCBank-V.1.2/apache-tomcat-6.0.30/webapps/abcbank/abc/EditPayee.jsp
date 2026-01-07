<%@ page import="online.abc.domain.Bank"%>
<%@ page import="online.abc.domain.Branch"%>
<%@ include file="/abc/taglibs.jsp" %>

<stripes:layout-render name="/abc/layout/standard.jsp" title="Payee">
    <stripes:layout-component name="contents">
        <stripes:errors/>

        <stripes:form action="/online/abc/Payee.action" focus="payee.nickName">
            <table class="leftRightForm">
                
                 <stripes:hidden name="payee.id" value="${actionBean.payee.id}"/>
 				<c:choose>
                    <c:when test="${actionBean.transferFund}">
                        <c:set var="status" value="true" scope="page"/>
                        <c:set var="editable" value="true" scope="page"/>                        
                    </c:when>
                    <c:when test="${empty actionBean.payee.id}">
                        <c:set var="editable" value="false" scope="page"/>
                        <c:set var="status" value="false" scope="page"/>                        
                    </c:when>                   
                    <c:otherwise>
                        <c:set var="status" value="true" scope="page"/> 
                        <c:set var="editable" value="false" scope="page"/>                      
                    </c:otherwise>
                </c:choose>
                <tr>
                    <th>Name:</th>
                    <td><stripes:text readonly="${status}" name="payee.name" value="${actionBean.payee.name}"/></td>
                </tr>
                <tr>
                    <th>Nick Name:</th>
                    <td><stripes:text name="payee.nickName" readonly="${editable}" value="${actionBean.payee.nickName}"/></td>
                </tr>
                    <th>Bank:</th>
                    <td>
                        <stripes:select name="payee.bank" disabled="${status}" value="${actionBean.payee.bank}">
                        	<stripes:option value=""/>
                            <stripes:options-enumeration enum="online.abc.domain.Bank"/>
                        </stripes:select>
                        <stripes:hidden name="payee.bank" value="${actionBean.payee.bank}"/>
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
                    <td><stripes:text readonly="true" name="payee.accountNumber" value="${actionBean.payee.accountNumber}"/></td>
                </tr>
                <c:if test="${actionBean.transferFund}">
                <th>Amount:</th>
                    <td><stripes:text name="amount" value="${actionBean.amount}"/></td> 
                    <tr>
                    <th>Transaction Remark:</th>
                    <td><stripes:text name="remark" value=""/></td> 
                    </tr>                  
                </c:if>
            </table>

            <div class="buttons">
            	<c:choose>
                    <c:when test="${actionBean.transferFund}">
                        <c:set var="action" value="transfer" scope="page"/>
                        <c:set var="actionButton" value="Transfer Fund" scope="page"/>
                    </c:when>                   
                    <c:otherwise>
                        <c:set var="action" value="save" scope="page"/>
                        <c:set var="actionButton" value="Save" scope="page"/>
                    </c:otherwise>
                </c:choose>
            <stripes:submit name="${action}" value="${actionButton}"/>                  
            </div>
        </stripes:form>
    </stripes:layout-component>
</stripes:layout-render>