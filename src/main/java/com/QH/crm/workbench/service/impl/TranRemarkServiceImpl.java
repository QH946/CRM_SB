package com.QH.crm.workbench.service.impl;

import com.QH.crm.workbench.mapper.TranRemarkMapper;
import com.QH.crm.workbench.model.TranRemark;
import com.QH.crm.workbench.service.TranRemarkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
/**
 * @author QH
 * @version V1.0.1
 * @Package com.QH.crm.workbench.service.impl
 * @date 2022/8/15 12:32
 */

@Service("tranRemarkService")
public class TranRemarkServiceImpl implements TranRemarkService {
    @Autowired
    TranRemarkMapper tranRemarkMapper;

    @Override
    public List<TranRemark> queryTranRemarkForDetailByTranId(String id) {
        return tranRemarkMapper.selectTranRemarkForDetailByTranId(id);
    }

    @Override
    public int saveCreateTranRemark(TranRemark tranRemark) {
        return tranRemarkMapper.insertTranRemark(tranRemark);
    }

    @Override
    public int deleteTranRemarkById(String id) {
        return tranRemarkMapper.deleteTranRemarkById(id);
    }

    @Override
    public int saveEditTranRemark(TranRemark tranRemark) {
        return tranRemarkMapper.updateTranRemark(tranRemark);
    }
}
