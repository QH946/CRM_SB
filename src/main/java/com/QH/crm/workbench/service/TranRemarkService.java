package com.QH.crm.workbench.service;

import com.QH.crm.workbench.model.TranRemark;

import java.util.List;

/**
 * @author QH
 * @version V1.0.1
 * @Package com.QH.crm.workbench.service
 * @date 2022/8/15 12:32
 */
public interface TranRemarkService {
    List<TranRemark> queryTranRemarkForDetailByTranId(String id);

    int saveCreateTranRemark(TranRemark tranRemark);

    int deleteTranRemarkById(String id);

    int saveEditTranRemark(TranRemark tranRemark);
}
