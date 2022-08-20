package com.QH.crm.workbench.mapper;

import com.QH.crm.workbench.model.ClueRemark;

import java.util.List;

public interface ClueRemarkMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_clue_remark
     *
     * @mbggenerated Sat Aug 13 18:22:28 CST 2022
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_clue_remark
     *
     * @mbggenerated Sat Aug 13 18:22:28 CST 2022
     */
    int insert(ClueRemark record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_clue_remark
     *
     * @mbggenerated Sat Aug 13 18:22:28 CST 2022
     */
    int insertSelective(ClueRemark record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_clue_remark
     *
     * @mbggenerated Sat Aug 13 18:22:28 CST 2022
     */
    ClueRemark selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_clue_remark
     *
     * @mbggenerated Sat Aug 13 18:22:28 CST 2022
     */
    int updateByPrimaryKeySelective(ClueRemark record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_clue_remark
     *
     * @mbggenerated Sat Aug 13 18:22:28 CST 2022
     */
    int updateByPrimaryKey(ClueRemark record);

    /**
     * 根据clueId查询该线索下所有的备注
     *
     * @param clueId
     * @return
     */
    List<ClueRemark> selectClueRemarkForDetailByClueId(String clueId);

    /**
     * 添加线索备注
     * @param clueRemark 线索备注
     * @return 添加的条数
     */
    int insertClueRemark(ClueRemark clueRemark);

    /**
     * 通过线索id删除备注（用于删除线索时同时删除该线索备注；因为可能一次性会删除多个线索，所以传入的id是线索id数组）
     * @param clueIds 线索id
     * @return 删除的条数
     */
    int deleteClueRemarkByClueId(String[] clueIds);

    /**
     * 通过线索备注的id删除线索备注
     * @param id 线索备注的id
     * @return 删除的条数
     */
    int deleteClueRemarkById(String id);

    /**
     * 更新线索备注
     * @param clueRemark 更新的线索备注
     * @return 更新的条数
     */
    int updateClueRemark(ClueRemark clueRemark);

    /**
     * 通过线索id查询市场活动备注
     * @param clueId 线索id
     * @return 该线索的所有备注集合
     */
    List<ClueRemark> selectClueRemarkByClueId(String clueId);
}
