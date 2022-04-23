package org.optimizely.social.channels.youtube;

import org.optimizely.social.Channel;

public class YoutubeAuth {
    private final String apiKey;
    private final String clientId;
    private String accessToken;

    public YoutubeAuth(String apiKey, String clientId) {
        this.apiKey = apiKey;
        this.clientId = clientId;
    }

    public Channel getChannelWithAccessToken(String channelName,String accessToken) {

        this.accessToken = accessToken;
        Channel channel = new Channel(channelName);

//        ServiceType type = ServiceType.Misskey;
//        Service service = new Service(type, account);
//        service.setApiHost(host);

//        channel.setChannelsActionService(new FacebookAction(channel, this));
        channel.setChannelsActionService(new YoutubeSDKAction(channel));
//        account.setService(service);
        return channel;
    }
}
