package com.QH.crm.workbench.service.impl;

import com.QH.crm.workbench.mapper.ContactsRemarkMapper;
import com.QH.crm.workbench.model.ContactsRemark;
import com.QH.crm.workbench.service.ContactsRemarkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service("contactsRemarkService")
@Transactional
public class ContactsRemarkServiceImpl implements ContactsRemarkService {
    @Autowired
    private ContactsRemarkMapper contactsRemarkMapper;

    @Override
    public List<ContactsRemark> queryContactsRemarkForDetailByContactsId(String contactsId) {
        return contactsRemarkMapper.selectContactsRemarkForDetailByContactsId(contactsId);
    }

    @Override
    public int saveCreateContactsRemark(ContactsRemark contactsRemark) {
        return contactsRemarkMapper.insertContactsRemark(contactsRemark);
    }

    @Override
    public int deleteContactsRemarkById(String id) {
        return contactsRemarkMapper.deleteContactsRemarkById(id);
    }

    @Override
    public int saveEditContactsRemark(ContactsRemark contactsRemark) {
        return contactsRemarkMapper.updateContactsRemark(contactsRemark);
    }
}
