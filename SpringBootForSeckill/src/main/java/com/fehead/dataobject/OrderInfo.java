package com.fehead.dataobject;

public class OrderInfo {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_info.id
     *
     * @mbg.generated Sat May 11 18:35:45 CST 2019
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_info.user_id
     *
     * @mbg.generated Sat May 11 18:35:45 CST 2019
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_info.item_id
     *
     * @mbg.generated Sat May 11 18:35:45 CST 2019
     */
    private Integer itemId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_info.itemPrice
     *
     * @mbg.generated Sat May 11 18:35:45 CST 2019
     */
    private Double itemprice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_info.amount
     *
     * @mbg.generated Sat May 11 18:35:45 CST 2019
     */
    private Integer amount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_info.orderPrice
     *
     * @mbg.generated Sat May 11 18:35:45 CST 2019
     */
    private Double orderprice;

    //创建promoId，若非空则需要使用秒杀价格
    private Integer promoId;

    public Integer getPromoId() {
        return promoId;
    }

    public void setPromoId(Integer promoId) {
        this.promoId = promoId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_info.id
     *
     * @return the value of order_info.id
     *
     * @mbg.generated Sat May 11 18:35:45 CST 2019
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_info.id
     *
     * @param id the value for order_info.id
     *
     * @mbg.generated Sat May 11 18:35:45 CST 2019
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_info.user_id
     *
     * @return the value of order_info.user_id
     *
     * @mbg.generated Sat May 11 18:35:45 CST 2019
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_info.user_id
     *
     * @param userId the value for order_info.user_id
     *
     * @mbg.generated Sat May 11 18:35:45 CST 2019
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_info.item_id
     *
     * @return the value of order_info.item_id
     *
     * @mbg.generated Sat May 11 18:35:45 CST 2019
     */
    public Integer getItemId() {
        return itemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_info.item_id
     *
     * @param itemId the value for order_info.item_id
     *
     * @mbg.generated Sat May 11 18:35:45 CST 2019
     */
    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_info.itemPrice
     *
     * @return the value of order_info.itemPrice
     *
     * @mbg.generated Sat May 11 18:35:45 CST 2019
     */
    public Double getItemprice() {
        return itemprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_info.itemPrice
     *
     * @param itemprice the value for order_info.itemPrice
     *
     * @mbg.generated Sat May 11 18:35:45 CST 2019
     */
    public void setItemprice(Double itemprice) {
        this.itemprice = itemprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_info.amount
     *
     * @return the value of order_info.amount
     *
     * @mbg.generated Sat May 11 18:35:45 CST 2019
     */
    public Integer getAmount() {
        return amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_info.amount
     *
     * @param amount the value for order_info.amount
     *
     * @mbg.generated Sat May 11 18:35:45 CST 2019
     */
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_info.orderPrice
     *
     * @return the value of order_info.orderPrice
     *
     * @mbg.generated Sat May 11 18:35:45 CST 2019
     */
    public Double getOrderprice() {
        return orderprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_info.orderPrice
     *
     * @param orderprice the value for order_info.orderPrice
     *
     * @mbg.generated Sat May 11 18:35:45 CST 2019
     */
    public void setOrderprice(Double orderprice) {
        this.orderprice = orderprice;
    }
}