package demo.render;

import com.itown.framework.impl.jsp.JSPServiceRender;

public class HelloRender extends JSPServiceRender{

	
	
	public HelloRender() {
	}

	@Override
	public String getURL(Object result) {
		return "/hello.jsp";
	}

}
