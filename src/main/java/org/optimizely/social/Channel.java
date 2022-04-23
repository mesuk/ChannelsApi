package org.optimizely.social;

import org.optimizely.social.utils.ChannelsSDKActionService;

public class Channel {
    private String channelName;
    private ChannelsSDKActionService channelsSDKActionService;

    public Channel(String channelName) {
        this.channelName = channelName;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public ChannelsSDKActionService getChannelsActionService() {
        return channelsSDKActionService;
    }

    public void setChannelsActionService(ChannelsSDKActionService channelsSDKActionService) {
        this.channelsSDKActionService = channelsSDKActionService;
    }
}
