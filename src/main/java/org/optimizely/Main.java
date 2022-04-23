package org.optimizely;

import org.optimizely.social.Channel;
import org.optimizely.social.ChannelsFactory;
import org.optimizely.social.channels.facebook.FacebookPost;
import org.optimizely.social.channels.optimizely.OptimizelyFeed;
import org.optimizely.social.channels.youtube.YoutubeFeed;
import org.optimizely.social.exceptions.ChannelNotImplementedException;
import org.optimizely.social.utils.ChannelConstants;

import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nWelcome to optimizely Channel API!\n");
        testFaceBookFunctionalities();
        testYoutubeFunctionalities();
        testOptimizelyFunctionalities();
        testUnsupportedChannel(); // It will throw an exception : ChannelNotImplementedException:
    }

    private static void testFaceBookFunctionalities() {
        System.out.println("******* Facebook functionality test started ********");

        // Getting channel from factory
        Channel facebookChannel = ChannelsFactory.getChannel(ChannelConstants.CHANNEL_FACEBOOK);

        // Getting facebook post list
        printLog(facebookChannel.getChannelName(), "Fetching facebook post");
        List<FacebookPost> facebookPosts = facebookChannel.getChannelsActionService().facebookPostList();
        printLog(facebookChannel.getChannelName(), "Facebook post fetch done");
        printFeeds(facebookChannel.getChannelName(), facebookPosts);

        // Search facebook post
        printLog(facebookChannel.getChannelName(), "Searching resources on facebook");
        List<FacebookPost> fbSearchedPost = facebookChannel.getChannelsActionService().facebookSearch("keyword");
        printFeeds(facebookChannel.getChannelName(), fbSearchedPost);

        // Create facebook post
        printLog(facebookChannel.getChannelName(), "Creating post on facebook");
        FacebookPost facebookPost = facebookChannel.getChannelsActionService().createFacebookPost(buildFacebookPost());
        printLog(facebookChannel.getChannelName(), "Post creation done : " + facebookPost.toString());

        // Delete facebook post
        printLog(facebookChannel.getChannelName(), "Deleting post from facebook. Post Id :"+facebookPost.getId());
        boolean isPostDeleted = facebookChannel.getChannelsActionService().deletePost(facebookPost.getId());
        printLog(facebookChannel.getChannelName(), "Post deletion status :"+isPostDeleted);

        System.out.println("******* Facebook functionality test done ********");
        System.out.println();
    }

    private static void testYoutubeFunctionalities() {
        System.out.println("******* Youtube functionality test started ********");

        // Getting channel from factory
        Channel youtubeChannel = ChannelsFactory.getChannel(ChannelConstants.CHANNEL_YOUTUBE);

        if (youtubeChannel == null) {
            printLog(ChannelConstants.CHANNEL_FACEBOOK, "Channel not found");
            throw new ChannelNotImplementedException();
        }

        // Getting youtube feed list
        printLog(youtubeChannel.getChannelName(), "Fetching feeds");
        List<YoutubeFeed> facebookPosts = youtubeChannel.getChannelsActionService().youtubeFeedList();
        printFeeds(youtubeChannel.getChannelName(), facebookPosts);

        // Create Youtube post : Not supported API

        System.out.println("******* Youtube functionality test done ********");
        System.out.println();

    }

    private static void testOptimizelyFunctionalities() {
        System.out.println("******* Optimizely functionality test started ********");

        // Getting channel from factory
        Channel optimizelyChannel = ChannelsFactory.getChannel(ChannelConstants.CHANNEL_OPTIMIZELY);

        if (optimizelyChannel == null) {
            printLog(ChannelConstants.CHANNEL_OPTIMIZELY, "Channel not found");
            throw new ChannelNotImplementedException();
        }

        // Getting optimizely feed list
        printLog(optimizelyChannel.getChannelName(), "Fetching feeds");
        List<OptimizelyFeed> optimizelyFeeds = optimizelyChannel.getChannelsActionService().optimizelyFeedList();
        printFeeds(optimizelyChannel.getChannelName(), optimizelyFeeds);

        // Create optimizely post : Not supported API

        System.out.println("******* Optimizely functionality test done ********");
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

    private static FacebookPost buildFacebookPost() {
        FacebookPost facebookPost = new FacebookPost();
        facebookPost.setPostDetails("Details post here");
        facebookPost.setDateCreated(new Date());
        facebookPost.setDateLastUpdated(new Date());
        return facebookPost;
    }

    private static void printLog(String channelName, String message) {
        System.out.println(channelName + " : " + message);
    }

    static void printFeeds(String channelName, List<?> feeds){
        if (feeds != null && feeds.size() > 0) {
            printLog(channelName, "Feed found");
            StringBuilder sb = new StringBuilder();
            sb.append("Feed size :" + feeds.size() + " \n");
            sb.append("Feeds are :\n");
            feeds.forEach(facebookPost ->
                    sb.append(facebookPost.toString()).append(" \n")
            );
            printLog(channelName, sb.toString());
        }
    }
}