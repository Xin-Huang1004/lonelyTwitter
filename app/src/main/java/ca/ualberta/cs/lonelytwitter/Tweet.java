package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;



/**
 * This class is the tweet class
 * return the user's input
 *
 * @author Xin Huang
 * @version  1.4.2
 * @since 1.0
 */

/**
 * Created by xhuang2 on 1/19/17.
 */

/**
 * get the user input and return
 */
public abstract class Tweet {

    private Date date;
    private String message;

    public ArrayList<Mood> getMoodLIst() {
        return MoodLIst;
    }

    private ArrayList<Mood> MoodLIst;

    public Tweet(String message){
        this.message = message;
        this.date = new Date();
        MoodLIst = new ArrayList<Mood>();
    }

    public Tweet(Date date, String message) {
        this.message = message;
        this.date = date;

    }
    /**
    * Return the date
    * @return date
    */
    public Date getDate() {
        return date;
    }

    /**
     * Return the date
     * @param date
     * @return date
     */

    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Return the message
     * @return message
     */

    public String getMessage() {
        return message;
    }

    /**
     * Return the message
     * @param message
     * @throws TweetTooLongException
     */
    public void setMessage(String message) throws TweetTooLongException {
        if(message.length() > 140){
            throw new TweetTooLongException();
        }
        this.message = message;
    }

    public abstract Boolean isImportant();

    /**
     * change the format
     * @return the output format
     */
    @Override
    public String toString(){
        return date.toString() +  " | " + message;
    }

    public void addmood(Mood mood){
        MoodLIst.add(mood);
    }

}
