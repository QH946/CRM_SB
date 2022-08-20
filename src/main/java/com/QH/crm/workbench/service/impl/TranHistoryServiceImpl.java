package com.QH.crm.workbench.service.impl;

import com.QH.crm.workbench.mapper.TranHistoryMapper;
import com.QH.crm.workbench.model.TranHistory;
import com.QH.crm.workbench.service.TranHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author QH
 * @version V1.0.1
 * @Package com.QH.crm.workbench.service.impl
 * @date 2022/8/15 12:35
 */
@Service("tranHistoryService")
public class TranHistoryServiceImpl implements TranHistoryService {
    @Autowired
    TranHistoryMapper tranHistoryMapper;

    @Override
    public List<TranHistory> queryTranHistoryForDetailByTranId(String id) {
        return tranHistoryMapper.selectTranHistoryForDetailByTranId(id);
    }
}
