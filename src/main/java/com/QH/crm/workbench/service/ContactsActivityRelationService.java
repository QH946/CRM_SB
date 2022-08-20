package com.QH.crm.workbench.service;

import com.QH.crm.workbench.model.ContactsActivityRelation;

import java.util.List;

/**
 * @author QH
 * @version V1.0.1
 * @Package com.QH.crm.workbench.service
 * @date 2022/8/15 12:19
 */
public interface ContactsActivityRelationService {
    int saveCreateContactsActivityRelationByList(List<ContactsActivityRelation> contactsActivityRelationList);

    int deleteContactsActivityRelationByContactsIdAndActivityId(ContactsActivityRelation contactsActivityRelation);
}
