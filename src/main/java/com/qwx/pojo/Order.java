package com.qwx.pojo;

import java.util.Date;

public class Order {

    private Integer id;
    private Date createtime;
    private Integer price;
    private String remark;
    private Integer userid;

    public Order() {
    }

    public Order(Integer id, Date createtime, Integer price, String remark, Integer userid) {
        this.id = id;
        this.createtime = createtime;
        this.price = price;
        this.remark = remark;
        this.userid = userid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", createtime=" + createtime +
                ", price=" + price +
                ", remark='" + remark + '\'' +
                ", userid=" + userid +
                '}';
    }
}
