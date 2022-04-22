package org.optimizely.social.channels.facebook;

import org.optimizely.social.Channel;

public class FaceBookAuth {
    String appId;
    String appSecret;
    String accessToken;

    public FaceBookAuth(String appId, String appSecret) {
        this.appId = appId;
        this.appSecret = appSecret;
    }

    public Channel getChannelWithAccessToken(String channelName, String accessToken) {
        this.accessToken = accessToken;
        Channel channel = new Channel(channelName);
        channel.setChannelsActionService(new FacebookAction(channel));
        return channel;
    }
}
