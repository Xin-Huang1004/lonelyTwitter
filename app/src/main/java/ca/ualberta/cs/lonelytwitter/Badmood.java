package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by xhuang2 on 1/19/17.
 */
/**
 * This class is the mood class
 * check if String mood is bad
 *
 * @author Xin Huang
 * @version  1.4.2
 * @since 1.0
 */

/**
 * get the mood and return mood
 */
public class Badmood extends Mood{
    public Badmood(Date date){
        super(date);
    }

    public Badmood(){
        super();
    }

    /**
     * return bad mood
     * @return bad
     */
    public String mood(){
        return "Bad";
    }
}
