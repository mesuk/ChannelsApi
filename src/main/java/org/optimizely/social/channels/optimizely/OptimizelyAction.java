package org.optimizely.social.channels.optimizely;

import org.optimizely.social.Channel;
import org.optimizely.social.ChannelActionImpl;

public class OptimizelyAction extends ChannelActionImpl {
    OptimizelyAction(Channel channel) {
        this.setChannel(channel);
    }
}
