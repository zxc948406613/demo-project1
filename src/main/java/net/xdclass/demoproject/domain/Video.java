package net.xdclass.demoproject.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Video implements Serializable {

    private int id;

    private String title;

    private String summary;

    private int price;

    /**
     * 章集合
     */
    private List<Chapter> chapterList;

    private String coverImg;

    private Date createTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public List<Chapter> getChapterList() {
        return chapterList;
    }

    public void setChapterList(List<Chapter> chapterList) {
        this.chapterList = chapterList;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCoverImg() {
        return coverImg;
    }

    public void setCoverImg(String coverImg) {
        this.coverImg = coverImg;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Video() {
    }

    public Video(int id, String title) {
        this.id = id;
        this.title = title;
        this.createTime = new Date();
    }

    @Override
    public String toString() {
        return "Video{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", summary='" + summary + '\'' +
                ", price=" + price +
                ", chapterList=" + chapterList +
                ", coverImg='" + coverImg + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
