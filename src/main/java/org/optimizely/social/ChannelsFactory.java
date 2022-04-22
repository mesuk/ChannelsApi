package org.optimizely.social;

import org.optimizely.social.channels.facebook.FacebookAuth;
import org.optimizely.social.channels.optimizely.OptimizelyAuth;
import org.optimizely.social.channels.youtube.YoutubeAuth;
import org.optimizely.social.exceptions.ChannelNotImplementedException;
import org.optimizely.social.utils.ChannelConstants;

public class ChannelsFactory {
    public static Channel getChannel(String channelName) {
        switch (channelName) {
            case ChannelConstants.CHANNEL_FACEBOOK:
                FacebookAuth faceBookAuth = new FacebookAuth(ChannelConstants.FB_APP_ID,
                        ChannelConstants.FB_APP_SECRET);
                return faceBookAuth.accessToken(ChannelConstants.FB_ACCESS_TOKEN)
                        .getChannelWithAccessToken(channelName);
            case ChannelConstants.CHANNEL_OPTIMIZELY:

                OptimizelyAuth optimizelyAuth = new OptimizelyAuth(ChannelConstants.OPTIMIZELY_USER_NAME,
                        ChannelConstants.OPTIMIZELY_CREDENTIAL);
                return optimizelyAuth.accessToken(ChannelConstants.OPTIMIZELY_ACCESS_TOKEN)
                        .getChannelWithAccessToken(channelName);

            case ChannelConstants.CHANNEL_YOUTUBE:
                YoutubeAuth youtubeAuth = new YoutubeAuth(ChannelConstants.YOUTUBE_API_KEY, ChannelConstants.YOUTUBE_CLIENT_ID);
                return youtubeAuth.getChannelWithAccessToken(channelName,
                        ChannelConstants.YOUTUBE_ACCESS_TOKEN);
            default:
                throw new ChannelNotImplementedException("Channel : "+channelName+" not implemented YET. Please contact with vendor");
        }
    }
}
