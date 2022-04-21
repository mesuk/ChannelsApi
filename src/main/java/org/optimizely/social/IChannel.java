package org.optimizely.social;

import org.optimizely.social.request.ChannelRequest;
import org.optimizely.social.response.ChannelCreateResponse;

public interface IChannel {
    ChannelCreateResponse createChannel(ChannelRequest channelRequest);

}
