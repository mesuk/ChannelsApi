package org.optimizely.social.utils;

import org.optimizely.social.channels.facebook.FacebookPost;
import org.optimizely.social.channels.optimizely.OptimizelyFeed;
import org.optimizely.social.channels.youtube.YoutubeFeed;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public interface ChannelsSDKActionService {

    default List<FacebookPost> facebookPostList() {
        // In this layer, we will call to SDK or Destination Server.
        // For testing purpose, I added some dummy data
        List<FacebookPost> facebookPosts = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            facebookPosts.add(new FacebookPost(i + 1, "Autogenerated post", new Date(), new Date()));
        }
        return facebookPosts;
//        throw new FeatureNotImplementedException();
    }

    default List<FacebookPost> facebookSearch(String keyword) {
        // In this layer, we will call to SDK or Destination Server.
        // For testing purpose, I added some dummy data
        List<FacebookPost> facebookPosts = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            facebookPosts.add(new FacebookPost(i + 1, "Autogenerated post", new Date(), new Date()));
        }
        return facebookPosts;
//        throw new FeatureNotImplementedException();
    }
    default boolean deletePost(Integer id) {
        // In this layer, we will call to SDK or Destination Server.
        // For testing purpose, I added some dummy data

        return true;
//        throw new FeatureNotImplementedException();
    }

    default FacebookPost createFacebookPost(FacebookPost facebookPost) {
        // In this layer, we will call to SDK or Destination Server.
        // For testing purpose, I added some dummy data
        facebookPost.setId(new Random().nextInt());
        facebookPost.setDateCreated(new Date());
        facebookPost.setDateLastUpdated(new Date());
        return facebookPost;
//        throw new FeatureNotImplementedException();
    }

    default List<YoutubeFeed> youtubeFeedList() {
        // In this layer, we will call to SDK or Destination Server.
        // For testing purpose, I added some dummy data
        List<YoutubeFeed> youtubeFeeds = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            youtubeFeeds.add(new YoutubeFeed(i + 1, "https://youtu.be/LGCvRk7judU","Autogenerated Youtube feed title", new Date(), new Date()));
        }
        return youtubeFeeds;
//        throw new FeatureNotImplementedException();
    }

    default List<OptimizelyFeed> optimizelyFeedList() {
        // In this layer, we will call to SDK or Destination Server.
        // For testing purpose, I added some dummy data
        List<OptimizelyFeed> optimizelyFeeds = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            optimizelyFeeds.add(new OptimizelyFeed(i + 1, "https://youtu.be/LGCvRk7judU","Autogenerated Youtube feed title", new Date(), new Date()));
        }
        return optimizelyFeeds;
//        throw new FeatureNotImplementedException();
    }
}
