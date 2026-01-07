package org.apache.jsp.abc;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import online.abc.domain.Status;

public final class TransferFund_jsp extends org.apache.jasper.runtime.HttpJspBase
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
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fstripes_005ferrors_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fstripes_005fform_0026_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fstripes_005fhidden_0026_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fstripes_005ftext_0026_005fvalue_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fstripes_005fcheckbox_0026_005fvalue_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fstripes_005fsubmit_0026_005fvalue_005fname_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fstripes_005flayout_002drender_0026_005ftitle_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fstripes_005ferrors_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fstripes_005fform_0026_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fstripes_005fhidden_0026_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fotherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fstripes_005ftext_0026_005fvalue_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fstripes_005fcheckbox_0026_005fvalue_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fstripes_005fsubmit_0026_005fvalue_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fstripes_005flayout_002drender_0026_005ftitle_005fname.release();
    _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname.release();
    _005fjspx_005ftagPool_005fstripes_005ferrors_005fnobody.release();
    _005fjspx_005ftagPool_005fstripes_005fform_0026_005faction.release();
    _005fjspx_005ftagPool_005fstripes_005fhidden_0026_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fotherwise.release();
    _005fjspx_005ftagPool_005fstripes_005ftext_0026_005fvalue_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fstripes_005fcheckbox_0026_005fvalue_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fstripes_005fsubmit_0026_005fvalue_005fname_005fnobody.release();
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

      out.write('\n');
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
      // /abc/TransferFund.jsp(4,0) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_stripes_005flayout_002drender_005f0.setName("/abc/layout/standard.jsp");
      // /abc/TransferFund.jsp(4,0) null
      _jspx_th_stripes_005flayout_002drender_005f0.setDynamicAttribute(null, "title", new String("Transfer Fund"));
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
          // /abc/TransferFund.jsp(5,4) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_stripes_005flayout_002dcomponent_005f0.setName("contents");
          int _jspx_eval_stripes_005flayout_002dcomponent_005f0 = _jspx_th_stripes_005flayout_002dcomponent_005f0.doStartTag();
          if (_jspx_eval_stripes_005flayout_002dcomponent_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            out.write("\n");
            out.write("\n");
            out.write("        \n");
            out.write("        ");
            //  stripes:errors
            net.sourceforge.stripes.tag.ErrorsTag _jspx_th_stripes_005ferrors_005f0 = (net.sourceforge.stripes.tag.ErrorsTag) _005fjspx_005ftagPool_005fstripes_005ferrors_005fnobody.get(net.sourceforge.stripes.tag.ErrorsTag.class);
            _jspx_th_stripes_005ferrors_005f0.setPageContext(_jspx_page_context);
            _jspx_th_stripes_005ferrors_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005flayout_002dcomponent_005f0);
            int _jspx_eval_stripes_005ferrors_005f0 = _jspx_th_stripes_005ferrors_005f0.doStartTag();
            if (_jspx_th_stripes_005ferrors_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              _005fjspx_005ftagPool_005fstripes_005ferrors_005fnobody.reuse(_jspx_th_stripes_005ferrors_005f0);
              return;
            }
            _005fjspx_005ftagPool_005fstripes_005ferrors_005fnobody.reuse(_jspx_th_stripes_005ferrors_005f0);
            out.write("\n");
            out.write("\n");
            out.write("        ");
            if (_jspx_meth_stripes_005fform_005f0(_jspx_th_stripes_005flayout_002dcomponent_005f0, _jspx_page_context))
              return;
            out.write("\n");
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
    net.sourceforge.stripes.tag.FormTag _jspx_th_stripes_005fform_005f0 = (net.sourceforge.stripes.tag.FormTag) _005fjspx_005ftagPool_005fstripes_005fform_0026_005faction.get(net.sourceforge.stripes.tag.FormTag.class);
    _jspx_th_stripes_005fform_005f0.setPageContext(_jspx_page_context);
    _jspx_th_stripes_005fform_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005flayout_002dcomponent_005f0);
    // /abc/TransferFund.jsp(10,8) name = action type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005fform_005f0.setAction("/online/abc/TransferFund.action");
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
          out.write("            <table class=\"leftRightForm\">\n");
          out.write("                \n");
          out.write("                        ");
          if (_jspx_meth_stripes_005fhidden_005f0(_jspx_th_stripes_005fform_005f0, _jspx_page_context, _jspx_push_body_count_stripes_005fform_005f0))
            return true;
          out.write("\n");
          out.write("                        ");
          if (_jspx_meth_stripes_005fhidden_005f1(_jspx_th_stripes_005fform_005f0, _jspx_page_context, _jspx_push_body_count_stripes_005fform_005f0))
            return true;
          out.write("\n");
          out.write("                        \n");
          out.write(" \n");
          out.write("                <tr>\n");
          out.write("                    <th>Name:</th>\n");
          out.write("                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${actionBean.payee.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\n");
          out.write("                    ");
          if (_jspx_meth_stripes_005fhidden_005f2(_jspx_th_stripes_005fform_005f0, _jspx_page_context, _jspx_push_body_count_stripes_005fform_005f0))
            return true;
          out.write("\n");
          out.write("                </tr>\n");
          out.write("                <tr>\n");
          out.write("                    <th>Nick Name:</th>\n");
          out.write("                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${actionBean.payee.nickName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\n");
          out.write("                    ");
          if (_jspx_meth_stripes_005fhidden_005f3(_jspx_th_stripes_005fform_005f0, _jspx_page_context, _jspx_push_body_count_stripes_005fform_005f0))
            return true;
          out.write("\n");
          out.write("                </tr>\n");
          out.write("                <tr>\n");
          out.write("                    <th>Bank:</th>\n");
          out.write("                    <td>\n");
          out.write("                        ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${actionBean.payee.bank}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\n");
          out.write("                        ");
          if (_jspx_meth_stripes_005fhidden_005f4(_jspx_th_stripes_005fform_005f0, _jspx_page_context, _jspx_push_body_count_stripes_005fform_005f0))
            return true;
          out.write("\n");
          out.write("                    </td>\n");
          out.write("                </tr>\n");
          out.write("                <tr>\n");
          out.write("                    <th>Branch:</th>\n");
          out.write("                    <td>\n");
          out.write("                       ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${actionBean.payee.branch}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\n");
          out.write("                       ");
          if (_jspx_meth_stripes_005fhidden_005f5(_jspx_th_stripes_005fform_005f0, _jspx_page_context, _jspx_push_body_count_stripes_005fform_005f0))
            return true;
          out.write("\n");
          out.write("                    </td>\n");
          out.write("                </tr>\n");
          out.write("                <tr>\n");
          out.write("                    <th>Account Number:</th>\n");
          out.write("                    <td>\n");
          out.write("                    \t");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${actionBean.payee.accountNumber}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\n");
          out.write("                    \t");
          if (_jspx_meth_stripes_005fhidden_005f6(_jspx_th_stripes_005fform_005f0, _jspx_page_context, _jspx_push_body_count_stripes_005fform_005f0))
            return true;
          out.write("\n");
          out.write("                    </td>\n");
          out.write("                       ");
          if (_jspx_meth_c_005fchoose_005f0(_jspx_th_stripes_005fform_005f0, _jspx_page_context, _jspx_push_body_count_stripes_005fform_005f0))
            return true;
          out.write("\n");
          out.write("                \n");
          out.write("            </table>\n");
          out.write("            ");
          if (_jspx_meth_c_005fif_005f0(_jspx_th_stripes_005fform_005f0, _jspx_page_context, _jspx_push_body_count_stripes_005fform_005f0))
            return true;
          out.write("       \t\n");
          out.write("            <div class=\"buttons\">\n");
          out.write("            ");
          if (_jspx_meth_c_005fchoose_005f1(_jspx_th_stripes_005fform_005f0, _jspx_page_context, _jspx_push_body_count_stripes_005fform_005f0))
            return true;
          out.write("\n");
          out.write("            </div>\n");
          out.write("        ");
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
      _005fjspx_005ftagPool_005fstripes_005fform_0026_005faction.reuse(_jspx_th_stripes_005fform_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_stripes_005fhidden_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_stripes_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  stripes:hidden
    net.sourceforge.stripes.tag.InputHiddenTag _jspx_th_stripes_005fhidden_005f0 = (net.sourceforge.stripes.tag.InputHiddenTag) _005fjspx_005ftagPool_005fstripes_005fhidden_0026_005fname_005fnobody.get(net.sourceforge.stripes.tag.InputHiddenTag.class);
    _jspx_th_stripes_005fhidden_005f0.setPageContext(_jspx_page_context);
    _jspx_th_stripes_005fhidden_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005fform_005f0);
    // /abc/TransferFund.jsp(13,24) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005fhidden_005f0.setName("payee.id");
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
      _005fjspx_005ftagPool_005fstripes_005fhidden_0026_005fname_005fnobody.reuse(_jspx_th_stripes_005fhidden_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_stripes_005fhidden_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_stripes_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  stripes:hidden
    net.sourceforge.stripes.tag.InputHiddenTag _jspx_th_stripes_005fhidden_005f1 = (net.sourceforge.stripes.tag.InputHiddenTag) _005fjspx_005ftagPool_005fstripes_005fhidden_0026_005fname_005fnobody.get(net.sourceforge.stripes.tag.InputHiddenTag.class);
    _jspx_th_stripes_005fhidden_005f1.setPageContext(_jspx_page_context);
    _jspx_th_stripes_005fhidden_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005fform_005f0);
    // /abc/TransferFund.jsp(14,24) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005fhidden_005f1.setName("payee.transaction.date");
    int[] _jspx_push_body_count_stripes_005fhidden_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_stripes_005fhidden_005f1 = _jspx_th_stripes_005fhidden_005f1.doStartTag();
      if (_jspx_th_stripes_005fhidden_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_stripes_005fhidden_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_stripes_005fhidden_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_stripes_005fhidden_005f1.doFinally();
      _005fjspx_005ftagPool_005fstripes_005fhidden_0026_005fname_005fnobody.reuse(_jspx_th_stripes_005fhidden_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_stripes_005fhidden_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_stripes_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  stripes:hidden
    net.sourceforge.stripes.tag.InputHiddenTag _jspx_th_stripes_005fhidden_005f2 = (net.sourceforge.stripes.tag.InputHiddenTag) _005fjspx_005ftagPool_005fstripes_005fhidden_0026_005fname_005fnobody.get(net.sourceforge.stripes.tag.InputHiddenTag.class);
    _jspx_th_stripes_005fhidden_005f2.setPageContext(_jspx_page_context);
    _jspx_th_stripes_005fhidden_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005fform_005f0);
    // /abc/TransferFund.jsp(20,20) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005fhidden_005f2.setName("payee.name");
    int[] _jspx_push_body_count_stripes_005fhidden_005f2 = new int[] { 0 };
    try {
      int _jspx_eval_stripes_005fhidden_005f2 = _jspx_th_stripes_005fhidden_005f2.doStartTag();
      if (_jspx_th_stripes_005fhidden_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_stripes_005fhidden_005f2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_stripes_005fhidden_005f2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_stripes_005fhidden_005f2.doFinally();
      _005fjspx_005ftagPool_005fstripes_005fhidden_0026_005fname_005fnobody.reuse(_jspx_th_stripes_005fhidden_005f2);
    }
    return false;
  }

  private boolean _jspx_meth_stripes_005fhidden_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_stripes_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  stripes:hidden
    net.sourceforge.stripes.tag.InputHiddenTag _jspx_th_stripes_005fhidden_005f3 = (net.sourceforge.stripes.tag.InputHiddenTag) _005fjspx_005ftagPool_005fstripes_005fhidden_0026_005fname_005fnobody.get(net.sourceforge.stripes.tag.InputHiddenTag.class);
    _jspx_th_stripes_005fhidden_005f3.setPageContext(_jspx_page_context);
    _jspx_th_stripes_005fhidden_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005fform_005f0);
    // /abc/TransferFund.jsp(25,20) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005fhidden_005f3.setName("payee.nickName");
    int[] _jspx_push_body_count_stripes_005fhidden_005f3 = new int[] { 0 };
    try {
      int _jspx_eval_stripes_005fhidden_005f3 = _jspx_th_stripes_005fhidden_005f3.doStartTag();
      if (_jspx_th_stripes_005fhidden_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_stripes_005fhidden_005f3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_stripes_005fhidden_005f3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_stripes_005fhidden_005f3.doFinally();
      _005fjspx_005ftagPool_005fstripes_005fhidden_0026_005fname_005fnobody.reuse(_jspx_th_stripes_005fhidden_005f3);
    }
    return false;
  }

  private boolean _jspx_meth_stripes_005fhidden_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_stripes_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  stripes:hidden
    net.sourceforge.stripes.tag.InputHiddenTag _jspx_th_stripes_005fhidden_005f4 = (net.sourceforge.stripes.tag.InputHiddenTag) _005fjspx_005ftagPool_005fstripes_005fhidden_0026_005fname_005fnobody.get(net.sourceforge.stripes.tag.InputHiddenTag.class);
    _jspx_th_stripes_005fhidden_005f4.setPageContext(_jspx_page_context);
    _jspx_th_stripes_005fhidden_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005fform_005f0);
    // /abc/TransferFund.jsp(31,24) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005fhidden_005f4.setName("payee.bank");
    int[] _jspx_push_body_count_stripes_005fhidden_005f4 = new int[] { 0 };
    try {
      int _jspx_eval_stripes_005fhidden_005f4 = _jspx_th_stripes_005fhidden_005f4.doStartTag();
      if (_jspx_th_stripes_005fhidden_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_stripes_005fhidden_005f4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_stripes_005fhidden_005f4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_stripes_005fhidden_005f4.doFinally();
      _005fjspx_005ftagPool_005fstripes_005fhidden_0026_005fname_005fnobody.reuse(_jspx_th_stripes_005fhidden_005f4);
    }
    return false;
  }

  private boolean _jspx_meth_stripes_005fhidden_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_stripes_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  stripes:hidden
    net.sourceforge.stripes.tag.InputHiddenTag _jspx_th_stripes_005fhidden_005f5 = (net.sourceforge.stripes.tag.InputHiddenTag) _005fjspx_005ftagPool_005fstripes_005fhidden_0026_005fname_005fnobody.get(net.sourceforge.stripes.tag.InputHiddenTag.class);
    _jspx_th_stripes_005fhidden_005f5.setPageContext(_jspx_page_context);
    _jspx_th_stripes_005fhidden_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005fform_005f0);
    // /abc/TransferFund.jsp(38,23) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005fhidden_005f5.setName("payee.branch");
    int[] _jspx_push_body_count_stripes_005fhidden_005f5 = new int[] { 0 };
    try {
      int _jspx_eval_stripes_005fhidden_005f5 = _jspx_th_stripes_005fhidden_005f5.doStartTag();
      if (_jspx_th_stripes_005fhidden_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_stripes_005fhidden_005f5[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_stripes_005fhidden_005f5.doCatch(_jspx_exception);
    } finally {
      _jspx_th_stripes_005fhidden_005f5.doFinally();
      _005fjspx_005ftagPool_005fstripes_005fhidden_0026_005fname_005fnobody.reuse(_jspx_th_stripes_005fhidden_005f5);
    }
    return false;
  }

  private boolean _jspx_meth_stripes_005fhidden_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_stripes_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  stripes:hidden
    net.sourceforge.stripes.tag.InputHiddenTag _jspx_th_stripes_005fhidden_005f6 = (net.sourceforge.stripes.tag.InputHiddenTag) _005fjspx_005ftagPool_005fstripes_005fhidden_0026_005fname_005fnobody.get(net.sourceforge.stripes.tag.InputHiddenTag.class);
    _jspx_th_stripes_005fhidden_005f6.setPageContext(_jspx_page_context);
    _jspx_th_stripes_005fhidden_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005fform_005f0);
    // /abc/TransferFund.jsp(45,21) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005fhidden_005f6.setName("payee.accountNumber");
    int[] _jspx_push_body_count_stripes_005fhidden_005f6 = new int[] { 0 };
    try {
      int _jspx_eval_stripes_005fhidden_005f6 = _jspx_th_stripes_005fhidden_005f6.doStartTag();
      if (_jspx_th_stripes_005fhidden_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_stripes_005fhidden_005f6[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_stripes_005fhidden_005f6.doCatch(_jspx_exception);
    } finally {
      _jspx_th_stripes_005fhidden_005f6.doFinally();
      _005fjspx_005ftagPool_005fstripes_005fhidden_0026_005fname_005fnobody.reuse(_jspx_th_stripes_005fhidden_005f6);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fchoose_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_stripes_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fchoose_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005fform_005f0);
    int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
    if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                    ");
        if (_jspx_meth_c_005fwhen_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context, _jspx_push_body_count_stripes_005fform_005f0))
          return true;
        out.write("                           \n");
        out.write("                    ");
        if (_jspx_meth_c_005fotherwise_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context, _jspx_push_body_count_stripes_005fform_005f0))
          return true;
        out.write("\n");
        out.write("                ");
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

  private boolean _jspx_meth_c_005fwhen_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_stripes_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
    // /abc/TransferFund.jsp(48,20) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${actionBean.confirmTransfer}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
    if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                       \t<tr>\n");
        out.write("                    \t\t<th>Amount:</th>\n");
        out.write("                    \t\t<td>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${actionBean.transaction.transactionAmount}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</td>\n");
        out.write("                    \t\t");
        if (_jspx_meth_stripes_005fhidden_005f7(_jspx_th_c_005fwhen_005f0, _jspx_page_context, _jspx_push_body_count_stripes_005fform_005f0))
          return true;
        out.write("\n");
        out.write("                \t\t</tr>\n");
        out.write("                \t\t<tr>\n");
        out.write("                    \t\t<th>Transaction Remark:</th>\n");
        out.write("                    \t\t<td>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${actionBean.transaction.remarks}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</td>\n");
        out.write("                    \t\t");
        if (_jspx_meth_stripes_005fhidden_005f8(_jspx_th_c_005fwhen_005f0, _jspx_page_context, _jspx_push_body_count_stripes_005fform_005f0))
          return true;
        out.write("\n");
        out.write("                \t\t</tr>                 \t\t                    \n");
        out.write("                    ");
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

  private boolean _jspx_meth_stripes_005fhidden_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_stripes_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  stripes:hidden
    net.sourceforge.stripes.tag.InputHiddenTag _jspx_th_stripes_005fhidden_005f7 = (net.sourceforge.stripes.tag.InputHiddenTag) _005fjspx_005ftagPool_005fstripes_005fhidden_0026_005fname_005fnobody.get(net.sourceforge.stripes.tag.InputHiddenTag.class);
    _jspx_th_stripes_005fhidden_005f7.setPageContext(_jspx_page_context);
    _jspx_th_stripes_005fhidden_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f0);
    // /abc/TransferFund.jsp(52,22) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005fhidden_005f7.setName("transaction.transactionAmount");
    int[] _jspx_push_body_count_stripes_005fhidden_005f7 = new int[] { 0 };
    try {
      int _jspx_eval_stripes_005fhidden_005f7 = _jspx_th_stripes_005fhidden_005f7.doStartTag();
      if (_jspx_th_stripes_005fhidden_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_stripes_005fhidden_005f7[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_stripes_005fhidden_005f7.doCatch(_jspx_exception);
    } finally {
      _jspx_th_stripes_005fhidden_005f7.doFinally();
      _005fjspx_005ftagPool_005fstripes_005fhidden_0026_005fname_005fnobody.reuse(_jspx_th_stripes_005fhidden_005f7);
    }
    return false;
  }

  private boolean _jspx_meth_stripes_005fhidden_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_stripes_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  stripes:hidden
    net.sourceforge.stripes.tag.InputHiddenTag _jspx_th_stripes_005fhidden_005f8 = (net.sourceforge.stripes.tag.InputHiddenTag) _005fjspx_005ftagPool_005fstripes_005fhidden_0026_005fname_005fnobody.get(net.sourceforge.stripes.tag.InputHiddenTag.class);
    _jspx_th_stripes_005fhidden_005f8.setPageContext(_jspx_page_context);
    _jspx_th_stripes_005fhidden_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f0);
    // /abc/TransferFund.jsp(57,22) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005fhidden_005f8.setName("transaction.remarks");
    int[] _jspx_push_body_count_stripes_005fhidden_005f8 = new int[] { 0 };
    try {
      int _jspx_eval_stripes_005fhidden_005f8 = _jspx_th_stripes_005fhidden_005f8.doStartTag();
      if (_jspx_th_stripes_005fhidden_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_stripes_005fhidden_005f8[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_stripes_005fhidden_005f8.doCatch(_jspx_exception);
    } finally {
      _jspx_th_stripes_005fhidden_005f8.doFinally();
      _005fjspx_005ftagPool_005fstripes_005fhidden_0026_005fname_005fnobody.reuse(_jspx_th_stripes_005fhidden_005f8);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fotherwise_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_stripes_005fform_005f0)
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
        out.write("                    \t\n");
        out.write("                        <tr>\n");
        out.write("                    \t\t<th>Amount:</th>\n");
        out.write("                    \t\t<td>");
        if (_jspx_meth_stripes_005ftext_005f0(_jspx_th_c_005fotherwise_005f0, _jspx_page_context, _jspx_push_body_count_stripes_005fform_005f0))
          return true;
        out.write("</td>\n");
        out.write("                \t\t</tr>\n");
        out.write("                \t\t<tr>\n");
        out.write("                    \t\t<th>Transaction Remark:</th>\n");
        out.write("                    \t\t<td>");
        if (_jspx_meth_stripes_005ftext_005f1(_jspx_th_c_005fotherwise_005f0, _jspx_page_context, _jspx_push_body_count_stripes_005fform_005f0))
          return true;
        out.write("</td>\n");
        out.write("                \t\t</tr>                   \n");
        out.write("                    ");
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

  private boolean _jspx_meth_stripes_005ftext_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fotherwise_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_stripes_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  stripes:text
    net.sourceforge.stripes.tag.InputTextTag _jspx_th_stripes_005ftext_005f0 = (net.sourceforge.stripes.tag.InputTextTag) _005fjspx_005ftagPool_005fstripes_005ftext_0026_005fvalue_005fname_005fnobody.get(net.sourceforge.stripes.tag.InputTextTag.class);
    _jspx_th_stripes_005ftext_005f0.setPageContext(_jspx_page_context);
    _jspx_th_stripes_005ftext_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f0);
    // /abc/TransferFund.jsp(63,26) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005ftext_005f0.setName("transaction.transactionAmount");
    // /abc/TransferFund.jsp(63,26) name = value type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005ftext_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${actionBean.transaction.transactionAmount}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
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

  private boolean _jspx_meth_stripes_005ftext_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fotherwise_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_stripes_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  stripes:text
    net.sourceforge.stripes.tag.InputTextTag _jspx_th_stripes_005ftext_005f1 = (net.sourceforge.stripes.tag.InputTextTag) _005fjspx_005ftagPool_005fstripes_005ftext_0026_005fvalue_005fname_005fnobody.get(net.sourceforge.stripes.tag.InputTextTag.class);
    _jspx_th_stripes_005ftext_005f1.setPageContext(_jspx_page_context);
    _jspx_th_stripes_005ftext_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f0);
    // /abc/TransferFund.jsp(67,26) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005ftext_005f1.setName("transaction.remarks");
    // /abc/TransferFund.jsp(67,26) name = value type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005ftext_005f1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${actionBean.transaction.remarks}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int[] _jspx_push_body_count_stripes_005ftext_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_stripes_005ftext_005f1 = _jspx_th_stripes_005ftext_005f1.doStartTag();
      if (_jspx_th_stripes_005ftext_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_stripes_005ftext_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_stripes_005ftext_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_stripes_005ftext_005f1.doFinally();
      _005fjspx_005ftagPool_005fstripes_005ftext_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_stripes_005ftext_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_stripes_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005fform_005f0);
    // /abc/TransferFund.jsp(73,12) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${actionBean.confirmTransfer== true}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("    \n");
        out.write("            <p></p>\n");
        out.write("\t\t\t\tNote:\n");
        out.write("\n");
        out.write("\t\t\t\t\t<p>1.Please ensure that your account is funded sufficiently for us to process your request.</p>\n");
        out.write("\n");
        out.write("\t\t\t\t\t<p>2.You are advised that the Bank shall effect credit based solely on the beneficiary details\n");
        out.write("\n");
        out.write("\t\t\t\t\tso indicated by you. Please note that the Bank shall not be required to ascertain and / or \n");
        out.write("\n");
        out.write("\t\t\t\t\tverify the beneficiary name and / or account number prior to effecting the fund transfer. \n");
        out.write("\n");
        out.write("\t\t\t\t\tRemittance instructions so provided by you shall be based solely on the beneficiary account \n");
        out.write("\n");
        out.write("\t\t\t\t\tnumber information so recorded with the Bank.</p> \n");
        out.write("              ");
        if (_jspx_meth_stripes_005fcheckbox_005f0(_jspx_th_c_005fif_005f0, _jspx_page_context, _jspx_push_body_count_stripes_005fform_005f0))
          return true;
        out.write("I understand and agree to the above. I have also read and accept the<b> Terms & \n");
        out.write("\n");
        out.write("\t\t\t\tConditions </b>for conducting a fund transfer.\n");
        out.write("             ");
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

  private boolean _jspx_meth_stripes_005fcheckbox_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_stripes_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  stripes:checkbox
    net.sourceforge.stripes.tag.InputCheckBoxTag _jspx_th_stripes_005fcheckbox_005f0 = (net.sourceforge.stripes.tag.InputCheckBoxTag) _005fjspx_005ftagPool_005fstripes_005fcheckbox_0026_005fvalue_005fname_005fnobody.get(net.sourceforge.stripes.tag.InputCheckBoxTag.class);
    _jspx_th_stripes_005fcheckbox_005f0.setPageContext(_jspx_page_context);
    _jspx_th_stripes_005fcheckbox_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
    // /abc/TransferFund.jsp(88,14) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005fcheckbox_005f0.setName("deleteIds");
    // /abc/TransferFund.jsp(88,14) name = value type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005fcheckbox_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${person.id}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int[] _jspx_push_body_count_stripes_005fcheckbox_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_stripes_005fcheckbox_005f0 = _jspx_th_stripes_005fcheckbox_005f0.doStartTag();
      if (_jspx_th_stripes_005fcheckbox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_stripes_005fcheckbox_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_stripes_005fcheckbox_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_stripes_005fcheckbox_005f0.doFinally();
      _005fjspx_005ftagPool_005fstripes_005fcheckbox_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_stripes_005fcheckbox_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fchoose_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_stripes_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f1 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_005fchoose_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fchoose_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005fform_005f0);
    int _jspx_eval_c_005fchoose_005f1 = _jspx_th_c_005fchoose_005f1.doStartTag();
    if (_jspx_eval_c_005fchoose_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("            ");
        if (_jspx_meth_c_005fwhen_005f1(_jspx_th_c_005fchoose_005f1, _jspx_page_context, _jspx_push_body_count_stripes_005fform_005f0))
          return true;
        out.write("\n");
        out.write("             ");
        if (_jspx_meth_c_005fotherwise_005f1(_jspx_th_c_005fchoose_005f1, _jspx_page_context, _jspx_push_body_count_stripes_005fform_005f0))
          return true;
        out.write("\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_c_005fchoose_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fchoose_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_stripes_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_005fwhen_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fwhen_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f1);
    // /abc/TransferFund.jsp(94,12) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${actionBean.confirmTransfer}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f1 = _jspx_th_c_005fwhen_005f1.doStartTag();
    if (_jspx_eval_c_005fwhen_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("            \t\n");
        out.write("                ");
        if (_jspx_meth_stripes_005fsubmit_005f0(_jspx_th_c_005fwhen_005f1, _jspx_page_context, _jspx_push_body_count_stripes_005fform_005f0))
          return true;
        out.write("\n");
        out.write("                ");
        if (_jspx_meth_stripes_005fsubmit_005f1(_jspx_th_c_005fwhen_005f1, _jspx_page_context, _jspx_push_body_count_stripes_005fform_005f0))
          return true;
        out.write("\n");
        out.write("                ");
        if (_jspx_meth_stripes_005fsubmit_005f2(_jspx_th_c_005fwhen_005f1, _jspx_page_context, _jspx_push_body_count_stripes_005fform_005f0))
          return true;
        out.write("                               \n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_c_005fwhen_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fwhen_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f1);
    return false;
  }

  private boolean _jspx_meth_stripes_005fsubmit_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_stripes_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  stripes:submit
    net.sourceforge.stripes.tag.InputSubmitTag _jspx_th_stripes_005fsubmit_005f0 = (net.sourceforge.stripes.tag.InputSubmitTag) _005fjspx_005ftagPool_005fstripes_005fsubmit_0026_005fvalue_005fname_005fnobody.get(net.sourceforge.stripes.tag.InputSubmitTag.class);
    _jspx_th_stripes_005fsubmit_005f0.setPageContext(_jspx_page_context);
    _jspx_th_stripes_005fsubmit_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f1);
    // /abc/TransferFund.jsp(95,16) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005fsubmit_005f0.setName("cancel");
    // /abc/TransferFund.jsp(95,16) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005fsubmit_005f0.setValue("Cancel");
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

  private boolean _jspx_meth_stripes_005fsubmit_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_stripes_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  stripes:submit
    net.sourceforge.stripes.tag.InputSubmitTag _jspx_th_stripes_005fsubmit_005f1 = (net.sourceforge.stripes.tag.InputSubmitTag) _005fjspx_005ftagPool_005fstripes_005fsubmit_0026_005fvalue_005fname_005fnobody.get(net.sourceforge.stripes.tag.InputSubmitTag.class);
    _jspx_th_stripes_005fsubmit_005f1.setPageContext(_jspx_page_context);
    _jspx_th_stripes_005fsubmit_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f1);
    // /abc/TransferFund.jsp(96,16) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005fsubmit_005f1.setName("transfer");
    // /abc/TransferFund.jsp(96,16) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005fsubmit_005f1.setValue("Edit");
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

  private boolean _jspx_meth_stripes_005fsubmit_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_stripes_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  stripes:submit
    net.sourceforge.stripes.tag.InputSubmitTag _jspx_th_stripes_005fsubmit_005f2 = (net.sourceforge.stripes.tag.InputSubmitTag) _005fjspx_005ftagPool_005fstripes_005fsubmit_0026_005fvalue_005fname_005fnobody.get(net.sourceforge.stripes.tag.InputSubmitTag.class);
    _jspx_th_stripes_005fsubmit_005f2.setPageContext(_jspx_page_context);
    _jspx_th_stripes_005fsubmit_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f1);
    // /abc/TransferFund.jsp(97,16) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005fsubmit_005f2.setName("confirmTransfer");
    // /abc/TransferFund.jsp(97,16) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005fsubmit_005f2.setValue("Confirm");
    int[] _jspx_push_body_count_stripes_005fsubmit_005f2 = new int[] { 0 };
    try {
      int _jspx_eval_stripes_005fsubmit_005f2 = _jspx_th_stripes_005fsubmit_005f2.doStartTag();
      if (_jspx_th_stripes_005fsubmit_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_stripes_005fsubmit_005f2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_stripes_005fsubmit_005f2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_stripes_005fsubmit_005f2.doFinally();
      _005fjspx_005ftagPool_005fstripes_005fsubmit_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_stripes_005fsubmit_005f2);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fotherwise_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_stripes_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f1 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_005fotherwise_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fotherwise_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f1);
    int _jspx_eval_c_005fotherwise_005f1 = _jspx_th_c_005fotherwise_005f1.doStartTag();
    if (_jspx_eval_c_005fotherwise_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("             \t");
        if (_jspx_meth_stripes_005fsubmit_005f3(_jspx_th_c_005fotherwise_005f1, _jspx_page_context, _jspx_push_body_count_stripes_005fform_005f0))
          return true;
        out.write("\n");
        out.write("                ");
        if (_jspx_meth_stripes_005fsubmit_005f4(_jspx_th_c_005fotherwise_005f1, _jspx_page_context, _jspx_push_body_count_stripes_005fform_005f0))
          return true;
        out.write(" \n");
        out.write("             ");
        int evalDoAfterBody = _jspx_th_c_005fotherwise_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fotherwise_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f1);
    return false;
  }

  private boolean _jspx_meth_stripes_005fsubmit_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fotherwise_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_stripes_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  stripes:submit
    net.sourceforge.stripes.tag.InputSubmitTag _jspx_th_stripes_005fsubmit_005f3 = (net.sourceforge.stripes.tag.InputSubmitTag) _005fjspx_005ftagPool_005fstripes_005fsubmit_0026_005fvalue_005fname_005fnobody.get(net.sourceforge.stripes.tag.InputSubmitTag.class);
    _jspx_th_stripes_005fsubmit_005f3.setPageContext(_jspx_page_context);
    _jspx_th_stripes_005fsubmit_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f1);
    // /abc/TransferFund.jsp(100,14) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005fsubmit_005f3.setName("preTransfer");
    // /abc/TransferFund.jsp(100,14) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005fsubmit_005f3.setValue("Transfer Fund");
    int[] _jspx_push_body_count_stripes_005fsubmit_005f3 = new int[] { 0 };
    try {
      int _jspx_eval_stripes_005fsubmit_005f3 = _jspx_th_stripes_005fsubmit_005f3.doStartTag();
      if (_jspx_th_stripes_005fsubmit_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_stripes_005fsubmit_005f3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_stripes_005fsubmit_005f3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_stripes_005fsubmit_005f3.doFinally();
      _005fjspx_005ftagPool_005fstripes_005fsubmit_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_stripes_005fsubmit_005f3);
    }
    return false;
  }

  private boolean _jspx_meth_stripes_005fsubmit_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fotherwise_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_stripes_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  stripes:submit
    net.sourceforge.stripes.tag.InputSubmitTag _jspx_th_stripes_005fsubmit_005f4 = (net.sourceforge.stripes.tag.InputSubmitTag) _005fjspx_005ftagPool_005fstripes_005fsubmit_0026_005fvalue_005fname_005fnobody.get(net.sourceforge.stripes.tag.InputSubmitTag.class);
    _jspx_th_stripes_005fsubmit_005f4.setPageContext(_jspx_page_context);
    _jspx_th_stripes_005fsubmit_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f1);
    // /abc/TransferFund.jsp(101,16) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005fsubmit_005f4.setName("cancel");
    // /abc/TransferFund.jsp(101,16) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005fsubmit_005f4.setValue("Cancel");
    int[] _jspx_push_body_count_stripes_005fsubmit_005f4 = new int[] { 0 };
    try {
      int _jspx_eval_stripes_005fsubmit_005f4 = _jspx_th_stripes_005fsubmit_005f4.doStartTag();
      if (_jspx_th_stripes_005fsubmit_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_stripes_005fsubmit_005f4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_stripes_005fsubmit_005f4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_stripes_005fsubmit_005f4.doFinally();
      _005fjspx_005ftagPool_005fstripes_005fsubmit_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_stripes_005fsubmit_005f4);
    }
    return false;
  }
}
