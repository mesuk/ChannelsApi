package org.optimizely.social.channels.youtube;

import org.optimizely.social.Channel;

public class YoutubeAuth {
    private final String appId;
    private final String appSecret;
    private String accessToken;

    public YoutubeAuth(String appId, String appSecret) {
        this.appId = appId;
        this.appSecret = appSecret;
    }

    public Channel getChannelWithAccessToken(String channelName,String accessToken) {

        this.accessToken = accessToken;
        Channel channel = new Channel(channelName);

//        ServiceType type = ServiceType.Misskey;
//        Service service = new Service(type, account);
//        service.setApiHost(host);

//        channel.setChannelsActionService(new FacebookAction(channel, this));
        channel.setChannelsActionService(new YoutubeAction(channel));
//        account.setService(service);
        return channel;
    }
}
