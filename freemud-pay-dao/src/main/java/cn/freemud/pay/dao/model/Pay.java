package cn.freemud.pay.dao.model;

import java.math.BigDecimal;
import java.util.Date;

public class Pay {
    private Long ID;

    private String store_Id;

    private String station_Id;

    private String operator_Id;

    private String partner;

    private String partnerAccount;

    private String partnerOrderID;

    private String platformTradeAccount;

    private String platformTradeNumber;

    private String code;

    private BigDecimal amount;

    private Integer state;

    private String subject;

    private String remark;

    private String createUser;

    private Date createDate;

    private String cancelUser;

    private Date cancelDate;

    private String trans_Id;

    private String zhuiHuOrderId;

    private Integer alipayState;

    private String platformPartnerID;

    private Integer partnerID;

    private String platformBuyerUserId;

    private String platform;

    private BigDecimal mcoupon;

    private String businessDate;

    private Long orginalPayId;

    private BigDecimal pcoupon;

    private BigDecimal liquidatorCommissionRate;

    private BigDecimal liquidatorCommissionFee;

    private BigDecimal bankCommissionFee;

    private BigDecimal bankCommissionRate;

    private BigDecimal payPlatformRate;

    private BigDecimal payPlatformFee;

    private BigDecimal netAmount;

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getStore_Id() {
        return store_Id;
    }

    public void setStore_Id(String store_Id) {
        this.store_Id = store_Id == null ? null : store_Id.trim();
    }

    public String getStation_Id() {
        return station_Id;
    }

    public void setStation_Id(String station_Id) {
        this.station_Id = station_Id == null ? null : station_Id.trim();
    }

    public String getOperator_Id() {
        return operator_Id;
    }

    public void setOperator_Id(String operator_Id) {
        this.operator_Id = operator_Id == null ? null : operator_Id.trim();
    }

    public String getPartner() {
        return partner;
    }

    public void setPartner(String partner) {
        this.partner = partner == null ? null : partner.trim();
    }

    public String getPartnerAccount() {
        return partnerAccount;
    }

    public void setPartnerAccount(String partnerAccount) {
        this.partnerAccount = partnerAccount == null ? null : partnerAccount.trim();
    }

    public String getPartnerOrderID() {
        return partnerOrderID;
    }

    public void setPartnerOrderID(String partnerOrderID) {
        this.partnerOrderID = partnerOrderID == null ? null : partnerOrderID.trim();
    }

    public String getPlatformTradeAccount() {
        return platformTradeAccount;
    }

    public void setPlatformTradeAccount(String platformTradeAccount) {
        this.platformTradeAccount = platformTradeAccount == null ? null : platformTradeAccount.trim();
    }

    public String getPlatformTradeNumber() {
        return platformTradeNumber;
    }

    public void setPlatformTradeNumber(String platformTradeNumber) {
        this.platformTradeNumber = platformTradeNumber == null ? null : platformTradeNumber.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject == null ? null : subject.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCancelUser() {
        return cancelUser;
    }

    public void setCancelUser(String cancelUser) {
        this.cancelUser = cancelUser == null ? null : cancelUser.trim();
    }

    public Date getCancelDate() {
        return cancelDate;
    }

    public void setCancelDate(Date cancelDate) {
        this.cancelDate = cancelDate;
    }

    public String getTrans_Id() {
        return trans_Id;
    }

    public void setTrans_Id(String trans_Id) {
        this.trans_Id = trans_Id == null ? null : trans_Id.trim();
    }

    public String getZhuiHuOrderId() {
        return zhuiHuOrderId;
    }

    public void setZhuiHuOrderId(String zhuiHuOrderId) {
        this.zhuiHuOrderId = zhuiHuOrderId == null ? null : zhuiHuOrderId.trim();
    }

    public Integer getAlipayState() {
        return alipayState;
    }

    public void setAlipayState(Integer alipayState) {
        this.alipayState = alipayState;
    }

    public String getPlatformPartnerID() {
        return platformPartnerID;
    }

    public void setPlatformPartnerID(String platformPartnerID) {
        this.platformPartnerID = platformPartnerID == null ? null : platformPartnerID.trim();
    }

    public Integer getPartnerID() {
        return partnerID;
    }

    public void setPartnerID(Integer partnerID) {
        this.partnerID = partnerID;
    }

    public String getPlatformBuyerUserId() {
        return platformBuyerUserId;
    }

    public void setPlatformBuyerUserId(String platformBuyerUserId) {
        this.platformBuyerUserId = platformBuyerUserId == null ? null : platformBuyerUserId.trim();
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform == null ? null : platform.trim();
    }

    public BigDecimal getMcoupon() {
        return mcoupon;
    }

    public void setMcoupon(BigDecimal mcoupon) {
        this.mcoupon = mcoupon;
    }

    public String getBusinessDate() {
        return businessDate;
    }

    public void setBusinessDate(String businessDate) {
        this.businessDate = businessDate == null ? null : businessDate.trim();
    }

    public Long getOrginalPayId() {
        return orginalPayId;
    }

    public void setOrginalPayId(Long orginalPayId) {
        this.orginalPayId = orginalPayId;
    }

    public BigDecimal getPcoupon() {
        return pcoupon;
    }

    public void setPcoupon(BigDecimal pcoupon) {
        this.pcoupon = pcoupon;
    }

    public BigDecimal getLiquidatorCommissionRate() {
        return liquidatorCommissionRate;
    }

    public void setLiquidatorCommissionRate(BigDecimal liquidatorCommissionRate) {
        this.liquidatorCommissionRate = liquidatorCommissionRate;
    }

    public BigDecimal getLiquidatorCommissionFee() {
        return liquidatorCommissionFee;
    }

    public void setLiquidatorCommissionFee(BigDecimal liquidatorCommissionFee) {
        this.liquidatorCommissionFee = liquidatorCommissionFee;
    }

    public BigDecimal getBankCommissionFee() {
        return bankCommissionFee;
    }

    public void setBankCommissionFee(BigDecimal bankCommissionFee) {
        this.bankCommissionFee = bankCommissionFee;
    }

    public BigDecimal getBankCommissionRate() {
        return bankCommissionRate;
    }

    public void setBankCommissionRate(BigDecimal bankCommissionRate) {
        this.bankCommissionRate = bankCommissionRate;
    }

    public BigDecimal getPayPlatformRate() {
        return payPlatformRate;
    }

    public void setPayPlatformRate(BigDecimal payPlatformRate) {
        this.payPlatformRate = payPlatformRate;
    }

    public BigDecimal getPayPlatformFee() {
        return payPlatformFee;
    }

    public void setPayPlatformFee(BigDecimal payPlatformFee) {
        this.payPlatformFee = payPlatformFee;
    }

    public BigDecimal getNetAmount() {
        return netAmount;
    }

    public void setNetAmount(BigDecimal netAmount) {
        this.netAmount = netAmount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ID=").append(ID);
        sb.append(", store_Id=").append(store_Id);
        sb.append(", station_Id=").append(station_Id);
        sb.append(", operator_Id=").append(operator_Id);
        sb.append(", partner=").append(partner);
        sb.append(", partnerAccount=").append(partnerAccount);
        sb.append(", partnerOrderID=").append(partnerOrderID);
        sb.append(", platformTradeAccount=").append(platformTradeAccount);
        sb.append(", platformTradeNumber=").append(platformTradeNumber);
        sb.append(", code=").append(code);
        sb.append(", amount=").append(amount);
        sb.append(", state=").append(state);
        sb.append(", subject=").append(subject);
        sb.append(", remark=").append(remark);
        sb.append(", createUser=").append(createUser);
        sb.append(", createDate=").append(createDate);
        sb.append(", cancelUser=").append(cancelUser);
        sb.append(", cancelDate=").append(cancelDate);
        sb.append(", trans_Id=").append(trans_Id);
        sb.append(", zhuiHuOrderId=").append(zhuiHuOrderId);
        sb.append(", alipayState=").append(alipayState);
        sb.append(", platformPartnerID=").append(platformPartnerID);
        sb.append(", partnerID=").append(partnerID);
        sb.append(", platformBuyerUserId=").append(platformBuyerUserId);
        sb.append(", platform=").append(platform);
        sb.append(", mcoupon=").append(mcoupon);
        sb.append(", businessDate=").append(businessDate);
        sb.append(", orginalPayId=").append(orginalPayId);
        sb.append(", pcoupon=").append(pcoupon);
        sb.append(", liquidatorCommissionRate=").append(liquidatorCommissionRate);
        sb.append(", liquidatorCommissionFee=").append(liquidatorCommissionFee);
        sb.append(", bankCommissionFee=").append(bankCommissionFee);
        sb.append(", bankCommissionRate=").append(bankCommissionRate);
        sb.append(", payPlatformRate=").append(payPlatformRate);
        sb.append(", payPlatformFee=").append(payPlatformFee);
        sb.append(", netAmount=").append(netAmount);
        sb.append("]");
        return sb.toString();
    }
}