package cn.freemud.pay.dao.model;

import java.math.BigDecimal;
import java.util.Date;

public class PayPromotion {
    private Integer id;

    private Integer partnerId;

    private String name;

    private String description;

    private Integer status;

    private Date startTime;

    private Date endTime;

    private Integer scope;

    private Integer area;

    private String platform;

    private String platformTag;

    private Integer priority;

    private Date createDate;

    private String createUser;

    private Date lastEditDate;

    private String lastEditUser;

    private BigDecimal miniAmount;

    private BigDecimal maxAmount;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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

    public Integer getScope() {
        return scope;
    }

    public void setScope(Integer scope) {
        this.scope = scope;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform == null ? null : platform.trim();
    }

    public String getPlatformTag() {
        return platformTag;
    }

    public void setPlatformTag(String platformTag) {
        this.platformTag = platformTag == null ? null : platformTag.trim();
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
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

    public Date getLastEditDate() {
        return lastEditDate;
    }

    public void setLastEditDate(Date lastEditDate) {
        this.lastEditDate = lastEditDate;
    }

    public String getLastEditUser() {
        return lastEditUser;
    }

    public void setLastEditUser(String lastEditUser) {
        this.lastEditUser = lastEditUser == null ? null : lastEditUser.trim();
    }

    public BigDecimal getMiniAmount() {
        return miniAmount;
    }

    public void setMiniAmount(BigDecimal miniAmount) {
        this.miniAmount = miniAmount;
    }

    public BigDecimal getMaxAmount() {
        return maxAmount;
    }

    public void setMaxAmount(BigDecimal maxAmount) {
        this.maxAmount = maxAmount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", partnerId=").append(partnerId);
        sb.append(", name=").append(name);
        sb.append(", description=").append(description);
        sb.append(", status=").append(status);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", scope=").append(scope);
        sb.append(", area=").append(area);
        sb.append(", platform=").append(platform);
        sb.append(", platformTag=").append(platformTag);
        sb.append(", priority=").append(priority);
        sb.append(", createDate=").append(createDate);
        sb.append(", createUser=").append(createUser);
        sb.append(", lastEditDate=").append(lastEditDate);
        sb.append(", lastEditUser=").append(lastEditUser);
        sb.append(", miniAmount=").append(miniAmount);
        sb.append(", maxAmount=").append(maxAmount);
        sb.append("]");
        return sb.toString();
    }
}