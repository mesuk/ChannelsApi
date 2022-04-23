package org.optimizely.social.channels.optimizely;

import org.optimizely.social.Channel;
import org.optimizely.social.ChannelSDKActionImpl;

public class OptimizelySDKAction extends ChannelSDKActionImpl {
    OptimizelySDKAction(Channel channel) {
        this.setChannel(channel);
    }
}
