package com.QH.crm.workbench.service;

import com.QH.crm.workbench.model.ClueActivityRelation;

import java.util.List;

/**
 * @author QH
 * @version V1.0.1
 * @Package com.QH.crm.workbench.service
 * @date 2022/8/14 16:41
 */

public interface ClueActivityRelationService {
    int saveCreateClueActivityRelationByList(List<ClueActivityRelation> clueActivityRelationList);

    int deleteClueActivityRelationByClueIdAndActivityId(ClueActivityRelation clueActivityRelation);
}
