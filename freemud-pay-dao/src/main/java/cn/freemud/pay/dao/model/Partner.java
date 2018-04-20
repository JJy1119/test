package cn.freemud.pay.dao.model;

public class Partner {
    private Integer ID;

    private String partnerName;

    private String ourAccount_Partner;

    private String logo;

    private String description;

    private String partnerCode;

    private String appSecret;

    private String EBCode;

    private Boolean enableSMS;

    private String partnerType;

    private String unifyId;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getPartnerName() {
        return partnerName;
    }

    public void setPartnerName(String partnerName) {
        this.partnerName = partnerName == null ? null : partnerName.trim();
    }

    public String getOurAccount_Partner() {
        return ourAccount_Partner;
    }

    public void setOurAccount_Partner(String ourAccount_Partner) {
        this.ourAccount_Partner = ourAccount_Partner == null ? null : ourAccount_Partner.trim();
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo == null ? null : logo.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getPartnerCode() {
        return partnerCode;
    }

    public void setPartnerCode(String partnerCode) {
        this.partnerCode = partnerCode == null ? null : partnerCode.trim();
    }

    public String getAppSecret() {
        return appSecret;
    }

    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret == null ? null : appSecret.trim();
    }

    public String getEBCode() {
        return EBCode;
    }

    public void setEBCode(String EBCode) {
        this.EBCode = EBCode == null ? null : EBCode.trim();
    }

    public Boolean getEnableSMS() {
        return enableSMS;
    }

    public void setEnableSMS(Boolean enableSMS) {
        this.enableSMS = enableSMS;
    }

    public String getPartnerType() {
        return partnerType;
    }

    public void setPartnerType(String partnerType) {
        this.partnerType = partnerType == null ? null : partnerType.trim();
    }

    public String getUnifyId() {
        return unifyId;
    }

    public void setUnifyId(String unifyId) {
        this.unifyId = unifyId == null ? null : unifyId.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ID=").append(ID);
        sb.append(", partnerName=").append(partnerName);
        sb.append(", ourAccount_Partner=").append(ourAccount_Partner);
        sb.append(", logo=").append(logo);
        sb.append(", description=").append(description);
        sb.append(", partnerCode=").append(partnerCode);
        sb.append(", appSecret=").append(appSecret);
        sb.append(", EBCode=").append(EBCode);
        sb.append(", enableSMS=").append(enableSMS);
        sb.append(", partnerType=").append(partnerType);
        sb.append(", unifyId=").append(unifyId);
        sb.append("]");
        return sb.toString();
    }
}