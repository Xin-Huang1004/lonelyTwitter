package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by xhuang2 on 1/19/17.
 */

public class Goodmood extends Mood{
    public Goodmood(Date date){
        super(date);
    }

    public Goodmood() {
        super();
    }
    public String mood(){
        return "Good";
    }
}
