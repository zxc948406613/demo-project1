package net.xdclass.demoproject.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class User implements Serializable {
    private int id;

    private String name;

//    @JsonIgnore
    private String pwd;

    private String headImg;

    private String phone;

    private Date createTime;

    private List<VideoOrder> videoOrderList;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getHeadImg() {
        return headImg;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setHeadImg(String headImg) {
        this.headImg = headImg;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<VideoOrder> getVideoOrderList() {
        return videoOrderList;
    }

    public void setVideoOrderList(List<VideoOrder> videoOrderList) {
        this.videoOrderList = videoOrderList;
    }

    public User() {
    }

    public User(int id, String name, String pwd) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
    }

    public User(int id, String name, String pwd, String headImg, String phone, List<VideoOrder> videoOrderList) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
        this.headImg = headImg;
        this.phone = phone;
        this.videoOrderList = videoOrderList;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", headImg='" + headImg + '\'' +
                ", phone='" + phone + '\'' +
                ", videoOrderList=" + videoOrderList +
                '}';
    }
}
