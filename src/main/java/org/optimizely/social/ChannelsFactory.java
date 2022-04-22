package org.optimizely.social;

import org.optimizely.social.channels.facebook.FaceBookAuth;
import org.optimizely.social.channels.youtube.YoutubeAuth;
import org.optimizely.social.exceptions.ChannelNotImplementedException;
import org.optimizely.social.utils.ChannelConstants;

public class ChannelsFactory {
    public static Channel getChannel(String channelName) {
        switch (channelName) {
            case ChannelConstants.CHANNEL_FACEBOOK:

                FaceBookAuth auth = new FaceBookAuth(ChannelConstants.FB_APP_ID,
                        ChannelConstants.FB_APP_SECRET);
                return auth.accessToken(ChannelConstants.FB_ACCESS_TOKEN)
                        .getChannelWithAccessToken(channelName);

            case ChannelConstants.CHANNEL_TWITTER:
            case ChannelConstants.CHANNEL_OPTIMIZELY:
                return null;
            case ChannelConstants.CHANNEL_YOUTUBE:

                YoutubeAuth youtubeAuth = new YoutubeAuth(ChannelConstants.YOUTUBE_API_KEY, ChannelConstants.YOUTUBE_CLIENT_ID);
                return youtubeAuth.getChannelWithAccessToken(channelName,
                        ChannelConstants.YOUTUBE_ACCESS_TOKEN);
            default:
                throw new ChannelNotImplementedException("Channel : "+channelName+" not implemented YET. Please contact with vendor");
        }
    }
}
