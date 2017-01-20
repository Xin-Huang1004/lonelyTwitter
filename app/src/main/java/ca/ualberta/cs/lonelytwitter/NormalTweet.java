package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by xhuang2 on 1/19/17.
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
