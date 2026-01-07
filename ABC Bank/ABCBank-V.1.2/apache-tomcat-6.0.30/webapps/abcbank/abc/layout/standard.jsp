<%@ include file="/abc/taglibs.jsp" %>

<stripes:layout-definition>
    <!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
    <html>
        <head>
            <title>ABC Bank - ${title}</title>
            <link rel="stylesheet" type="text/css" href="${ctx}/abc/abc.css"/>
            <script type="text/javascript" src="${ctx}/abc/abc.js"></script>
            <stripes:layout-component name="html-head"/>
        </head>
        <body>
            <div id="contentPanel">
                <stripes:layout-component name="header">
                    <jsp:include page="/abc/layout/header.jsp"/>
                </stripes:layout-component>

                <div id="pageContent">
                    <div class="sectionTitle">${title}</div>
                    <stripes:messages/>
                    <stripes:layout-component name="contents"/>
                </div>

                <div id="footer">
                         <a href="mailto:kbineesh@gmail.com » 							
 							&subject=testingApp">Contact</a>| About ABC | Privacy |Terms of use | Safe Banking | Service Charges & Fees | E-Brochures | Jobs
               
                   
                </div>
            </div>
        </body>
    </html>
</stripes:layout-definition>
