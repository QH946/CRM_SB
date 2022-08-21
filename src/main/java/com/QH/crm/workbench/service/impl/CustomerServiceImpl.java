package com.QH.crm.workbench.service.impl;

import com.QH.crm.workbench.mapper.CustomerMapper;
import com.QH.crm.workbench.mapper.CustomerRemarkMapper;
import com.QH.crm.workbench.model.Customer;
import com.QH.crm.workbench.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * @author QH
 * @version V1.0.1
 * @Package com.QH.crm.workbench.service.impl
 * @date 2022/8/15 11:38
 */

@Service("customerServiceImpl")
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerMapper customerMapper;

    @Autowired
    CustomerRemarkMapper customerRemarkMapper;

    @Override
    public List<Customer> queryCustomerByConditionForPage(Map<String, Object> map) {
        return customerMapper.selectCustomerByConditionForPage(map);
    }

    @Override
    public int queryCountOfCustomerByCondition(Map<String, Object> map) {
        return customerMapper.selectCountOfCustomerByCondition(map);
    }

    @Override
    public int saveCreateCustomer(Customer customer) {
        return customerMapper.insertCustomer(customer);
    }

    @Override
    public Customer queryCustomerById(String id) {
        return customerMapper.selectCustomerById(id);
    }

    @Override
    public int saveEditCustomer(Customer customer) {
        return customerMapper.updateCustomer(customer);
    }

    @Override
    public void deleteCustomer(String[] ids) {
        // 删除客户备注
        customerRemarkMapper.deleteCustomerRemarkByCustomerIds(ids);
        // 删除客户关联交易
        // 删除客户关联联系人
        // 删除客户信息
        customerMapper.deleteCustomerByIds(ids);
    }

    @Override
    public Customer queryCustomerForDetailById(String id) {
        return customerMapper.selectCustomerForDetailById(id);
    }

    @Override
    public List<String> queryCustomerNameByFuzzyName(String customerName) {
        return customerMapper.selectCustomerNameByFuzzyName(customerName);
    }

    @Override
    public String queryCustomerIdByName(String customerName) {
        return customerMapper.selectCustomerIdByName(customerName);
    }
}
