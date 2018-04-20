package cn.freemud.pay.dao.model;

public class Company {
    private Integer id;

    private String partnerid;

    private String companycode;

    private String companyname;

    private String unifyid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPartnerid() {
        return partnerid;
    }

    public void setPartnerid(String partnerid) {
        this.partnerid = partnerid == null ? null : partnerid.trim();
    }

    public String getCompanycode() {
        return companycode;
    }

    public void setCompanycode(String companycode) {
        this.companycode = companycode == null ? null : companycode.trim();
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname == null ? null : companyname.trim();
    }

    public String getUnifyid() {
        return unifyid;
    }

    public void setUnifyid(String unifyid) {
        this.unifyid = unifyid == null ? null : unifyid.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", partnerid=").append(partnerid);
        sb.append(", companycode=").append(companycode);
        sb.append(", companyname=").append(companyname);
        sb.append(", unifyid=").append(unifyid);
        sb.append("]");
        return sb.toString();
    }
}