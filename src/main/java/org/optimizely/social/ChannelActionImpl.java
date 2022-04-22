package org.optimizely.social;

import org.optimizely.social.utils.ChannelsActionService;

public class ChannelActionImpl implements ChannelsActionService {
    private Channel channel;

    public Channel getChannel() {
        return channel;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }
}
