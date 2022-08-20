package com.QH.crm.settings.service;

import com.QH.crm.settings.model.DicValue;

import java.util.List;

/**
 * @author QH
 * @version V1.0.1
 * @Package com.QH.crm.settings.service
 * @date 2022/8/13 16:39
 */
public interface DicValueService {
    List<DicValue> queryDicValueByTypeCode(String typeCode);
    DicValue queryDicValueById(String id);
}
