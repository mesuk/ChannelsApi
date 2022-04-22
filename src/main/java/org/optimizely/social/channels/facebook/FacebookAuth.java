package org.optimizely.social.channels.facebook;

import org.optimizely.social.Channel;

public class FacebookAuth {
    private String appId;
    private String appSecret;
    private String accessToken;

    public FacebookAuth(String appId, String appSecret) {
        this.appId = appId;
        this.appSecret = appSecret;
    }

    public FacebookAuth accessToken(String accessToken) {
        if (accessToken == null) {
            initFacebookAuthorization();
        } else {
            this.accessToken = accessToken;
        }
        return this;
    }

    public Channel getChannelWithAccessToken(String channelName) {
        // Load channel and assign action service
        Channel channel = new Channel(channelName);
        channel.setChannelsActionService(new FacebookAction(channel));
        return channel;
    }

    public void initFacebookAuthorization() {
        // call SDK for authorization and authentication using appId and appSecret
        // after getting token assign accessToken
    }
}
