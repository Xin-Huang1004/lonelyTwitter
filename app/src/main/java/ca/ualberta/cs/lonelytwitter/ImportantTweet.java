package ca.ualberta.cs.lonelytwitter;
import java.util.Date;


/**
 * This class is the tweet checker class
 * check if the tweet is important
 *
 * @author Xin Huang
 * @version  1.4.2
 * @since 1.0
 */
/**
 * Created by xhuang2 on 1/19/17.
 */
/**
 * get important tweet and return it
 */
public class ImportantTweet extends Tweet {
    public ImportantTweet(String message) {
        super(message);
    }

    public ImportantTweet(Date date, String message){
        super(date, message);
    }

    /**
     * return this is an important tweet
     * @return true
     */
    public Boolean isImportant(){
        return true;
    }
}
