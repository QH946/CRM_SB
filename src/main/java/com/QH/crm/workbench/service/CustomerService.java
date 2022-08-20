package com.QH.crm.workbench.service;

import com.QH.crm.workbench.model.Customer;

import java.util.List;
import java.util.Map;

/**
 * @author QH
 * @version V1.0.1
 * @Package com.QH.crm.workbench.service
 * @date 2022/8/15 11:37
 */

public interface CustomerService {
    List<Customer> queryCustomerByConditionForPage(Map<String, Object> map);

    int queryCountOfCustomerByCondition(Map<String, Object> map);

    int saveCreateCustomer(Customer customer);

    Customer queryCustomerById(String id);

    int saveEditCustomer(Customer customer);

    void deleteCustomer(String[] ids);

    Customer queryCustomerForDetailById(String id);

    List<String> queryCustomerNameByFuzzyName(String customerName);

    String queryCustomerIdByName(String customerName);
}
