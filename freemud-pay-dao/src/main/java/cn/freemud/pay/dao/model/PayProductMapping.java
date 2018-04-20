package cn.freemud.pay.dao.model;

import java.math.BigDecimal;
import java.util.Date;

public class PayProductMapping {
    private Integer id;

    private Integer partnerId;

    private String pid;

    private String name;

    private String pidMapTo;

    private String nameMapTo;

    private Date startTime;

    private Date endTime;

    private Date createDate;

    private String createUser;

    private BigDecimal originalPrice;

    private BigDecimal salesPrice;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPartnerId() {
        return partnerId;
    }

    public void setPartnerId(Integer partnerId) {
        this.partnerId = partnerId;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPidMapTo() {
        return pidMapTo;
    }

    public void setPidMapTo(String pidMapTo) {
        this.pidMapTo = pidMapTo == null ? null : pidMapTo.trim();
    }

    public String getNameMapTo() {
        return nameMapTo;
    }

    public void setNameMapTo(String nameMapTo) {
        this.nameMapTo = nameMapTo == null ? null : nameMapTo.trim();
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public BigDecimal getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(BigDecimal originalPrice) {
        this.originalPrice = originalPrice;
    }

    public BigDecimal getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(BigDecimal salesPrice) {
        this.salesPrice = salesPrice;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", partnerId=").append(partnerId);
        sb.append(", pid=").append(pid);
        sb.append(", name=").append(name);
        sb.append(", pidMapTo=").append(pidMapTo);
        sb.append(", nameMapTo=").append(nameMapTo);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", createDate=").append(createDate);
        sb.append(", createUser=").append(createUser);
        sb.append(", originalPrice=").append(originalPrice);
        sb.append(", salesPrice=").append(salesPrice);
        sb.append("]");
        return sb.toString();
    }
}