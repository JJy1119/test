package cn.freemud.pay.dao.model;

import java.math.BigDecimal;

public class PayProducts {
    private Long ID;

    private String FMId;

    private String PID;

    private String PName;

    private BigDecimal PWeight;

    private BigDecimal PPrice;

    private String salesType;

    private Integer seq;

    private String PCata;

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

    public String getPID() {
        return PID;
    }

    public void setPID(String PID) {
        this.PID = PID == null ? null : PID.trim();
    }

    public String getPName() {
        return PName;
    }

    public void setPName(String PName) {
        this.PName = PName == null ? null : PName.trim();
    }

    public BigDecimal getPWeight() {
        return PWeight;
    }

    public void setPWeight(BigDecimal PWeight) {
        this.PWeight = PWeight;
    }

    public BigDecimal getPPrice() {
        return PPrice;
    }

    public void setPPrice(BigDecimal PPrice) {
        this.PPrice = PPrice;
    }

    public String getSalesType() {
        return salesType;
    }

    public void setSalesType(String salesType) {
        this.salesType = salesType == null ? null : salesType.trim();
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public String getPCata() {
        return PCata;
    }

    public void setPCata(String PCata) {
        this.PCata = PCata == null ? null : PCata.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ID=").append(ID);
        sb.append(", FMId=").append(FMId);
        sb.append(", PID=").append(PID);
        sb.append(", PName=").append(PName);
        sb.append(", PWeight=").append(PWeight);
        sb.append(", PPrice=").append(PPrice);
        sb.append(", salesType=").append(salesType);
        sb.append(", seq=").append(seq);
        sb.append(", PCata=").append(PCata);
        sb.append("]");
        return sb.toString();
    }
}