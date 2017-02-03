package ca.ualberta.cs.lonelytwitter;

import java.util.Date;


/**
 * This class is the mood class
 * return the user's mood
 * @author Xin Huang
 * @version  1.4.2
 * @since 1.0
 */
/**
 * Created by xhuang2 on 1/19/17.
 */


public abstract class Mood {
    private Date date;

    /**
     * get the date
     */
    public Mood(){
        this.date = new Date();
    }

    public Mood(Date date) {
        this.date = date;

    }

    /**
     * return the date
     * @return date
     */
    public Date getDate() {
        return date;
    }

    /**
     * set the date
     * @param date
     */

    public void setDate(Date date) {
        this.date = date;
    }

    public abstract String mood();
}
