package cn.freemud.pay.dao.model;

import java.util.Date;

public class PayPlatformAccount {
    private Integer ID;

    private Integer partnerId;

    private String platform;

    private String platformPartnerId;

    private String platformAppKey;

    private String platformSellerId;

    private String platformSellerEmail;

    private String platformSubject;

    private String createUser;

    private Date createDate;

    private String signChar;

    private String cerFile;

    private String cerPassword;

    private String platformSubAccountId;

    private Boolean enable;

    private String platformAppId;

    private String password;

    private String agentId;

    private String authCode;

    private String memo;

    private String feeType;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
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

    public String getPlatformPartnerId() {
        return platformPartnerId;
    }

    public void setPlatformPartnerId(String platformPartnerId) {
        this.platformPartnerId = platformPartnerId == null ? null : platformPartnerId.trim();
    }

    public String getPlatformAppKey() {
        return platformAppKey;
    }

    public void setPlatformAppKey(String platformAppKey) {
        this.platformAppKey = platformAppKey == null ? null : platformAppKey.trim();
    }

    public String getPlatformSellerId() {
        return platformSellerId;
    }

    public void setPlatformSellerId(String platformSellerId) {
        this.platformSellerId = platformSellerId == null ? null : platformSellerId.trim();
    }

    public String getPlatformSellerEmail() {
        return platformSellerEmail;
    }

    public void setPlatformSellerEmail(String platformSellerEmail) {
        this.platformSellerEmail = platformSellerEmail == null ? null : platformSellerEmail.trim();
    }

    public String getPlatformSubject() {
        return platformSubject;
    }

    public void setPlatformSubject(String platformSubject) {
        this.platformSubject = platformSubject == null ? null : platformSubject.trim();
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

    public String getSignChar() {
        return signChar;
    }

    public void setSignChar(String signChar) {
        this.signChar = signChar == null ? null : signChar.trim();
    }

    public String getCerFile() {
        return cerFile;
    }

    public void setCerFile(String cerFile) {
        this.cerFile = cerFile == null ? null : cerFile.trim();
    }

    public String getCerPassword() {
        return cerPassword;
    }

    public void setCerPassword(String cerPassword) {
        this.cerPassword = cerPassword == null ? null : cerPassword.trim();
    }

    public String getPlatformSubAccountId() {
        return platformSubAccountId;
    }

    public void setPlatformSubAccountId(String platformSubAccountId) {
        this.platformSubAccountId = platformSubAccountId == null ? null : platformSubAccountId.trim();
    }

    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public String getPlatformAppId() {
        return platformAppId;
    }

    public void setPlatformAppId(String platformAppId) {
        this.platformAppId = platformAppId == null ? null : platformAppId.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId == null ? null : agentId.trim();
    }

    public String getAuthCode() {
        return authCode;
    }

    public void setAuthCode(String authCode) {
        this.authCode = authCode == null ? null : authCode.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public String getFeeType() {
        return feeType;
    }

    public void setFeeType(String feeType) {
        this.feeType = feeType == null ? null : feeType.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ID=").append(ID);
        sb.append(", partnerId=").append(partnerId);
        sb.append(", platform=").append(platform);
        sb.append(", platformPartnerId=").append(platformPartnerId);
        sb.append(", platformAppKey=").append(platformAppKey);
        sb.append(", platformSellerId=").append(platformSellerId);
        sb.append(", platformSellerEmail=").append(platformSellerEmail);
        sb.append(", platformSubject=").append(platformSubject);
        sb.append(", createUser=").append(createUser);
        sb.append(", createDate=").append(createDate);
        sb.append(", signChar=").append(signChar);
        sb.append(", cerFile=").append(cerFile);
        sb.append(", cerPassword=").append(cerPassword);
        sb.append(", platformSubAccountId=").append(platformSubAccountId);
        sb.append(", enable=").append(enable);
        sb.append(", platformAppId=").append(platformAppId);
        sb.append(", password=").append(password);
        sb.append(", agentId=").append(agentId);
        sb.append(", authCode=").append(authCode);
        sb.append(", memo=").append(memo);
        sb.append(", feeType=").append(feeType);
        sb.append("]");
        return sb.toString();
    }
}