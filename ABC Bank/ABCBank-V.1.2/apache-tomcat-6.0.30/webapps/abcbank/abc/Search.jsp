<%@ include file="/abc/taglibs.jsp" %>

<stripes:layout-render name="/abc/layout/standard.jsp" title="Search">
    <stripes:layout-component name="contents">

        <table style="vertical-align: top;">
            <tr>
                <td style="width: 25%; vertical-align: top;">
                    <!-- Somewhat contrived example of using the errors tag 'action' attribute. -->
                    <stripes:errors action="/online/abc/Search.action"/>

                    <stripes:form action="/online/abc/Search.action" focus="">
                        <table>
                            <tr>
                                <td style="font-weight: bold;"><stripes:label for="payeeName"/>:</td>
                            </tr>
                            <tr>
                                <td><stripes:text name="payeeName" value="${actionBean.payeeName}"/></td>
                            </tr>                           
                            <tr>
                                <td style="text-align: center;">
                                    <%-- If the security servlet attached a targetUrl, carry that along. --%>
                                    <stripes:hidden name="targetUrl" value="${request.parameterMap['targetUrl']}"/>
                                    <stripes:submit name="search" value="Search"/>
                                </td>
                            </tr>
                        </table>
                    </stripes:form>
                </td>                
            </tr>
        </table>

    </stripes:layout-component>
</stripes:layout-render>
