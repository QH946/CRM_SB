package com.QH.crm.workbench.service;

import com.QH.crm.workbench.model.Contacts;
import com.QH.crm.workbench.model.FunnelVO;

import java.util.List;
import java.util.Map;

/**
 * @author QH
 * @version V1.0.1
 * @Package com.QH.crm.workbench.service
 * @date 2022/8/15 12:08
 */
public interface ContactsService {

    List<Contacts> queryContactsByConditionForPage(Map<String, Object> map);

    int queryCountOfContactsByCondition(Map<String, Object> map);

    void saveCreateContacts(Contacts contacts);

    Contacts queryContactsById(String id);

    void saveEditContacts(Contacts contacts);

    void deleteContacts(String[] contactsIds);

    Contacts queryContactsForDetailById(String id);

    List<Contacts> queryContactsByFuzzyName(String contactsName);

    List<FunnelVO> queryCountOfCustomerAndContactsGroupByCustomer();
}
