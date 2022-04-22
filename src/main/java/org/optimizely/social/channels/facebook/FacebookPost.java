package org.optimizely.social.channels.facebook;

import java.util.Date;

public class FacebookPost {
    private int id;
    private String postDetails;
    private Date dateCreated;
    private Date dateLastUpdated;

    public FacebookPost() {
    }

    public FacebookPost(int id, String postDetails, Date dateCreated, Date dateLastUpdated) {
        this.id = id;
        this.postDetails = postDetails;
        this.dateCreated = dateCreated;
        this.dateLastUpdated = dateLastUpdated;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPostDetails() {
        return postDetails;
    }

    public void setPostDetails(String postDetails) {
        this.postDetails = postDetails;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getDateLastUpdated() {
        return dateLastUpdated;
    }

    public void setDateLastUpdated(Date dateLastUpdated) {
        this.dateLastUpdated = dateLastUpdated;
    }

    @Override
    public String toString() {
        return "FacebookPost{" +
                "id=" + id +
                ", postDetails='" + postDetails + '\'' +
                ", dateCreated=" + dateCreated +
                ", dateLastUpdated=" + dateLastUpdated +
                '}';
    }
}
