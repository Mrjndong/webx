package com.mycompany.auth;

import static com.alibaba.citrus.turbine.util.TurbineUtil.getTurbineRunData;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.citrus.service.pipeline.PipelineContext;
import com.alibaba.citrus.service.pipeline.support.AbstractValve;
import com.alibaba.citrus.turbine.TurbineRunData;
import com.alibaba.fastjson.JSON;

/***
 * 类PageAuthorizationValve.java的实现描述：TODO 类实现描述
 * 
 * @author Jndong 2013年10月22日 下午4:08:35
 */
public class PageAuthorizationValve extends AbstractValve {

    @Resource
    private HttpServletRequest  request;

    @Resource
    private HttpServletResponse response;

    @Override
    public void invoke(PipelineContext pipelineContext) throws Exception {
        TurbineRunData runData = getTurbineRunData(request);
        String url = runData.getRequest().getRequestURI();
        JSON.toJSONString(url);
        //runData.setRedirectLocation("/baidu.com");
        pipelineContext.invokeNext();
    }
}
