package ca.ualberta.cs.lonelytwitter;

import java.util.Date;


/**
 * This class is the tweet checker class
 * check if the tweet is a normal tweet
 *
 * @author Xin Huang
 * @version  1.4.2
 * @since 1.0
 */
/**
 * Created by xhuang2 on 1/19/17.
 */

/**
 * get the normalTweet and return
 */
public class NormalTweet extends Tweet {
    public NormalTweet(String message) {
        super(message);
    }

    public NormalTweet(Date date, String message) {
        super(date, message);
    }

    public Boolean isImportant(){
        return false;
    }
}
