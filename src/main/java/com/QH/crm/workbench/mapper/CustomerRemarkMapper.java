package com.QH.crm.workbench.mapper;

import com.QH.crm.workbench.model.ContactsRemark;
import com.QH.crm.workbench.model.CustomerRemark;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface CustomerRemarkMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_customer_remark
     *
     * @mbggenerated Mon Aug 15 11:52:29 CST 2022
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_customer_remark
     *
     * @mbggenerated Mon Aug 15 11:52:29 CST 2022
     */
    int insert(CustomerRemark record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_customer_remark
     *
     * @mbggenerated Mon Aug 15 11:52:29 CST 2022
     */
    int insertSelective(CustomerRemark record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_customer_remark
     *
     * @mbggenerated Mon Aug 15 11:52:29 CST 2022
     */
    CustomerRemark selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_customer_remark
     *
     * @mbggenerated Mon Aug 15 11:52:29 CST 2022
     */
    int updateByPrimaryKeySelective(CustomerRemark record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_customer_remark
     *
     * @mbggenerated Mon Aug 15 11:52:29 CST 2022
     */
    int updateByPrimaryKey(CustomerRemark record);
    /**
     * 通过客户备注集合插入客户备注
     * @param customerRemarkList 客户备注集合
     * @return 插入条数
     */
    int insertCustomerRemarkByList(List<CustomerRemark> customerRemarkList);

    /**
     * 通过客户id查询该客户备注详细信息
     * @param customerId
     * @return
     */
    List<CustomerRemark> selectCustomerRemarkForDetailByCustomerId(String customerId);

    /**
     * 通过客户id数组删除备注（用于删除客户时同时删除该客户备注；因为可能一次性会删除多个客户，所以传入的id是客户id数组）
     * @param customerIds 客户id数组
     * @return 删除的条数
     */
    int deleteCustomerRemarkByCustomerIds(String[] customerIds);

    /**
     * 新增客户备注
     * @param customerRemark 客户备注
     * @return 新增条数
     */
    int insertCustomerRemark(CustomerRemark customerRemark);

    /**
     * 通过客户备注id删除备注
     * @param id 客户id
     * @return 删除的条数
     */
    int deleteCustomerRemarkById(String id);

    /**
     * 更新客户备注
     * @param customerRemark 客户备注信息
     * @return 更新条数
     */
    int updateCustomerRemark(CustomerRemark customerRemark);
}
