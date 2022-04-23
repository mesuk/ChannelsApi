package org.optimizely.social.channels.facebook;

import org.optimizely.social.ChannelSDKActionImpl;
import org.optimizely.social.Channel;

public class FacebookSDKAction extends ChannelSDKActionImpl {
    FacebookSDKAction(Channel channel) {
        this.setChannel(channel);
    }
}
