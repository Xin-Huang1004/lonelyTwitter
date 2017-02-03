package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by xhuang2 on 1/19/17.
 */
/**
 * This class is the mood class
 * check if the String mood is good
 *
 * @author Xin Huang
 * @version  1.4.2
 * @since 1.0
 */

/**
 * get the mood and return mood
 */

public class Goodmood extends Mood{
    public Goodmood(Date date){
        super(date);
    }

    public Goodmood() {
        super();
    }

    /**
     * return the good mood
     * @return good
     */
    public String mood(){
        return "Good";
    }
}
