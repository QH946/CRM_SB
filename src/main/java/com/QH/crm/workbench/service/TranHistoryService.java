package com.QH.crm.workbench.service;

import com.QH.crm.workbench.model.TranHistory;

import java.util.List;

/**
 * @author QH
 * @version V1.0.1
 * @Package com.QH.crm.workbench.service
 * @date 2022/8/15 12:34
 */
public interface TranHistoryService {
    List<TranHistory> queryTranHistoryForDetailByTranId(String id);
}
