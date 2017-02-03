package ca.ualberta.cs.lonelytwitter;

/**
 * Created by xhuang2 on 1/19/17.
 */

/**
 * This class is the tweetable class
 * throws the message to TweetTooLongException
 *
 * @author Xin Huang
 * @version  1.4.2
 * @since 1.0
 */

public interface Tweetable {
    public String getMessages();
    public void setMessage(String string) throws TweetTooLongException;
}
