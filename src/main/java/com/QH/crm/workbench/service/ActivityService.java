package com.QH.crm.workbench.service;

import com.QH.crm.workbench.model.Activity;
import com.QH.crm.workbench.model.ActivityRemark;
import com.QH.crm.workbench.model.FunnelVO;

import java.util.List;
import java.util.Map;

/**
 * @author QH
 * @version V1.0.1
 * @Package com.QH.crm.workbench.service
 * @date 2022/8/9 10:27
 */

public interface ActivityService {
    int saveCreateActivity(Activity activity);

    List<Activity> queryActivityByConditionForPage(Map<String, Object> map);

    int queryCountOfActivityByCondition(Map<String, Object> map);

    void deleteActivity(String[] ids);

    Activity queryActivityById(String id);

    int saveEditActivity(Activity activity);

    List<Activity> queryAllActivity();

    List<Activity> queryCheckedActivity(String[] id);

    int saveActivityByList(List<Activity> activityList);

    Activity queryActivityForDetailById(String id);

    List<Activity> queryActivityForDetailByClueId(String clueId);

    List<Activity> queryActivityForDetailByNameAndClueId(Map<String, Object> map);

    List<Activity> queryActivityForDetailByIds(String[] ids);

    List<Activity> queryActivityForConvertByNameAndClueId(Map<String, Object> map);

    List<Activity> queryActivityForDetailByContactsId(String contactsId);

    List<Activity> queryActivityForDetailByNameAndContactsId(Map<String, Object> map);

    List<Activity> queryActivityByFuzzyName(String activityName);

    List<FunnelVO> queryCountOfActivityGroupByOwner();
}
