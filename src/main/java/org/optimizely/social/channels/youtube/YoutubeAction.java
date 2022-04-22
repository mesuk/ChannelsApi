package org.optimizely.social.channels.youtube;

import org.optimizely.social.AccountActionImpl;
import org.optimizely.social.Channel;

public class YoutubeAction extends AccountActionImpl {
    YoutubeAction(Channel channel) {
        this.setChannel(channel);
    }
}
