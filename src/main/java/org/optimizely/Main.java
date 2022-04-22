package org.optimizely;

import org.optimizely.social.Channel;
import org.optimizely.social.ChannelsFactory;
import org.optimizely.social.channels.facebook.FacebookPost;
import org.optimizely.social.channels.youtube.YoutubeFeed;
import org.optimizely.social.exceptions.ChannelNotImplementedException;
import org.optimizely.social.utils.ChannelConstants;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nWelcome to optimizely Channel API!\n");
        testFaceBookFunctionalities();
        testYoutubeFunctionalities();
        testUnsupportedChannel(); // It will throw an exception : ChannelNotImplementedException:
    }

    private static void testFaceBookFunctionalities() {
        System.out.println("******* Facebook functionality test started ********");

        // Getting channel from factory
        Channel channel = ChannelsFactory.getChannel(ChannelConstants.CHANNEL_FACEBOOK);

        if (channel == null) {
            printLog(ChannelConstants.CHANNEL_FACEBOOK, "Channel not found");
            throw new ChannelNotImplementedException();
        }

        // Getting facebook post list
        List<FacebookPost> facebookPosts = channel.getChannelsActionService().facebookPostList();
        printFaceBookPost(channel.getChannelName(), facebookPosts);

        // Create facebook post
        FacebookPost facebookPost = channel.getChannelsActionService().createFacebookPost(buildFacebookPost());
        printLog(channel.getChannelName(), "Post creation done : " + facebookPost.toString());

        System.out.println("******* Facebook functionality test done ********");
        System.out.println();
    }

    private static void testYoutubeFunctionalities() {
        System.out.println("******* Youtube functionality test started ********");

        // Getting channel from factory
        Channel channel = ChannelsFactory.getChannel(ChannelConstants.CHANNEL_YOUTUBE);

        if (channel == null) {
            printLog(ChannelConstants.CHANNEL_FACEBOOK, "Channel not found");
            throw new ChannelNotImplementedException();
        }

        // Getting youtube feed list
        List<YoutubeFeed> facebookPosts = channel.getChannelsActionService().youtubeFeedList();
        printYoutubeFeed(channel.getChannelName(), facebookPosts);

        // Create facebook post : Not supported API

        System.out.println("******* Youtube functionality test done ********");
        System.out.println();

    }

    private static void testUnsupportedChannel(){
        System.out.println("******* Unsupported channel functionality test started ********");
        String channelName = "";
        // Getting channel from factory
        Channel channel = ChannelsFactory.getChannel(channelName);

        if (channel == null) {
            printLog(channelName, "Channel not found");
            throw new ChannelNotImplementedException();
        }

        System.out.println("******* Unsupported channel test done ********");
        System.out.println();
    }

    static void printFaceBookPost(String channelName, List<FacebookPost> facebookPosts){
        if (facebookPosts != null && facebookPosts.size() > 0) {
            printLog(channelName, "Post found");
            StringBuilder sb = new StringBuilder();
            sb.append("Post size :" + facebookPosts.size() + " \n");
            sb.append("Post are :\n");
            facebookPosts.forEach(facebookPost ->
                    sb.append(facebookPost.toString()).append(" \n")
            );
            printLog(channelName, sb.toString());
        }
    }

    static void printYoutubeFeed(String channelName, List<YoutubeFeed> youtubeFeeds){
        if (youtubeFeeds != null && youtubeFeeds.size() > 0) {
            printLog(channelName, "Feed found");
            StringBuilder sb = new StringBuilder();
            sb.append("Feed size :" + youtubeFeeds.size() + " \n");
            sb.append("Feeds are :\n");
            youtubeFeeds.forEach(facebookPost ->
                    sb.append(facebookPost.toString()).append(" \n")
            );
            printLog(channelName, sb.toString());
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