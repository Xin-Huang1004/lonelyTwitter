package ca.ualberta.cs.lonelytwitter;
import java.util.Date;
/**
 * Created by xhuang2 on 1/19/17.
 */

public class ImportantTweet extends Tweet {
    public ImportantTweet(String message) {
        super(message);
    }

    public ImportantTweet(Date date, String message){
        super(date, message);
    }

    public Boolean isImportant(){
        return true;
    }
}
