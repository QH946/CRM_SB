package com.QH.crm.workbench.service;

import com.QH.crm.workbench.model.ContactsRemark;

import java.util.List;

/**
 * @author QH
 * @version V1.0.1
 * @Package com.QH.crm.workbench.service
 * @date 2022/8/15 12:12
 */
public interface ContactsRemarkService {
    List<ContactsRemark> queryContactsRemarkForDetailByContactsId(String contactsId);

    int saveCreateContactsRemark(ContactsRemark contactsRemark);

    int deleteContactsRemarkById(String id);

    int saveEditContactsRemark(ContactsRemark contactsRemark);
}
