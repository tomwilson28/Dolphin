package com.dianping.paas.agent.service;

import com.dianping.paas.core.dto.request.AppInitRequest;
import com.dianping.paas.core.service.AppService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by yuchao on 12/1/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:config/spring/appcontext-*.xml")
public class AppServiceTest {
    @Resource
    private AppService appService;

    private AppInitRequest appInitRequest;

    @Before
    public void setUp() throws Exception {
        appInitRequest = new AppInitRequest();
        appInitRequest.setAppId("tomcat-app");
        appInitRequest.setImageType("tomcat-8.0");
        appInitRequest.setInstanceCount(1);
    }

    @Test
    public void testInit() throws Exception {
        appService.init(appInitRequest);
        Thread.sleep(30000);
    }
}