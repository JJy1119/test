package cn.freemud.pay.dao.model;

import java.util.Date;

public class PayPlatformAccountAuth {
    private Long id;

    private Integer partnerId;

    private String platform;

    private String userId;

    private Integer payPlatformAccountId;

    private String authCode;

    private String refreshToken;

    private String memo;

    private Date refreshDate;

    private Date expiryDate;

    private Date createDate;

    private Date lastEditDate;

    private Integer payPlatformAccount;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getPartnerId() {
        return partnerId;
    }

    public void setPartnerId(Integer partnerId) {
        this.partnerId = partnerId;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform == null ? null : platform.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Integer getPayPlatformAccountId() {
        return payPlatformAccountId;
    }

    public void setPayPlatformAccountId(Integer payPlatformAccountId) {
        this.payPlatformAccountId = payPlatformAccountId;
    }

    public String getAuthCode() {
        return authCode;
    }

    public void setAuthCode(String authCode) {
        this.authCode = authCode == null ? null : authCode.trim();
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken == null ? null : refreshToken.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public Date getRefreshDate() {
        return refreshDate;
    }

    public void setRefreshDate(Date refreshDate) {
        this.refreshDate = refreshDate;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getLastEditDate() {
        return lastEditDate;
    }

    public void setLastEditDate(Date lastEditDate) {
        this.lastEditDate = lastEditDate;
    }

    public Integer getPayPlatformAccount() {
        return payPlatformAccount;
    }

    public void setPayPlatformAccount(Integer payPlatformAccount) {
        this.payPlatformAccount = payPlatformAccount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", partnerId=").append(partnerId);
        sb.append(", platform=").append(platform);
        sb.append(", userId=").append(userId);
        sb.append(", payPlatformAccountId=").append(payPlatformAccountId);
        sb.append(", authCode=").append(authCode);
        sb.append(", refreshToken=").append(refreshToken);
        sb.append(", memo=").append(memo);
        sb.append(", refreshDate=").append(refreshDate);
        sb.append(", expiryDate=").append(expiryDate);
        sb.append(", createDate=").append(createDate);
        sb.append(", lastEditDate=").append(lastEditDate);
        sb.append(", payPlatformAccount=").append(payPlatformAccount);
        sb.append("]");
        return sb.toString();
    }
}