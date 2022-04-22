package org.optimizely;

import org.optimizely.social.Channel;
import org.optimizely.social.ChannelsFactory;
import org.optimizely.social.channels.facebook.FacebookPost;
import org.optimizely.social.exceptions.ChannelNotImplementedException;
import org.optimizely.social.utils.ChannelConstants;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nWelcome to optimizely Channel API!\n");
        testFaceBookFunctionalities();
    }

    private static void testFaceBookFunctionalities() {
        System.out.println("******* Facebook functionality test started ********");

        Channel channel = ChannelsFactory.getChannel(ChannelConstants.CHANNEL_FACEBOOK);

        if (channel == null) {
            printLog(ChannelConstants.CHANNEL_FACEBOOK, "Channel not found");
            throw new ChannelNotImplementedException();
        }

        List<FacebookPost> facebookPosts = channel.getChannelsActionService().list();
        if (facebookPosts != null && facebookPosts.size() > 0) {
            printLog(channel.getChannelName(), "Post found");
            StringBuilder sb = new StringBuilder();
            sb.append("Post size :" + facebookPosts.size() + " \n");
            sb.append("Post are :\n");
            facebookPosts.forEach(facebookPost ->
                    sb.append(facebookPost.toString()).append(" \n")
            );
            printLog(channel.getChannelName(), sb.toString());
        }
        FacebookPost facebookPost = channel.getChannelsActionService().createPost(buildFacebookPost());
        printLog(channel.getChannelName(), "Post creation done : " + facebookPost.toString());
        System.out.println("******* Facebook functionality test done ********");
        System.out.println();
    }

    private static void testYoutubeFunctionalities() {
        Channel channel = ChannelsFactory.getChannel(ChannelConstants.CHANNEL_YOUTUBE);

        if (channel == null) {
            throw new ChannelNotImplementedException();
        }

        List<FacebookPost> posts = channel.getChannelsActionService().list();
        if (posts != null && posts.size() > 0) {
            posts.forEach(facebookPost ->
                    System.out.println(facebookPost.toString())
            );
        }

    }

    private static FacebookPost buildFacebookPost() {
        FacebookPost facebookPost = new FacebookPost();
        facebookPost.setPostDetails("Details post here");
        return facebookPost;
    }

    private static void printLog(String channelName, String message) {
        System.out.println(channelName + " : " + message);
    }
}