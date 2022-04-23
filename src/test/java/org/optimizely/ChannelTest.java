package org.optimizely;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.optimizely.social.Channel;
import org.optimizely.social.ChannelsFactory;
import org.optimizely.social.channels.facebook.FacebookPost;
import org.optimizely.social.exceptions.ChannelNotImplementedException;
import org.optimizely.social.utils.ChannelConstants;

import java.util.Date;
import java.util.List;

import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ChannelTest {
    private static ChannelsFactory channelsFactory;

    @BeforeAll
    public static void before() {
        channelsFactory = new ChannelsFactory();
    }

    @Test
    public void get_channel_by_channel_name_success() {
        Channel facebookChannel = ChannelsFactory.getChannel(ChannelConstants.CHANNEL_FACEBOOK);
        assertThat(facebookChannel.getChannelName()).isEqualTo(ChannelConstants.CHANNEL_FACEBOOK);
    }

    @Test()
    public void get_channel_by_channel_name_exception() {
        Exception exception = assertThrows(ChannelNotImplementedException.class, () -> {
            ChannelsFactory.getChannel(ChannelConstants.CHANNEL_TWITTER);
        });

        String expectedMessage = "not implemented YET";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));

    }

    @Test()
    public void fetch_facebook_feeds_success() {
        Channel facebookChannel = ChannelsFactory.getChannel(ChannelConstants.CHANNEL_FACEBOOK);
        List<FacebookPost> posts = facebookChannel.getChannelsActionService().facebookPostList();

        assertThat(posts.size()).isNotEqualTo(0);
    }

    @Test()
    public void search_facebook_feeds_success() {
        Channel facebookChannel = ChannelsFactory.getChannel(ChannelConstants.CHANNEL_FACEBOOK);
        List<FacebookPost> posts = facebookChannel.getChannelsActionService().facebookSearch("keyword");

        assertThat(posts.size()).isNotEqualTo(0);
    }

    @Test()
    public void create_facebook_post_success() {
        FacebookPost facebookPost = buildFacebookPost();
        Channel facebookChannel = ChannelsFactory.getChannel(ChannelConstants.CHANNEL_FACEBOOK);
        facebookPost = facebookChannel.getChannelsActionService()
                .createFacebookPost(facebookPost);

        assertThat(facebookPost.getId()).isNotEqualTo(0);
    }
    @Test()
    public void delete_facebook_post_success() {
        Channel facebookChannel = ChannelsFactory.getChannel(ChannelConstants.CHANNEL_FACEBOOK);
        boolean isDeleteSuccess = facebookChannel.getChannelsActionService()
                .deletePost(1);

        assertThat(isDeleteSuccess).isEqualTo(Boolean.TRUE);
    }

    private FacebookPost buildFacebookPost() {
        FacebookPost facebookPost = new FacebookPost();
        facebookPost.setPostDetails("Details post here");
        facebookPost.setDateCreated(new Date());
        facebookPost.setDateLastUpdated(new Date());
        return facebookPost;
    }

}
