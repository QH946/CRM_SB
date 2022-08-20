package com.QH.crm.workbench.service;

import com.QH.crm.workbench.model.CustomerRemark;

import java.util.List;

/**
 * @author QH
 * @version V1.0.1
 * @Package com.QH.crm.workbench.service
 * @date 2022/8/15 12:22
 */
public interface CustomerRemarkService {
    List<CustomerRemark> queryCustomerRemarkForDetailByCustomerId(String customerId);

    int saveCreateCustomerRemark(CustomerRemark customerRemark);

    int deleteCustomerRemarkById(String id);

    int saveEditCustomerRemark(CustomerRemark customerRemark);
}
