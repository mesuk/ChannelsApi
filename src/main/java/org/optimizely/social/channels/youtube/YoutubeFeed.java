package org.optimizely.social.channels.youtube;

import java.util.Date;

public class YoutubeFeed {
    private int id;
    private String title;
    private String videoUrl;
    private Date dateCreated;
    private Date dateLastUpdated;

    public YoutubeFeed() {
    }

    public YoutubeFeed(int id, String title, String videoUrl, Date dateCreated, Date dateLastUpdated) {
        this.id = id;
        this.title = title;
        this.videoUrl = videoUrl;
        this.dateCreated = dateCreated;
        this.dateLastUpdated = dateLastUpdated;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "YoutubeFeed{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", videoUrl='" + videoUrl + '\'' +
                ", dateCreated=" + dateCreated +
                ", dateLastUpdated=" + dateLastUpdated +
                '}';
    }
}
