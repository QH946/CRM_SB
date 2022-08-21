package com.QH.crm.workbench.service.impl;

import com.QH.crm.workbench.mapper.ContactsActivityRelationMapper;
import com.QH.crm.workbench.model.ContactsActivityRelation;
import com.QH.crm.workbench.service.ContactsActivityRelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author QH
 * @version V1.0.1
 * @Package com.QH.crm.workbench.service.impl
 * @date 2022/8/15 12:19
 */
@Service("contactsActivityRelationService")
public class ContactsActivityRelationServiceImpl implements ContactsActivityRelationService {

    @Autowired
    ContactsActivityRelationMapper activityRelationMapper;

    @Override
    public int saveCreateContactsActivityRelationByList(List<ContactsActivityRelation> contactsActivityRelationList) {
        return activityRelationMapper.insertContactsActivityRelationByList(contactsActivityRelationList);
    }

    @Override
    public int deleteContactsActivityRelationByContactsIdAndActivityId(ContactsActivityRelation contactsActivityRelation) {
        return activityRelationMapper.deleteContactsActivityRelationByContactsIdAndActivityId(contactsActivityRelation);
    }
}
