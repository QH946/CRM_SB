package com.QH.crm.workbench.mapper;

import com.QH.crm.workbench.model.ContactsActivityRelation;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface ContactsActivityRelationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_contacts_activity_relation
     *
     * @mbggenerated Mon Aug 15 11:52:29 CST 2022
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_contacts_activity_relation
     *
     * @mbggenerated Mon Aug 15 11:52:29 CST 2022
     */
    int insert(ContactsActivityRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_contacts_activity_relation
     *
     * @mbggenerated Mon Aug 15 11:52:29 CST 2022
     */
    int insertSelective(ContactsActivityRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_contacts_activity_relation
     *
     * @mbggenerated Mon Aug 15 11:52:29 CST 2022
     */
    ContactsActivityRelation selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_contacts_activity_relation
     *
     * @mbggenerated Mon Aug 15 11:52:29 CST 2022
     */
    int updateByPrimaryKeySelective(ContactsActivityRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_contacts_activity_relation
     *
     * @mbggenerated Mon Aug 15 11:52:29 CST 2022
     */
    int updateByPrimaryKey(ContactsActivityRelation record);
    /**
     * 通过集合插入联系人和市场活动关系的数据
     * @param contactsActivityRelationList 联系人和市场活动关系数据集合
     * @return 插入的条数
     */
    int insertContactsActivityRelationByList(List<ContactsActivityRelation> contactsActivityRelationList);

    int deleteContactsActivityRelationByContactsIdAndActivityId(ContactsActivityRelation contactsActivityRelation);

    int deleteContactsActivityRelationByContactsIds(String[] contactsIds);
}
