package com.dianping.paas.api.controller;

import com.dianping.paas.core.service.GroupService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by yuchao on 12/7/15.
 */
@RestController
public class GroupController {

    @Resource
    private GroupService groupService;

    @RequestMapping("/apps/{app_id}/groups")
    private void upgradeInstances(@PathVariable("app_id") String app_id, String app_version) {
        groupService.upgradeInstances(app_id, app_version);
    }
}