package com.train.pojo;

import java.math.BigDecimal;

public class TeachingMaterial {
    private String tmId;

    private String tmAbbr;

    private String tmIcon;

    private String tmName;

    private String tmImage;

    private String tmDesc;

    private BigDecimal tmPrice;

    public String getTmId() {
        return tmId;
    }

    public void setTmId(String tmId) {
        this.tmId = tmId == null ? null : tmId.trim();
    }

    public String getTmAbbr() {
        return tmAbbr;
    }

    public void setTmAbbr(String tmAbbr) {
        this.tmAbbr = tmAbbr == null ? null : tmAbbr.trim();
    }

    public String getTmIcon() {
        return tmIcon;
    }

    public void setTmIcon(String tmIcon) {
        this.tmIcon = tmIcon == null ? null : tmIcon.trim();
    }

    public String getTmName() {
        return tmName;
    }

    public void setTmName(String tmName) {
        this.tmName = tmName == null ? null : tmName.trim();
    }

    public String getTmImage() {
        return tmImage;
    }

    public void setTmImage(String tmImage) {
        this.tmImage = tmImage == null ? null : tmImage.trim();
    }

    public String getTmDesc() {
        return tmDesc;
    }

    public void setTmDesc(String tmDesc) {
        this.tmDesc = tmDesc == null ? null : tmDesc.trim();
    }

    public BigDecimal getTmPrice() {
        return tmPrice;
    }

    public void setTmPrice(BigDecimal tmPrice) {
        this.tmPrice = tmPrice;
    }
}