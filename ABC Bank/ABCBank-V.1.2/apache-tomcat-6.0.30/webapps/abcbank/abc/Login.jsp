<%@ include file="/abc/taglibs.jsp" %>

<stripes:layout-render name="/abc/layout/standard.jsp" title="Login">
    <stripes:layout-component name="contents">

        <table style="vertical-align: top;">
            <tr>
                <td style="width: 25%; vertical-align: top;">
                    <!-- Somewhat contrived example of using the errors tag 'action' attribute. -->
                    <stripes:errors action="/online/abc/Login.action"/>

                    <stripes:form action="/online/abc/Login.action" focus="">
                        <table>
                            <tr>
                                <td style="font-weight: bold;"><stripes:label for="username"/>:</td>
                            </tr>
                            <tr>
                                <td><stripes:text name="username" value="${user.username}"/></td>
                            </tr>
                            <tr>
                                <td style="font-weight: bold;"><stripes:label for="password"/>:</td>
                            </tr>
                            <tr>
                                <td><stripes:password name="password"/></td>
                            </tr>
                            <tr>
                                <td style="text-align: center;" height="40">
                                    <%-- If the security servlet attached a targetUrl, carry that along. --%>
                                    <stripes:hidden name="targetUrl" value="${request.parameterMap['targetUrl']}"/>
                                    <stripes:submit name="login" value="Login"/>
                                    <stripes:submit name="cancel" value="Cancel"/>
                                </td>
                               
                            </tr>
                        </table>
                    </stripes:form>
                </td>
                <td style="vertical-align: top;">
                    <c:choose>
                        <c:when test="${empty user}">
                            <div class="sectionTitle">Welcome</div>

                            <p>Welcome to ABC internet banking. If you haven't already
                            created an account, you will need to
                            <stripes:link href="/abc/Register.jsp">register</stripes:link>
                            in order to log in.</p>
                        </c:when>

                        <c:otherwise>
                            <p>You are already logged in as '${user.username}'.  Logging in again will cause
                            you to  be logged out, and then re-logged in with the username and password
                            supplied.</p>
                        </c:otherwise>
                    </c:choose>
                </td>
            </tr>

        </table>
		<table style="padding: 0px; margin: 0px; width: 95%;">
        <tr>
            <td id="loginInfo">
                    <stripes:link href="/abc/HomePage.jsp">HOME</stripes:link>
            </td>
        </tr>
      </table>
    </stripes:layout-component>
</stripes:layout-render>
