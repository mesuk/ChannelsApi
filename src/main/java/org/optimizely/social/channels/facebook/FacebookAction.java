package org.optimizely.social.channels.facebook;

import org.optimizely.social.AccountActionImpl;
import org.optimizely.social.Channel;

public class FacebookAction extends AccountActionImpl {
    FacebookAction(Channel channel) {
        this.setChannel(channel);
    }
    /*FacebookAction(Channel channel, ServiceAuth<Twitter> auth) {
        this.account(account);
        this.auth(auth);
    }*/
}
