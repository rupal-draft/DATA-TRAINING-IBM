<%@ include file="/abc/taglibs.jsp" %>

<stripes:layout-render name="/abc/layout/standard.jsp" title="ABC online banking">
    <stripes:layout-component name="contents">
        <p></p>

        
        <ul>
            <li><stripes:link href="/abc/Login.jsp">Login</stripes:link></li> 
            <li>New User? :    <stripes:link href="/abc/Register.jsp">Register</stripes:link></li>            
        </ul>
    </stripes:layout-component>
</stripes:layout-render>
