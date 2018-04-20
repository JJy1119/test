package cn.freemud.pay.dao.model;

import java.math.BigDecimal;
import java.util.Date;

public class PayChangeLog {
    private Long ID;

    private Long payId;

    private String partnerOrderID;

    private String code;

    private String action;

    private BigDecimal amount;

    private Integer state;

    private String createUser;

    private Date createDate;

    private String editUser;

    private Date editDate;

    private String fundChanged;

    private String refundId;

    private String operatorId;

    private Long refundPayId;

    private String storeId;

    private String stationId;

    private Short tryTimes;

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public Long getPayId() {
        return payId;
    }

    public void setPayId(Long payId) {
        this.payId = payId;
    }

    public String getPartnerOrderID() {
        return partnerOrderID;
    }

    public void setPartnerOrderID(String partnerOrderID) {
        this.partnerOrderID = partnerOrderID == null ? null : partnerOrderID.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action == null ? null : action.trim();
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

    public String getEditUser() {
        return editUser;
    }

    public void setEditUser(String editUser) {
        this.editUser = editUser == null ? null : editUser.trim();
    }

    public Date getEditDate() {
        return editDate;
    }

    public void setEditDate(Date editDate) {
        this.editDate = editDate;
    }

    public String getFundChanged() {
        return fundChanged;
    }

    public void setFundChanged(String fundChanged) {
        this.fundChanged = fundChanged == null ? null : fundChanged.trim();
    }

    public String getRefundId() {
        return refundId;
    }

    public void setRefundId(String refundId) {
        this.refundId = refundId == null ? null : refundId.trim();
    }

    public String getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId == null ? null : operatorId.trim();
    }

    public Long getRefundPayId() {
        return refundPayId;
    }

    public void setRefundPayId(Long refundPayId) {
        this.refundPayId = refundPayId;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId == null ? null : storeId.trim();
    }

    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId == null ? null : stationId.trim();
    }

    public Short getTryTimes() {
        return tryTimes;
    }

    public void setTryTimes(Short tryTimes) {
        this.tryTimes = tryTimes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ID=").append(ID);
        sb.append(", payId=").append(payId);
        sb.append(", partnerOrderID=").append(partnerOrderID);
        sb.append(", code=").append(code);
        sb.append(", action=").append(action);
        sb.append(", amount=").append(amount);
        sb.append(", state=").append(state);
        sb.append(", createUser=").append(createUser);
        sb.append(", createDate=").append(createDate);
        sb.append(", editUser=").append(editUser);
        sb.append(", editDate=").append(editDate);
        sb.append(", fundChanged=").append(fundChanged);
        sb.append(", refundId=").append(refundId);
        sb.append(", operatorId=").append(operatorId);
        sb.append(", refundPayId=").append(refundPayId);
        sb.append(", storeId=").append(storeId);
        sb.append(", stationId=").append(stationId);
        sb.append(", tryTimes=").append(tryTimes);
        sb.append("]");
        return sb.toString();
    }
}