package com.ifeng.auto.model;

import java.util.Date;

public class DealerSalesOrder {
    private Integer id;
    private String sorderid;
    private String sid;
    private String grouponid;
    private String enrolmentid;
    private Integer carid;
    private Float price;
    private String remark;

    private Date quotetime;

    private Date enddate;

    private Byte winbidding;

    private Byte quote;

    private Byte havecar;

    private Byte stage;

    private String identifycode;

    private Byte upload;

    private Date createdate;

    private Date updatedate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSorderid() {
        return sorderid;
    }

    public void setSorderid(String sorderid) {
        this.sorderid = sorderid == null ? null : sorderid.trim();
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid == null ? null : sid.trim();
    }

    public String getGrouponid() {
        return grouponid;
    }

    public void setGrouponid(String grouponid) {
        this.grouponid = grouponid == null ? null : grouponid.trim();
    }

    public String getEnrolmentid() {
        return enrolmentid;
    }

    public void setEnrolmentid(String enrolmentid) {
        this.enrolmentid = enrolmentid == null ? null : enrolmentid.trim();
    }

    public Integer getCarid() {
        return carid;
    }

    public void setCarid(Integer carid) {
        this.carid = carid;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getQuotetime() {
        return quotetime;
    }

    public void setQuotetime(Date quotetime) {
        this.quotetime = quotetime;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public Byte getWinbidding() {
        return winbidding;
    }

    public void setWinbidding(Byte winbidding) {
        this.winbidding = winbidding;
    }

    public Byte getQuote() {
        return quote;
    }

    public void setQuote(Byte quote) {
        this.quote = quote;
    }

    public Byte getHavecar() {
        return havecar;
    }

    public void setHavecar(Byte havecar) {
        this.havecar = havecar;
    }

    public Byte getStage() {
        return stage;
    }

    public void setStage(Byte stage) {
        this.stage = stage;
    }

    public String getIdentifycode() {
        return identifycode;
    }

    public void setIdentifycode(String identifycode) {
        this.identifycode = identifycode == null ? null : identifycode.trim();
    }

    public Byte getUpload() {
        return upload;
    }

    public void setUpload(Byte upload) {
        this.upload = upload;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Date getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(Date updatedate) {
        this.updatedate = updatedate;
    }
}