package cn.freemud.pay.dao.model;

public class TebCode {
    private Integer pkid;

    private String ebcode;

    private String ebname;

    private String memo;

    private String ebcodemapto;

    private String isoneline;

    private String sendcodetype;

    public Integer getPkid() {
        return pkid;
    }

    public void setPkid(Integer pkid) {
        this.pkid = pkid;
    }

    public String getEbcode() {
        return ebcode;
    }

    public void setEbcode(String ebcode) {
        this.ebcode = ebcode == null ? null : ebcode.trim();
    }

    public String getEbname() {
        return ebname;
    }

    public void setEbname(String ebname) {
        this.ebname = ebname == null ? null : ebname.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public String getEbcodemapto() {
        return ebcodemapto;
    }

    public void setEbcodemapto(String ebcodemapto) {
        this.ebcodemapto = ebcodemapto == null ? null : ebcodemapto.trim();
    }

    public String getIsoneline() {
        return isoneline;
    }

    public void setIsoneline(String isoneline) {
        this.isoneline = isoneline == null ? null : isoneline.trim();
    }

    public String getSendcodetype() {
        return sendcodetype;
    }

    public void setSendcodetype(String sendcodetype) {
        this.sendcodetype = sendcodetype == null ? null : sendcodetype.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pkid=").append(pkid);
        sb.append(", ebcode=").append(ebcode);
        sb.append(", ebname=").append(ebname);
        sb.append(", memo=").append(memo);
        sb.append(", ebcodemapto=").append(ebcodemapto);
        sb.append(", isoneline=").append(isoneline);
        sb.append(", sendcodetype=").append(sendcodetype);
        sb.append("]");
        return sb.toString();
    }
}