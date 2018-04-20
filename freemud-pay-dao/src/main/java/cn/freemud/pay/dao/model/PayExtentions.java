package cn.freemud.pay.dao.model;

public class PayExtentions {
    private Long ID;

    private String FMId;

    private String personnelId;

    private String classNo;

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getFMId() {
        return FMId;
    }

    public void setFMId(String FMId) {
        this.FMId = FMId == null ? null : FMId.trim();
    }

    public String getPersonnelId() {
        return personnelId;
    }

    public void setPersonnelId(String personnelId) {
        this.personnelId = personnelId == null ? null : personnelId.trim();
    }

    public String getClassNo() {
        return classNo;
    }

    public void setClassNo(String classNo) {
        this.classNo = classNo == null ? null : classNo.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ID=").append(ID);
        sb.append(", FMId=").append(FMId);
        sb.append(", personnelId=").append(personnelId);
        sb.append(", classNo=").append(classNo);
        sb.append("]");
        return sb.toString();
    }
}