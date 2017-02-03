package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by xhuang2 on 1/19/17.
 */
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
 * get the mood and return mood
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
