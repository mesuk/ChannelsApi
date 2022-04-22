package org.optimizely.social.utils;

import org.optimizely.social.channels.facebook.FacebookPost;
import org.optimizely.social.exceptions.FeatureNotImplementedException;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public interface ChannelsActionService {

    default List<FacebookPost> list() {
        List<FacebookPost> posts = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            posts.add(new FacebookPost(i + 1, "some post", new Date(), new Date()));
        }
        return posts;
//        throw new FeatureNotImplementedException();
    }

    default FacebookPost createPost(FacebookPost facebookPost) {
        facebookPost.setId(new Random().nextInt());
        facebookPost.setDateCreated(new Date());
        facebookPost.setDateLastUpdated(new Date());
        return facebookPost;
//        throw new FeatureNotImplementedException();
    }
}
