package cn.freemud.pay.dao.model;

public class StoreExtend {
    private Long id;

    private Integer partnerid;

    private String nuomitp;

    private String storeid;

    private String nuomimerchantid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getPartnerid() {
        return partnerid;
    }

    public void setPartnerid(Integer partnerid) {
        this.partnerid = partnerid;
    }

    public String getNuomitp() {
        return nuomitp;
    }

    public void setNuomitp(String nuomitp) {
        this.nuomitp = nuomitp == null ? null : nuomitp.trim();
    }

    public String getStoreid() {
        return storeid;
    }

    public void setStoreid(String storeid) {
        this.storeid = storeid == null ? null : storeid.trim();
    }

    public String getNuomimerchantid() {
        return nuomimerchantid;
    }

    public void setNuomimerchantid(String nuomimerchantid) {
        this.nuomimerchantid = nuomimerchantid == null ? null : nuomimerchantid.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", partnerid=").append(partnerid);
        sb.append(", nuomitp=").append(nuomitp);
        sb.append(", storeid=").append(storeid);
        sb.append(", nuomimerchantid=").append(nuomimerchantid);
        sb.append("]");
        return sb.toString();
    }
}