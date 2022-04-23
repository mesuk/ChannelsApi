package org.optimizely.social.channels.optimizely;

import java.util.Date;

public class OptimizelyFeed {
    private int id;
    private String title;
    private String videoUrl;
    private Date dateCreated;
    private Date dateLastUpdated;

    public OptimizelyFeed() {
    }

    public OptimizelyFeed(int id, String title, String videoUrl, Date dateCreated, Date dateLastUpdated) {
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
        return "OptimizelyFeed{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", videoUrl='" + videoUrl + '\'' +
                ", dateCreated=" + dateCreated +
                ", dateLastUpdated=" + dateLastUpdated +
                '}';
    }
}
