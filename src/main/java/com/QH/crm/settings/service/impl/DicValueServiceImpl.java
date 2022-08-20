package com.QH.crm.settings.service.impl;

import com.QH.crm.settings.mapper.DicValueMapper;
import com.QH.crm.settings.model.DicValue;
import com.QH.crm.settings.service.DicValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author QH
 * @version V1.0.1
 * @Package com.QH.crm.settings.service.impl
 * @date 2022/8/13 16:39
 */
@Service("dicValueService")
public class DicValueServiceImpl implements DicValueService {
    @Autowired
    private DicValueMapper dicValueMapper;

    @Override
    public List<DicValue> queryDicValueByTypeCode(String typeCode) {
        return dicValueMapper.selectDicValueByTypeCode(typeCode);
    }

    @Override
    public DicValue queryDicValueById(String id) {
        return dicValueMapper.selectDicValueById(id);
    }
}
