package com.train.pojo;

public class PrivilegePolicy {
    private String no;

    private String ppName;

    private String ppIcon;

    private String ppDesc;

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no == null ? null : no.trim();
    }

    public String getPpName() {
        return ppName;
    }

    public void setPpName(String ppName) {
        this.ppName = ppName == null ? null : ppName.trim();
    }

    public String getPpIcon() {
        return ppIcon;
    }

    public void setPpIcon(String ppIcon) {
        this.ppIcon = ppIcon == null ? null : ppIcon.trim();
    }

    public String getPpDesc() {
        return ppDesc;
    }

    public void setPpDesc(String ppDesc) {
        this.ppDesc = ppDesc == null ? null : ppDesc.trim();
    }
}