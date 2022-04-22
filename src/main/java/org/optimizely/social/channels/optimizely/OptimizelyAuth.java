package org.optimizely.social.channels.optimizely;

import org.optimizely.social.Channel;

public class OptimizelyAuth {
    private String userName;
    private String credential;
    private String accessToken;

    public OptimizelyAuth(String userName, String credential) {
        this.userName = userName;
        this.credential = credential;
    }

    public OptimizelyAuth accessToken(String accessToken) {
        if (accessToken == null) {
            initLoginAndGetAccessToken();
        } else {
            this.accessToken = accessToken;
        }
        return this;
    }

    public Channel getChannelWithAccessToken(String channelName) {
        // Load channel and assign action service
        Channel channel = new Channel(channelName);
        channel.setChannelsActionService(new OptimizelyAction(channel));
        return channel;
    }

    public void initLoginAndGetAccessToken() {
        // call SDK for authorization and authentication using appId and appSecret
        // after getting token assign accessToken
    }
}
