package demo.service;

import com.itown.framework.IServiceParameters;
import com.itown.framework.IServiceResult;
import com.itown.framework.impl.DefaultServiceResult;
import com.itown.framework.services.AbstractService;

public class HelloService extends AbstractService {

	@Override
	public Object service(IServiceParameters params) {
		// 返回输出结果
		IServiceResult result = new DefaultServiceResult();
		// 需要返给页面的值
		result.setAttribute("result", params.getString("name"));
		return result;
	}

}
