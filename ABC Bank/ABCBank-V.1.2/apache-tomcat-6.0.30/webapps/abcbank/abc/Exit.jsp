<%@ include file="/abc/taglibs.jsp" %>

<stripes:layout-render name="/abc/layout/standard.jsp" title="Thank You For Using ABC online banking">
    <stripes:layout-component name="contents">
        <p>Thank you for using ABC Bank online. If
        you'd like to login again, just click below login.</p>

        
        <ul>
            <li><stripes:link href="/abc/Login.jsp">Login</stripes:link> Again?</li> 
            <li><stripes:link href="/abc/HomePage.jsp">Home</stripes:link></li>              
        </ul>
    </stripes:layout-component>
</stripes:layout-render>
