package org.apache.jsp.bugzooky.layout;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/bugzooky/taglibs.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fstripes_005flink_0026_005fhref;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fstripes_005flink_0026_005fhref = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fstripes_005flink_0026_005fhref.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write('\n');
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"imageHeader\">\n");
      out.write("    <table style=\"padding: 5px; margin: 0px; width: 100%;\">\n");
      out.write("        <tr>\n");
      out.write("            <td id=\"pageHeader\">bugzooky: stripes demo application</td>\n");
      out.write("            <td id=\"loginInfo\">\n");
      out.write("                ");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            </td>\n");
      out.write("        </tr>\n");
      out.write("    </table>\n");
      out.write("    <div id=\"navLinks\">\n");
      out.write("        ");
      if (_jspx_meth_stripes_005flink_005f1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        ");
      if (_jspx_meth_stripes_005flink_005f2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        ");
      if (_jspx_meth_stripes_005flink_005f3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        ");
      if (_jspx_meth_stripes_005flink_005f4(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    </div>\n");
      out.write("</div>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fset_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f0.setParent(null);
    // /bugzooky/taglibs.jsp(7,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setVar("ctx");
    // /bugzooky/taglibs.jsp(7,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
    if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    // /bugzooky/layout/header.jsp(8,16) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty user}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                    Welcome: ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.firstName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write(' ');
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.lastName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\n");
        out.write("                    |\n");
        out.write("                    ");
        if (_jspx_meth_stripes_005flink_005f0(_jspx_th_c_005fif_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }

  private boolean _jspx_meth_stripes_005flink_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  stripes:link
    net.sourceforge.stripes.tag.LinkTag _jspx_th_stripes_005flink_005f0 = (net.sourceforge.stripes.tag.LinkTag) _005fjspx_005ftagPool_005fstripes_005flink_0026_005fhref.get(net.sourceforge.stripes.tag.LinkTag.class);
    _jspx_th_stripes_005flink_005f0.setPageContext(_jspx_page_context);
    _jspx_th_stripes_005flink_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
    // /bugzooky/layout/header.jsp(11,20) name = href type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005flink_005f0.setHref("/examples/bugzooky/Logout.action");
    int _jspx_eval_stripes_005flink_005f0 = _jspx_th_stripes_005flink_005f0.doStartTag();
    if (_jspx_eval_stripes_005flink_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_stripes_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_stripes_005flink_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_stripes_005flink_005f0.doInitBody();
      }
      do {
        out.write("Logout");
        int evalDoAfterBody = _jspx_th_stripes_005flink_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_stripes_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_stripes_005flink_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fstripes_005flink_0026_005fhref.reuse(_jspx_th_stripes_005flink_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fstripes_005flink_0026_005fhref.reuse(_jspx_th_stripes_005flink_005f0);
    return false;
  }

  private boolean _jspx_meth_stripes_005flink_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  stripes:link
    net.sourceforge.stripes.tag.LinkTag _jspx_th_stripes_005flink_005f1 = (net.sourceforge.stripes.tag.LinkTag) _005fjspx_005ftagPool_005fstripes_005flink_0026_005fhref.get(net.sourceforge.stripes.tag.LinkTag.class);
    _jspx_th_stripes_005flink_005f1.setPageContext(_jspx_page_context);
    _jspx_th_stripes_005flink_005f1.setParent(null);
    // /bugzooky/layout/header.jsp(17,8) name = href type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005flink_005f1.setHref("/bugzooky/BugList.jsp");
    int _jspx_eval_stripes_005flink_005f1 = _jspx_th_stripes_005flink_005f1.doStartTag();
    if (_jspx_eval_stripes_005flink_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_stripes_005flink_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_stripes_005flink_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_stripes_005flink_005f1.doInitBody();
      }
      do {
        out.write("Bug List");
        int evalDoAfterBody = _jspx_th_stripes_005flink_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_stripes_005flink_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_stripes_005flink_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fstripes_005flink_0026_005fhref.reuse(_jspx_th_stripes_005flink_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fstripes_005flink_0026_005fhref.reuse(_jspx_th_stripes_005flink_005f1);
    return false;
  }

  private boolean _jspx_meth_stripes_005flink_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  stripes:link
    net.sourceforge.stripes.tag.LinkTag _jspx_th_stripes_005flink_005f2 = (net.sourceforge.stripes.tag.LinkTag) _005fjspx_005ftagPool_005fstripes_005flink_0026_005fhref.get(net.sourceforge.stripes.tag.LinkTag.class);
    _jspx_th_stripes_005flink_005f2.setPageContext(_jspx_page_context);
    _jspx_th_stripes_005flink_005f2.setParent(null);
    // /bugzooky/layout/header.jsp(18,8) name = href type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005flink_005f2.setHref("/bugzooky/AddEditBug.jsp");
    int _jspx_eval_stripes_005flink_005f2 = _jspx_th_stripes_005flink_005f2.doStartTag();
    if (_jspx_eval_stripes_005flink_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_stripes_005flink_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_stripes_005flink_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_stripes_005flink_005f2.doInitBody();
      }
      do {
        out.write("Add Bug");
        int evalDoAfterBody = _jspx_th_stripes_005flink_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_stripes_005flink_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_stripes_005flink_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fstripes_005flink_0026_005fhref.reuse(_jspx_th_stripes_005flink_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fstripes_005flink_0026_005fhref.reuse(_jspx_th_stripes_005flink_005f2);
    return false;
  }

  private boolean _jspx_meth_stripes_005flink_005f3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  stripes:link
    net.sourceforge.stripes.tag.LinkTag _jspx_th_stripes_005flink_005f3 = (net.sourceforge.stripes.tag.LinkTag) _005fjspx_005ftagPool_005fstripes_005flink_0026_005fhref.get(net.sourceforge.stripes.tag.LinkTag.class);
    _jspx_th_stripes_005flink_005f3.setPageContext(_jspx_page_context);
    _jspx_th_stripes_005flink_005f3.setParent(null);
    // /bugzooky/layout/header.jsp(19,8) name = href type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005flink_005f3.setHref("/bugzooky/BulkAddEditBugs.jsp");
    int _jspx_eval_stripes_005flink_005f3 = _jspx_th_stripes_005flink_005f3.doStartTag();
    if (_jspx_eval_stripes_005flink_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_stripes_005flink_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_stripes_005flink_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_stripes_005flink_005f3.doInitBody();
      }
      do {
        out.write("Bulk Add");
        int evalDoAfterBody = _jspx_th_stripes_005flink_005f3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_stripes_005flink_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_stripes_005flink_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fstripes_005flink_0026_005fhref.reuse(_jspx_th_stripes_005flink_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fstripes_005flink_0026_005fhref.reuse(_jspx_th_stripes_005flink_005f3);
    return false;
  }

  private boolean _jspx_meth_stripes_005flink_005f4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  stripes:link
    net.sourceforge.stripes.tag.LinkTag _jspx_th_stripes_005flink_005f4 = (net.sourceforge.stripes.tag.LinkTag) _005fjspx_005ftagPool_005fstripes_005flink_0026_005fhref.get(net.sourceforge.stripes.tag.LinkTag.class);
    _jspx_th_stripes_005flink_005f4.setPageContext(_jspx_page_context);
    _jspx_th_stripes_005flink_005f4.setParent(null);
    // /bugzooky/layout/header.jsp(20,8) name = href type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005flink_005f4.setHref("/bugzooky/AdministerBugzooky.jsp");
    int _jspx_eval_stripes_005flink_005f4 = _jspx_th_stripes_005flink_005f4.doStartTag();
    if (_jspx_eval_stripes_005flink_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_stripes_005flink_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_stripes_005flink_005f4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_stripes_005flink_005f4.doInitBody();
      }
      do {
        out.write("Administer");
        int evalDoAfterBody = _jspx_th_stripes_005flink_005f4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_stripes_005flink_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_stripes_005flink_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fstripes_005flink_0026_005fhref.reuse(_jspx_th_stripes_005flink_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fstripes_005flink_0026_005fhref.reuse(_jspx_th_stripes_005flink_005f4);
    return false;
  }
}
