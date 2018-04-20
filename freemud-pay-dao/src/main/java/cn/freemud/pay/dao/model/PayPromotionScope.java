package cn.freemud.pay.dao.model;

public class PayPromotionScope {
    private Integer id;

    private Integer payPromotionId;

    private String scope;

    private String type;

    private Boolean exclude;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPayPromotionId() {
        return payPromotionId;
    }

    public void setPayPromotionId(Integer payPromotionId) {
        this.payPromotionId = payPromotionId;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope == null ? null : scope.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Boolean getExclude() {
        return exclude;
    }

    public void setExclude(Boolean exclude) {
        this.exclude = exclude;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", payPromotionId=").append(payPromotionId);
        sb.append(", scope=").append(scope);
        sb.append(", type=").append(type);
        sb.append(", exclude=").append(exclude);
        sb.append("]");
        return sb.toString();
    }
}