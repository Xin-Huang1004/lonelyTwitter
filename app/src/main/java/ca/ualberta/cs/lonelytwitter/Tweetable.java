package ca.ualberta.cs.lonelytwitter;

/**
 * Created by xhuang2 on 1/19/17.
 */

public interface Tweetable {
    public String getMessages();
    public void setMessage(String string) throws TweetTooLongException;


}
