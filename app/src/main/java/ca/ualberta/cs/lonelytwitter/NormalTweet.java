package ca.ualberta.cs.lonelytwitter;

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
 * get the normalTweet and return
 */
public class NormalTweet extends Tweet {
    public NormalTweet(String message) {
        super(message);
    }

    public NormalTweet(Date date, String message) {
        super(date, message);
    }

    public Boolean isImportant(){
        return false;
    }
}
