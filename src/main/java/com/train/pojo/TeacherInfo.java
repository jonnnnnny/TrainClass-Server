package com.train.pojo;

public class TeacherInfo {
    private String tiId;

    private String tiBfname;

    private String tiChnname;

    private String tiEngname;

    private String tiGender;

    private String tiPic;

    private String tiIdcardphoto;

    private String tiBfdesc;

    private String tiContact;

    private String tiComment;

    private String tiHistinfo;

    public String getTiId() {
        return tiId;
    }

    public void setTiId(String tiId) {
        this.tiId = tiId == null ? null : tiId.trim();
    }

    public String getTiBfname() {
        return tiBfname;
    }

    public void setTiBfname(String tiBfname) {
        this.tiBfname = tiBfname == null ? null : tiBfname.trim();
    }

    public String getTiChnname() {
        return tiChnname;
    }

    public void setTiChnname(String tiChnname) {
        this.tiChnname = tiChnname == null ? null : tiChnname.trim();
    }

    public String getTiEngname() {
        return tiEngname;
    }

    public void setTiEngname(String tiEngname) {
        this.tiEngname = tiEngname == null ? null : tiEngname.trim();
    }

    public String getTiGender() {
        return tiGender;
    }

    public void setTiGender(String tiGender) {
        this.tiGender = tiGender == null ? null : tiGender.trim();
    }

    public String getTiPic() {
        return tiPic;
    }

    public void setTiPic(String tiPic) {
        this.tiPic = tiPic == null ? null : tiPic.trim();
    }

    public String getTiIdcardphoto() {
        return tiIdcardphoto;
    }

    public void setTiIdcardphoto(String tiIdcardphoto) {
        this.tiIdcardphoto = tiIdcardphoto == null ? null : tiIdcardphoto.trim();
    }

    public String getTiBfdesc() {
        return tiBfdesc;
    }

    public void setTiBfdesc(String tiBfdesc) {
        this.tiBfdesc = tiBfdesc == null ? null : tiBfdesc.trim();
    }

    public String getTiContact() {
        return tiContact;
    }

    public void setTiContact(String tiContact) {
        this.tiContact = tiContact == null ? null : tiContact.trim();
    }

    public String getTiComment() {
        return tiComment;
    }

    public void setTiComment(String tiComment) {
        this.tiComment = tiComment == null ? null : tiComment.trim();
    }

    public String getTiHistinfo() {
        return tiHistinfo;
    }

    public void setTiHistinfo(String tiHistinfo) {
        this.tiHistinfo = tiHistinfo == null ? null : tiHistinfo.trim();
    }
}