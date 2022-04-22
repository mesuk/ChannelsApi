package org.optimizely.social.channels.facebook;

import org.optimizely.social.ChannelActionImpl;
import org.optimizely.social.Channel;

public class FacebookAction extends ChannelActionImpl {
    FacebookAction(Channel channel) {
        this.setChannel(channel);
    }
}
