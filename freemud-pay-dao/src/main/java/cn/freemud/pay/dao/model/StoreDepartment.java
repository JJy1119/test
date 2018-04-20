package cn.freemud.pay.dao.model;

import java.util.Date;

public class StoreDepartment {
    private Integer PKID;

    private String store_Id;

    private Integer partnerID;

    private String department;

    private Date createDate;

    private String companyCode;

    private Boolean isAlliance;

    private String subDepartment;

    public Integer getPKID() {
        return PKID;
    }

    public void setPKID(Integer PKID) {
        this.PKID = PKID;
    }

    public String getStore_Id() {
        return store_Id;
    }

    public void setStore_Id(String store_Id) {
        this.store_Id = store_Id == null ? null : store_Id.trim();
    }

    public Integer getPartnerID() {
        return partnerID;
    }

    public void setPartnerID(Integer partnerID) {
        this.partnerID = partnerID;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode == null ? null : companyCode.trim();
    }

    public Boolean getIsAlliance() {
        return isAlliance;
    }

    public void setIsAlliance(Boolean isAlliance) {
        this.isAlliance = isAlliance;
    }

    public String getSubDepartment() {
        return subDepartment;
    }

    public void setSubDepartment(String subDepartment) {
        this.subDepartment = subDepartment == null ? null : subDepartment.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", PKID=").append(PKID);
        sb.append(", store_Id=").append(store_Id);
        sb.append(", partnerID=").append(partnerID);
        sb.append(", department=").append(department);
        sb.append(", createDate=").append(createDate);
        sb.append(", companyCode=").append(companyCode);
        sb.append(", isAlliance=").append(isAlliance);
        sb.append(", subDepartment=").append(subDepartment);
        sb.append("]");
        return sb.toString();
    }
}