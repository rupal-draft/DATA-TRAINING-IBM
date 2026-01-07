<%@ page import="online.abc.domain.Gender"%>
<%@ include file="/abc/taglibs.jsp" %>

<stripes:layout-render name="/abc/layout/standard.jsp" title="Register">
    <stripes:layout-component name="contents">

        <stripes:errors globalErrorsOnly="true"/>

        <stripes:form action="/online/abc/Register.action" focus="first">
            <p>Please provide the following information:</p>
			<stripes:errors/>
            <table class="leftRightForm">
                <tr>
                    <th><stripes:label for="user.firstName"/>:</th>
                    <td>
                        <stripes:text name="user.firstName"/>                        
                    </td>
                </tr>
                <tr>
                    <th><stripes:label for="user.lastName"/>:</th>
                    <td>
                        <stripes:text name="user.lastName"/>                       
                    </td>
                </tr>
                <tr>
                    <th><stripes:label for="user.username"/>:</th>
                    <td>
                        <stripes:text name="user.username"/>                        
                    </td>
                </tr>
                <tr>
                    <th><stripes:label for="user.password"/>:</th>
                    <td><stripes:password name="user.password"/></td>
                </tr>
                <tr>
                    <th><stripes:label for="confirmPassword"/>:</th>
                    <td><stripes:password name="confirmPassword"/></td>
                </tr>
                <tr>
                    <th><stripes:label for="Sex"/>:</th>
                    <td>
                        <c:forEach var="gender" items="<%=Gender.values()%>">
                            <stripes:radio id="person.gender.${stripes:enumName(gender)}"
                                           name="person.gender"
                                           value="${stripes:enumName(gender)}"
                                           checked="Male"/>
                            <stripes:label for="person.gender.${stripes:enumName(gender)}">${stripes:enumName(gender)}</stripes:label>
                        </c:forEach>                                           
                    </td>
                </tr>
                <tr>
                    <th><stripes:label for="Date of Birth"/>:</th>
                    <td>
                        <stripes:text name="user.birthDate" formatPattern="yyyy-MM-dd"/>                        
                    </td>
                </tr>
                <tr>
                    <th><stripes:label for="user.age"/>:</th>
                    <td>
                        <stripes:text name="user.age"/>                        
                    </td>
                </tr>
                <tr>
                    <th><stripes:label for="user.email"/>:</th>
                    <td>
                        <stripes:text name="user.email"/>                        
                    </td>
                </tr>
                <tr>
                    <th><stripes:label for="user.address"/>:</th>
                    <td>
                        <stripes:textarea name="user.address"/>                        
                    </td>
                 </tr>
            </table>
             <div class="buttons">
                <stripes:submit name="register" value="Create Account"/>         
                <stripes:submit name="cancel" value="Cancel"/>                                                                         
        </div>    
	<table style="padding: 0px; margin: 0px; width: 95%;">
        <tr>
            <td id="loginInfo">
                    <stripes:link href="/abc/HomePage.jsp">HOME</stripes:link>
            </td>
        </tr>
      </table>  
             
        </stripes:form>
    </stripes:layout-component>
</stripes:layout-render>