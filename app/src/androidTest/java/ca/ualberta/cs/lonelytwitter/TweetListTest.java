package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

import java.util.ArrayList;

/**
 * Created by xhuang2 on 2/16/17.
 */

public class TweetListTest extends ActivityInstrumentationTestCase2 {
    public TweetListTest() {
        super(LonelyTwitterActivity.class);

    }


    public void testAddTweet(){
        TweetList tweets = new TweetList();
        NormalTweet tweet = new NormalTweet("some tweet");
        tweets.add(tweet);
        assertTrue(tweets.hasTweet(tweet));
    }

    public void testHasTweet(){
        TweetList tweets = new TweetList();
        NormalTweet tweet = new NormalTweet("some tweet");
        assertFalse(tweets.hasTweet(tweet));
        tweets.add(tweet);
        assertTrue(tweets.hasTweet(tweet));
    }

    public void testGetTweet(){
        TweetList tweets = new TweetList();
        NormalTweet tweet = new NormalTweet("some tweet");

        tweets.add(tweet);
        NormalTweet returnedTweet = tweets.getTweet(0);
        assertEquals(returnedTweet.getMessage(), tweet.getMessage());
        assertEquals(returnedTweet.getDate(), tweet.getDate());
    }

    public void testDeleteTweet(){
        TweetList tweets = new TweetList();
        NormalTweet tweet = new NormalTweet("some tweet");
        tweets.add(tweet);
        tweets.delete(tweet);
        assertFalse(tweets.hasTweet(tweet));
    }

    public void testgetCount() {
        TweetList tweets = new TweetList();
        NormalTweet tweet = new NormalTweet("some tweet");
        tweets.add(tweet);
        assertEquals(tweets.tweetSize(), 1);
    }

//    public void testhasTweet(){
//        TweetList tweets = new TweetList();
//        NormalTweet tweet1 = new NormalTweet("some tweet");
//        tweets.add(tweet1);
//        NormalTweet tweet2 = new NormalTweet("some tweet");
//        tweets.add(tweet2);
//        assertTrue(tweets.getTweet(0) == tweets.getTweet(1));
//    }

    public void testAddTweetLab(){
        TweetList tweets = new TweetList();
        NormalTweet tweet = new NormalTweet("some tweet");
        tweets.add(tweet);
        try{
            tweets.add(tweet);
            assertTrue(false);
        }catch (IllegalArgumentException e){
            assertTrue(true);
        }
    }

    public void testGetTweetLab(){

        TweetList tweets = new TweetList();
        NormalTweet tweet1 = new NormalTweet("some tweet");
        NormalTweet tweet2 = new NormalTweet("some tweet2");
        tweets.add(tweet1);
        tweets.add(tweet2);

        ArrayList<NormalTweet> list = tweets.getTweets();

        assertEquals(tweet1, list.get(0));
        assertEquals(tweet2, list.get(1));

    }
}
