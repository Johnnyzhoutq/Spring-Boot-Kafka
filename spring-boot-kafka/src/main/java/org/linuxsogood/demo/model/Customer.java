package org.linuxsogood.demo.model;

import java.math.BigDecimal;
import java.util.Date;

public class Customer {
    private BigDecimal customerId;

    private String customerCode;

    private String customerName;

    private String customerAid;

    private String customerOldCode;

    private String customerDescribe;

    private BigDecimal customerSortId;

    private BigDecimal customerGradeId;

    private String customerTypeCode;

    private BigDecimal customerTypeId;

    private String customerStatus;

    private String provinceCode;

    private String provinceName;

    private String cityCode;

    private String cityName;

    private String areaCode;

    private String areaName;

    private String customerAddress;

    private String customerLinkman;

    private String linkmanTel;

    private String linkmanMobile;

    private String linkmanFax;

    private String linkmanEmail;

    private String customerIm;

    private BigDecimal billCycleId;

    private String billCycleCode;

    private Integer paymentDay;

    private String customerIsAdvance;

    private BigDecimal advancePayment;

    private BigDecimal antecedentMoney;

    private String kingdeeInterface;

    private Date createTime;

    private Date updateTime;

    public BigDecimal getCustomerId() {
        return customerId;
    }

    public void setCustomerId(BigDecimal customerId) {
        this.customerId = customerId;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode == null ? null : customerCode.trim();
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }

    public String getCustomerAid() {
        return customerAid;
    }

    public void setCustomerAid(String customerAid) {
        this.customerAid = customerAid == null ? null : customerAid.trim();
    }

    public String getCustomerOldCode() {
        return customerOldCode;
    }

    public void setCustomerOldCode(String customerOldCode) {
        this.customerOldCode = customerOldCode == null ? null : customerOldCode.trim();
    }

    public String getCustomerDescribe() {
        return customerDescribe;
    }

    public void setCustomerDescribe(String customerDescribe) {
        this.customerDescribe = customerDescribe == null ? null : customerDescribe.trim();
    }

    public BigDecimal getCustomerSortId() {
        return customerSortId;
    }

    public void setCustomerSortId(BigDecimal customerSortId) {
        this.customerSortId = customerSortId;
    }

    public BigDecimal getCustomerGradeId() {
        return customerGradeId;
    }

    public void setCustomerGradeId(BigDecimal customerGradeId) {
        this.customerGradeId = customerGradeId;
    }

    public String getCustomerTypeCode() {
        return customerTypeCode;
    }

    public void setCustomerTypeCode(String customerTypeCode) {
        this.customerTypeCode = customerTypeCode == null ? null : customerTypeCode.trim();
    }

    public BigDecimal getCustomerTypeId() {
        return customerTypeId;
    }

    public void setCustomerTypeId(BigDecimal customerTypeId) {
        this.customerTypeId = customerTypeId;
    }

    public String getCustomerStatus() {
        return customerStatus;
    }

    public void setCustomerStatus(String customerStatus) {
        this.customerStatus = customerStatus == null ? null : customerStatus.trim();
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode == null ? null : provinceCode.trim();
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName == null ? null : provinceName.trim();
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode == null ? null : cityCode.trim();
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName == null ? null : cityName.trim();
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode == null ? null : areaCode.trim();
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName == null ? null : areaName.trim();
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress == null ? null : customerAddress.trim();
    }

    public String getCustomerLinkman() {
        return customerLinkman;
    }

    public void setCustomerLinkman(String customerLinkman) {
        this.customerLinkman = customerLinkman == null ? null : customerLinkman.trim();
    }

    public String getLinkmanTel() {
        return linkmanTel;
    }

    public void setLinkmanTel(String linkmanTel) {
        this.linkmanTel = linkmanTel == null ? null : linkmanTel.trim();
    }

    public String getLinkmanMobile() {
        return linkmanMobile;
    }

    public void setLinkmanMobile(String linkmanMobile) {
        this.linkmanMobile = linkmanMobile == null ? null : linkmanMobile.trim();
    }

    public String getLinkmanFax() {
        return linkmanFax;
    }

    public void setLinkmanFax(String linkmanFax) {
        this.linkmanFax = linkmanFax == null ? null : linkmanFax.trim();
    }

    public String getLinkmanEmail() {
        return linkmanEmail;
    }

    public void setLinkmanEmail(String linkmanEmail) {
        this.linkmanEmail = linkmanEmail == null ? null : linkmanEmail.trim();
    }

    public String getCustomerIm() {
        return customerIm;
    }

    public void setCustomerIm(String customerIm) {
        this.customerIm = customerIm == null ? null : customerIm.trim();
    }

    public BigDecimal getBillCycleId() {
        return billCycleId;
    }

    public void setBillCycleId(BigDecimal billCycleId) {
        this.billCycleId = billCycleId;
    }

    public String getBillCycleCode() {
        return billCycleCode;
    }

    public void setBillCycleCode(String billCycleCode) {
        this.billCycleCode = billCycleCode == null ? null : billCycleCode.trim();
    }

    public Integer getPaymentDay() {
        return paymentDay;
    }

    public void setPaymentDay(Integer paymentDay) {
        this.paymentDay = paymentDay;
    }

    public String getCustomerIsAdvance() {
        return customerIsAdvance;
    }

    public void setCustomerIsAdvance(String customerIsAdvance) {
        this.customerIsAdvance = customerIsAdvance == null ? null : customerIsAdvance.trim();
    }

    public BigDecimal getAdvancePayment() {
        return advancePayment;
    }

    public void setAdvancePayment(BigDecimal advancePayment) {
        this.advancePayment = advancePayment;
    }

    public BigDecimal getAntecedentMoney() {
        return antecedentMoney;
    }

    public void setAntecedentMoney(BigDecimal antecedentMoney) {
        this.antecedentMoney = antecedentMoney;
    }

    public String getKingdeeInterface() {
        return kingdeeInterface;
    }

    public void setKingdeeInterface(String kingdeeInterface) {
        this.kingdeeInterface = kingdeeInterface == null ? null : kingdeeInterface.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}