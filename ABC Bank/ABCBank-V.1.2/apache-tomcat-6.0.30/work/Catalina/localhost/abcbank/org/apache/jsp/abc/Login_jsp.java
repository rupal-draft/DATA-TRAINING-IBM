package org.apache.jsp.abc;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/abc/taglibs.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fstripes_005flayout_002drender_0026_005ftitle_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fstripes_005ferrors_0026_005faction_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fstripes_005fform_0026_005ffocus_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fstripes_005flabel_0026_005ffor_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fstripes_005ftext_0026_005fvalue_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fstripes_005fpassword_0026_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fstripes_005fhidden_0026_005fvalue_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fstripes_005fsubmit_0026_005fvalue_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fstripes_005flink_0026_005fhref;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fstripes_005flayout_002drender_0026_005ftitle_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fstripes_005ferrors_0026_005faction_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fstripes_005fform_0026_005ffocus_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fstripes_005flabel_0026_005ffor_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fstripes_005ftext_0026_005fvalue_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fstripes_005fpassword_0026_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fstripes_005fhidden_0026_005fvalue_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fstripes_005fsubmit_0026_005fvalue_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fstripes_005flink_0026_005fhref = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fotherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fstripes_005flayout_002drender_0026_005ftitle_005fname.release();
    _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname.release();
    _005fjspx_005ftagPool_005fstripes_005ferrors_0026_005faction_005fnobody.release();
    _005fjspx_005ftagPool_005fstripes_005fform_0026_005ffocus_005faction.release();
    _005fjspx_005ftagPool_005fstripes_005flabel_0026_005ffor_005fnobody.release();
    _005fjspx_005ftagPool_005fstripes_005ftext_0026_005fvalue_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fstripes_005fpassword_0026_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fstripes_005fhidden_0026_005fvalue_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fstripes_005fsubmit_0026_005fvalue_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.release();
    _005fjspx_005ftagPool_005fstripes_005flink_0026_005fhref.release();
    _005fjspx_005ftagPool_005fc_005fotherwise.release();
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
      out.write('\n');
      out.write('\n');
      //  stripes:layout-render
      net.sourceforge.stripes.tag.layout.LayoutRenderTag _jspx_th_stripes_005flayout_002drender_005f0 = (net.sourceforge.stripes.tag.layout.LayoutRenderTag) _005fjspx_005ftagPool_005fstripes_005flayout_002drender_0026_005ftitle_005fname.get(net.sourceforge.stripes.tag.layout.LayoutRenderTag.class);
      _jspx_th_stripes_005flayout_002drender_005f0.setPageContext(_jspx_page_context);
      _jspx_th_stripes_005flayout_002drender_005f0.setParent(null);
      // /abc/Login.jsp(3,0) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_stripes_005flayout_002drender_005f0.setName("/abc/layout/standard.jsp");
      // /abc/Login.jsp(3,0) null
      _jspx_th_stripes_005flayout_002drender_005f0.setDynamicAttribute(null, "title", new String("Login"));
      int _jspx_eval_stripes_005flayout_002drender_005f0 = _jspx_th_stripes_005flayout_002drender_005f0.doStartTag();
      if (_jspx_eval_stripes_005flayout_002drender_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_stripes_005flayout_002drender_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_stripes_005flayout_002drender_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_stripes_005flayout_002drender_005f0.doInitBody();
        }
        do {
          out.write("\n");
          out.write("    ");
          //  stripes:layout-component
          net.sourceforge.stripes.tag.layout.LayoutComponentTag _jspx_th_stripes_005flayout_002dcomponent_005f0 = (net.sourceforge.stripes.tag.layout.LayoutComponentTag) _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname.get(net.sourceforge.stripes.tag.layout.LayoutComponentTag.class);
          _jspx_th_stripes_005flayout_002dcomponent_005f0.setPageContext(_jspx_page_context);
          _jspx_th_stripes_005flayout_002dcomponent_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005flayout_002drender_005f0);
          // /abc/Login.jsp(4,4) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_stripes_005flayout_002dcomponent_005f0.setName("contents");
          int _jspx_eval_stripes_005flayout_002dcomponent_005f0 = _jspx_th_stripes_005flayout_002dcomponent_005f0.doStartTag();
          if (_jspx_eval_stripes_005flayout_002dcomponent_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            out.write("\n");
            out.write("\n");
            out.write("        <table style=\"vertical-align: top;\">\n");
            out.write("            <tr>\n");
            out.write("                <td style=\"width: 25%; vertical-align: top;\">\n");
            out.write("                    <!-- Somewhat contrived example of using the errors tag 'action' attribute. -->\n");
            out.write("                    ");
            //  stripes:errors
            net.sourceforge.stripes.tag.ErrorsTag _jspx_th_stripes_005ferrors_005f0 = (net.sourceforge.stripes.tag.ErrorsTag) _005fjspx_005ftagPool_005fstripes_005ferrors_0026_005faction_005fnobody.get(net.sourceforge.stripes.tag.ErrorsTag.class);
            _jspx_th_stripes_005ferrors_005f0.setPageContext(_jspx_page_context);
            _jspx_th_stripes_005ferrors_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005flayout_002dcomponent_005f0);
            // /abc/Login.jsp(10,20) name = action type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_stripes_005ferrors_005f0.setAction("/online/abc/Login.action");
            int _jspx_eval_stripes_005ferrors_005f0 = _jspx_th_stripes_005ferrors_005f0.doStartTag();
            if (_jspx_th_stripes_005ferrors_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              _005fjspx_005ftagPool_005fstripes_005ferrors_0026_005faction_005fnobody.reuse(_jspx_th_stripes_005ferrors_005f0);
              return;
            }
            _005fjspx_005ftagPool_005fstripes_005ferrors_0026_005faction_005fnobody.reuse(_jspx_th_stripes_005ferrors_005f0);
            out.write("\n");
            out.write("\n");
            out.write("                    ");
            if (_jspx_meth_stripes_005fform_005f0(_jspx_th_stripes_005flayout_002dcomponent_005f0, _jspx_page_context))
              return;
            out.write("\n");
            out.write("                </td>\n");
            out.write("                <td style=\"vertical-align: top;\">\n");
            out.write("                    ");
            if (_jspx_meth_c_005fchoose_005f0(_jspx_th_stripes_005flayout_002dcomponent_005f0, _jspx_page_context))
              return;
            out.write("\n");
            out.write("                </td>\n");
            out.write("            </tr>\n");
            out.write("\n");
            out.write("        </table>\n");
            out.write("\t\t<table style=\"padding: 0px; margin: 0px; width: 95%;\">\n");
            out.write("        <tr>\n");
            out.write("            <td id=\"loginInfo\">\n");
            out.write("                    ");
            if (_jspx_meth_stripes_005flink_005f1(_jspx_th_stripes_005flayout_002dcomponent_005f0, _jspx_page_context))
              return;
            out.write("\n");
            out.write("            </td>\n");
            out.write("        </tr>\n");
            out.write("      </table>\n");
            out.write("    ");
          }
          if (_jspx_th_stripes_005flayout_002dcomponent_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname.reuse(_jspx_th_stripes_005flayout_002dcomponent_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname.reuse(_jspx_th_stripes_005flayout_002dcomponent_005f0);
          out.write('\n');
          int evalDoAfterBody = _jspx_th_stripes_005flayout_002drender_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_stripes_005flayout_002drender_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_stripes_005flayout_002drender_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fstripes_005flayout_002drender_0026_005ftitle_005fname.reuse(_jspx_th_stripes_005flayout_002drender_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fstripes_005flayout_002drender_0026_005ftitle_005fname.reuse(_jspx_th_stripes_005flayout_002drender_005f0);
      out.write('\n');
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
    // /abc/taglibs.jsp(7,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setVar("ctx");
    // /abc/taglibs.jsp(7,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
    if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
    return false;
  }

  private boolean _jspx_meth_stripes_005fform_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005flayout_002dcomponent_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  stripes:form
    net.sourceforge.stripes.tag.FormTag _jspx_th_stripes_005fform_005f0 = (net.sourceforge.stripes.tag.FormTag) _005fjspx_005ftagPool_005fstripes_005fform_0026_005ffocus_005faction.get(net.sourceforge.stripes.tag.FormTag.class);
    _jspx_th_stripes_005fform_005f0.setPageContext(_jspx_page_context);
    _jspx_th_stripes_005fform_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005flayout_002dcomponent_005f0);
    // /abc/Login.jsp(12,20) name = action type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005fform_005f0.setAction("/online/abc/Login.action");
    // /abc/Login.jsp(12,20) name = focus type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005fform_005f0.setFocus("");
    int[] _jspx_push_body_count_stripes_005fform_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_stripes_005fform_005f0 = _jspx_th_stripes_005fform_005f0.doStartTag();
      if (_jspx_eval_stripes_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_stripes_005fform_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_push_body_count_stripes_005fform_005f0[0]++;
          _jspx_th_stripes_005fform_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_stripes_005fform_005f0.doInitBody();
        }
        do {
          out.write("\n");
          out.write("                        <table>\n");
          out.write("                            <tr>\n");
          out.write("                                <td style=\"font-weight: bold;\">");
          if (_jspx_meth_stripes_005flabel_005f0(_jspx_th_stripes_005fform_005f0, _jspx_page_context, _jspx_push_body_count_stripes_005fform_005f0))
            return true;
          out.write(":</td>\n");
          out.write("                            </tr>\n");
          out.write("                            <tr>\n");
          out.write("                                <td>");
          if (_jspx_meth_stripes_005ftext_005f0(_jspx_th_stripes_005fform_005f0, _jspx_page_context, _jspx_push_body_count_stripes_005fform_005f0))
            return true;
          out.write("</td>\n");
          out.write("                            </tr>\n");
          out.write("                            <tr>\n");
          out.write("                                <td style=\"font-weight: bold;\">");
          if (_jspx_meth_stripes_005flabel_005f1(_jspx_th_stripes_005fform_005f0, _jspx_page_context, _jspx_push_body_count_stripes_005fform_005f0))
            return true;
          out.write(":</td>\n");
          out.write("                            </tr>\n");
          out.write("                            <tr>\n");
          out.write("                                <td>");
          if (_jspx_meth_stripes_005fpassword_005f0(_jspx_th_stripes_005fform_005f0, _jspx_page_context, _jspx_push_body_count_stripes_005fform_005f0))
            return true;
          out.write("</td>\n");
          out.write("                            </tr>\n");
          out.write("                            <tr>\n");
          out.write("                                <td style=\"text-align: center;\" height=\"40\">\n");
          out.write("                                    ");
          out.write("\n");
          out.write("                                    ");
          if (_jspx_meth_stripes_005fhidden_005f0(_jspx_th_stripes_005fform_005f0, _jspx_page_context, _jspx_push_body_count_stripes_005fform_005f0))
            return true;
          out.write("\n");
          out.write("                                    ");
          if (_jspx_meth_stripes_005fsubmit_005f0(_jspx_th_stripes_005fform_005f0, _jspx_page_context, _jspx_push_body_count_stripes_005fform_005f0))
            return true;
          out.write("\n");
          out.write("                                    ");
          if (_jspx_meth_stripes_005fsubmit_005f1(_jspx_th_stripes_005fform_005f0, _jspx_page_context, _jspx_push_body_count_stripes_005fform_005f0))
            return true;
          out.write("\n");
          out.write("                                </td>\n");
          out.write("                               \n");
          out.write("                            </tr>\n");
          out.write("                        </table>\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_stripes_005fform_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_stripes_005fform_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_stripes_005fform_005f0[0]--;
        }
      }
      if (_jspx_th_stripes_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_stripes_005fform_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_stripes_005fform_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_stripes_005fform_005f0.doFinally();
      _005fjspx_005ftagPool_005fstripes_005fform_0026_005ffocus_005faction.reuse(_jspx_th_stripes_005fform_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_stripes_005flabel_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_stripes_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  stripes:label
    net.sourceforge.stripes.tag.InputLabelTag _jspx_th_stripes_005flabel_005f0 = (net.sourceforge.stripes.tag.InputLabelTag) _005fjspx_005ftagPool_005fstripes_005flabel_0026_005ffor_005fnobody.get(net.sourceforge.stripes.tag.InputLabelTag.class);
    _jspx_th_stripes_005flabel_005f0.setPageContext(_jspx_page_context);
    _jspx_th_stripes_005flabel_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005fform_005f0);
    // /abc/Login.jsp(15,63) name = for type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005flabel_005f0.setFor("username");
    int[] _jspx_push_body_count_stripes_005flabel_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_stripes_005flabel_005f0 = _jspx_th_stripes_005flabel_005f0.doStartTag();
      if (_jspx_th_stripes_005flabel_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_stripes_005flabel_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_stripes_005flabel_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_stripes_005flabel_005f0.doFinally();
      _005fjspx_005ftagPool_005fstripes_005flabel_0026_005ffor_005fnobody.reuse(_jspx_th_stripes_005flabel_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_stripes_005ftext_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_stripes_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  stripes:text
    net.sourceforge.stripes.tag.InputTextTag _jspx_th_stripes_005ftext_005f0 = (net.sourceforge.stripes.tag.InputTextTag) _005fjspx_005ftagPool_005fstripes_005ftext_0026_005fvalue_005fname_005fnobody.get(net.sourceforge.stripes.tag.InputTextTag.class);
    _jspx_th_stripes_005ftext_005f0.setPageContext(_jspx_page_context);
    _jspx_th_stripes_005ftext_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005fform_005f0);
    // /abc/Login.jsp(18,36) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005ftext_005f0.setName("username");
    // /abc/Login.jsp(18,36) name = value type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005ftext_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.username}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int[] _jspx_push_body_count_stripes_005ftext_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_stripes_005ftext_005f0 = _jspx_th_stripes_005ftext_005f0.doStartTag();
      if (_jspx_th_stripes_005ftext_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_stripes_005ftext_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_stripes_005ftext_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_stripes_005ftext_005f0.doFinally();
      _005fjspx_005ftagPool_005fstripes_005ftext_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_stripes_005ftext_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_stripes_005flabel_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_stripes_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  stripes:label
    net.sourceforge.stripes.tag.InputLabelTag _jspx_th_stripes_005flabel_005f1 = (net.sourceforge.stripes.tag.InputLabelTag) _005fjspx_005ftagPool_005fstripes_005flabel_0026_005ffor_005fnobody.get(net.sourceforge.stripes.tag.InputLabelTag.class);
    _jspx_th_stripes_005flabel_005f1.setPageContext(_jspx_page_context);
    _jspx_th_stripes_005flabel_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005fform_005f0);
    // /abc/Login.jsp(21,63) name = for type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005flabel_005f1.setFor("password");
    int[] _jspx_push_body_count_stripes_005flabel_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_stripes_005flabel_005f1 = _jspx_th_stripes_005flabel_005f1.doStartTag();
      if (_jspx_th_stripes_005flabel_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_stripes_005flabel_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_stripes_005flabel_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_stripes_005flabel_005f1.doFinally();
      _005fjspx_005ftagPool_005fstripes_005flabel_0026_005ffor_005fnobody.reuse(_jspx_th_stripes_005flabel_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_stripes_005fpassword_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_stripes_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  stripes:password
    net.sourceforge.stripes.tag.InputPasswordTag _jspx_th_stripes_005fpassword_005f0 = (net.sourceforge.stripes.tag.InputPasswordTag) _005fjspx_005ftagPool_005fstripes_005fpassword_0026_005fname_005fnobody.get(net.sourceforge.stripes.tag.InputPasswordTag.class);
    _jspx_th_stripes_005fpassword_005f0.setPageContext(_jspx_page_context);
    _jspx_th_stripes_005fpassword_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005fform_005f0);
    // /abc/Login.jsp(24,36) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005fpassword_005f0.setName("password");
    int[] _jspx_push_body_count_stripes_005fpassword_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_stripes_005fpassword_005f0 = _jspx_th_stripes_005fpassword_005f0.doStartTag();
      if (_jspx_th_stripes_005fpassword_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_stripes_005fpassword_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_stripes_005fpassword_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_stripes_005fpassword_005f0.doFinally();
      _005fjspx_005ftagPool_005fstripes_005fpassword_0026_005fname_005fnobody.reuse(_jspx_th_stripes_005fpassword_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_stripes_005fhidden_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_stripes_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  stripes:hidden
    net.sourceforge.stripes.tag.InputHiddenTag _jspx_th_stripes_005fhidden_005f0 = (net.sourceforge.stripes.tag.InputHiddenTag) _005fjspx_005ftagPool_005fstripes_005fhidden_0026_005fvalue_005fname_005fnobody.get(net.sourceforge.stripes.tag.InputHiddenTag.class);
    _jspx_th_stripes_005fhidden_005f0.setPageContext(_jspx_page_context);
    _jspx_th_stripes_005fhidden_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005fform_005f0);
    // /abc/Login.jsp(29,36) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005fhidden_005f0.setName("targetUrl");
    // /abc/Login.jsp(29,36) name = value type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005fhidden_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${request.parameterMap['targetUrl']}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int[] _jspx_push_body_count_stripes_005fhidden_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_stripes_005fhidden_005f0 = _jspx_th_stripes_005fhidden_005f0.doStartTag();
      if (_jspx_th_stripes_005fhidden_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_stripes_005fhidden_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_stripes_005fhidden_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_stripes_005fhidden_005f0.doFinally();
      _005fjspx_005ftagPool_005fstripes_005fhidden_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_stripes_005fhidden_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_stripes_005fsubmit_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_stripes_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  stripes:submit
    net.sourceforge.stripes.tag.InputSubmitTag _jspx_th_stripes_005fsubmit_005f0 = (net.sourceforge.stripes.tag.InputSubmitTag) _005fjspx_005ftagPool_005fstripes_005fsubmit_0026_005fvalue_005fname_005fnobody.get(net.sourceforge.stripes.tag.InputSubmitTag.class);
    _jspx_th_stripes_005fsubmit_005f0.setPageContext(_jspx_page_context);
    _jspx_th_stripes_005fsubmit_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005fform_005f0);
    // /abc/Login.jsp(30,36) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005fsubmit_005f0.setName("login");
    // /abc/Login.jsp(30,36) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005fsubmit_005f0.setValue("Login");
    int[] _jspx_push_body_count_stripes_005fsubmit_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_stripes_005fsubmit_005f0 = _jspx_th_stripes_005fsubmit_005f0.doStartTag();
      if (_jspx_th_stripes_005fsubmit_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_stripes_005fsubmit_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_stripes_005fsubmit_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_stripes_005fsubmit_005f0.doFinally();
      _005fjspx_005ftagPool_005fstripes_005fsubmit_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_stripes_005fsubmit_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_stripes_005fsubmit_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_stripes_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  stripes:submit
    net.sourceforge.stripes.tag.InputSubmitTag _jspx_th_stripes_005fsubmit_005f1 = (net.sourceforge.stripes.tag.InputSubmitTag) _005fjspx_005ftagPool_005fstripes_005fsubmit_0026_005fvalue_005fname_005fnobody.get(net.sourceforge.stripes.tag.InputSubmitTag.class);
    _jspx_th_stripes_005fsubmit_005f1.setPageContext(_jspx_page_context);
    _jspx_th_stripes_005fsubmit_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005fform_005f0);
    // /abc/Login.jsp(31,36) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005fsubmit_005f1.setName("cancel");
    // /abc/Login.jsp(31,36) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005fsubmit_005f1.setValue("Cancel");
    int[] _jspx_push_body_count_stripes_005fsubmit_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_stripes_005fsubmit_005f1 = _jspx_th_stripes_005fsubmit_005f1.doStartTag();
      if (_jspx_th_stripes_005fsubmit_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_stripes_005fsubmit_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_stripes_005fsubmit_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_stripes_005fsubmit_005f1.doFinally();
      _005fjspx_005ftagPool_005fstripes_005fsubmit_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_stripes_005fsubmit_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fchoose_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005flayout_002dcomponent_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fchoose_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005flayout_002dcomponent_005f0);
    int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
    if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                        ");
        if (_jspx_meth_c_005fwhen_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\n");
        out.write("                        ");
        if (_jspx_meth_c_005fotherwise_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_005fchoose_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fchoose_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
    // /abc/Login.jsp(40,24) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty user}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
    if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            <div class=\"sectionTitle\">Welcome</div>\n");
        out.write("\n");
        out.write("                            <p>Welcome to ABC internet banking. If you haven't already\n");
        out.write("                            created an account, you will need to\n");
        out.write("                            ");
        if (_jspx_meth_stripes_005flink_005f0(_jspx_th_c_005fwhen_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                            in order to log in.</p>\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_005fwhen_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fwhen_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
    return false;
  }

  private boolean _jspx_meth_stripes_005flink_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  stripes:link
    net.sourceforge.stripes.tag.LinkTag _jspx_th_stripes_005flink_005f0 = (net.sourceforge.stripes.tag.LinkTag) _005fjspx_005ftagPool_005fstripes_005flink_0026_005fhref.get(net.sourceforge.stripes.tag.LinkTag.class);
    _jspx_th_stripes_005flink_005f0.setPageContext(_jspx_page_context);
    _jspx_th_stripes_005flink_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f0);
    // /abc/Login.jsp(45,28) name = href type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005flink_005f0.setHref("/abc/Register.jsp");
    int _jspx_eval_stripes_005flink_005f0 = _jspx_th_stripes_005flink_005f0.doStartTag();
    if (_jspx_eval_stripes_005flink_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_stripes_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_stripes_005flink_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_stripes_005flink_005f0.doInitBody();
      }
      do {
        out.write("register");
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

  private boolean _jspx_meth_c_005fotherwise_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_005fotherwise_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fotherwise_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
    int _jspx_eval_c_005fotherwise_005f0 = _jspx_th_c_005fotherwise_005f0.doStartTag();
    if (_jspx_eval_c_005fotherwise_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            <p>You are already logged in as '");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.username}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("'.  Logging in again will cause\n");
        out.write("                            you to  be logged out, and then re-logged in with the username and password\n");
        out.write("                            supplied.</p>\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_005fotherwise_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fotherwise_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
    return false;
  }

  private boolean _jspx_meth_stripes_005flink_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005flayout_002dcomponent_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  stripes:link
    net.sourceforge.stripes.tag.LinkTag _jspx_th_stripes_005flink_005f1 = (net.sourceforge.stripes.tag.LinkTag) _005fjspx_005ftagPool_005fstripes_005flink_0026_005fhref.get(net.sourceforge.stripes.tag.LinkTag.class);
    _jspx_th_stripes_005flink_005f1.setPageContext(_jspx_page_context);
    _jspx_th_stripes_005flink_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005flayout_002dcomponent_005f0);
    // /abc/Login.jsp(62,20) name = href type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005flink_005f1.setHref("/abc/HomePage.jsp");
    int _jspx_eval_stripes_005flink_005f1 = _jspx_th_stripes_005flink_005f1.doStartTag();
    if (_jspx_eval_stripes_005flink_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_stripes_005flink_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_stripes_005flink_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_stripes_005flink_005f1.doInitBody();
      }
      do {
        out.write("HOME");
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
}
