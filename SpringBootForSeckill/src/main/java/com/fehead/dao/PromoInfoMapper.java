package com.fehead.dao;

import com.fehead.dataobject.PromoInfo;

public interface PromoInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table promo
     *
     * @mbg.generated Mon May 13 10:54:22 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table promo
     *
     * @mbg.generated Mon May 13 10:54:22 CST 2019
     */
    int insert(PromoInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table promo
     *
     * @mbg.generated Mon May 13 10:54:22 CST 2019
     */
    int insertSelective(PromoInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table promo
     *
     * @mbg.generated Mon May 13 10:54:22 CST 2019
     */
    PromoInfo selectByPrimaryKey(Integer id);

    //通过itemId查询Promo记录
    PromoInfo selectByItemId(Integer itemId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table promo
     *
     * @mbg.generated Mon May 13 10:54:22 CST 2019
     */
    int updateByPrimaryKeySelective(PromoInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table promo
     *
     * @mbg.generated Mon May 13 10:54:22 CST 2019
     */
    int updateByPrimaryKey(PromoInfo record);
}