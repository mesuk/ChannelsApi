package org.optimizely.social;

import org.optimizely.social.utils.ChannelsSDKActionService;

public class ChannelSDKActionImpl implements ChannelsSDKActionService {
    private Channel channel;

    public Channel getChannel() {
        return channel;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }
}
