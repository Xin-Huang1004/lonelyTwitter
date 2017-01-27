package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by xhuang2 on 1/19/17.
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) throws TweetTooLongException {
        if(message.length() > 140){
            throw new TweetTooLongException();
        }
        this.message = message;
    }

    public abstract Boolean isImportant();

    @Override
    public String toString(){
        return date.toString() +  " | " + message;
    }

    public void addmood(Mood mood){
        MoodLIst.add(mood);
    }

}
