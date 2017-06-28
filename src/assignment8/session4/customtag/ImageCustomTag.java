package assignment8.session4.customtag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;


public class ImageCustomTag extends SimpleTagSupport {

	private String url = "";
	private boolean showBorder = false;

	public void setUrl(String url) {
		this.url = url;
	}

	public void setShowBorder(boolean showBorder) {
		this.showBorder = showBorder;
	}

	public void doTag() throws JspException {

		PageContext pageContext = (PageContext) getJspContext();
		JspWriter out = pageContext.getOut();

		try {
			StringBuffer sb = new StringBuffer();
			sb.append("<img ");
			if (showBorder) {
				sb.append("border=\"1\" ");
			}
			sb.append("alt=\"\" src=\"");
			sb.append(url);
			sb.append("\"/>");

			out.println(sb.toString());

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
