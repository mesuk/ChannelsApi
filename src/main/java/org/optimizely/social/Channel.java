package org.optimizely.social;

import org.optimizely.social.utils.ChannelsActionService;

public class Channel {
    private String channelName;
    private ChannelsActionService channelsActionService;

    public Channel(String channelName) {
        this.channelName = channelName;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public ChannelsActionService getChannelsActionService() {
        return channelsActionService;
    }

    public void setChannelsActionService(ChannelsActionService channelsActionService) {
        this.channelsActionService = channelsActionService;
    }
}
