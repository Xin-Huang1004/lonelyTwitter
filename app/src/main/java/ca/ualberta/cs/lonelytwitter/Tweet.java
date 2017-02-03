package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;



/**
 * This class is the main view class of the project. <br> In this class,
 * user interaction and file manipulation is performed.
 * All files are in the form of "json" files that are stored in Emulator's
 * accessible from Android Device Monitor:
 * <pre>
 *     pre-formatted text: <br>
 *         File Explorer -> data -> data -> ca.ualberta.cs.lonlytwitter -> files -> file.sav.
 * </pre>
 * <code> begin <br>
 *     some pseduo code here <br>
 * end.</code>
 * The file name is indicated in the &nbsp &nbsp &nbsp FILENAME constant.
 * <ul>
 *     <li>item 1</li>
 *     <li>item 2</li>
 *     <li>item 3</li>
 * </ul>
 * <ol>
 *     <li>item 1</li>
 *     <li>item 2</li>
 *     <li>item 3</li>
 * </ol>
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
