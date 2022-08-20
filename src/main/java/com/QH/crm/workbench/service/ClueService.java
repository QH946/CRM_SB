package com.QH.crm.workbench.service;

import com.QH.crm.workbench.model.Activity;
import com.QH.crm.workbench.model.Clue;

import java.util.List;
import java.util.Map;

/**
 * @author QH
 * @version V1.0.1
 * @Package com.QH.crm.workbench.service
 * @date 2022/8/13 17:23
 */
public interface ClueService {
    int saveCreateClue(Clue clue);

    List<Clue> queryClueByConditionForPage(Map<String, Object> map);

    int queryCountOfClueByCondition(Map<String, Object> map);

    void deleteClue(String[] clueIds);

    Clue queryClueById(String id);

    int saveEditClue(Clue clue);

    Clue queryClueForDetailById(String id);

    void saveConvertClue(Map<String, Object> map);

    List<String> queryClueStageOfClueGroupByClueStage();

    List<Integer> queryCountOfClueGroupByClueStage();
}
