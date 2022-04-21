package org.optimizely.social.request;

public class ChannelRequest {
    private String channelName;
    private String channelBaseUrl;
    private String logoUrl;
    private String clientId;
    private String token;
    private ChannelPermissions channelPermissions;

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public String getChannelBaseUrl() {
        return channelBaseUrl;
    }

    public void setChannelBaseUrl(String channelBaseUrl) {
        this.channelBaseUrl = channelBaseUrl;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public ChannelPermissions getChannelPermissions() {
        return channelPermissions;
    }

    public void setChannelPermissions(ChannelPermissions channelPermissions) {
        this.channelPermissions = channelPermissions;
    }
}
