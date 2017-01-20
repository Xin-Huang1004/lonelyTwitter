package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by xhuang2 on 1/19/17.
 */

public class Badmood extends Mood{
    public Badmood(Date date){
        super(date);
    }

    public Badmood(){
        super();
    }
    public String mood(){
        return "Bad";
    }
}
