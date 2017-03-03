package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class EditTweetActivity extends Activity {
    private int position;
    private static final String FILENAME = "file.sav";
    private EditText bodyText;
    private ListView oldTweetsList;


    private ArrayList<Tweet>tweetList;
    private ArrayAdapter<Tweet> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        loadFromFile();

        Intent intent = getIntent();
        position = intent.getExtras().getInt("pos");

        setContentView(R.layout.activity_edit_tweet);
    }

    protected void onStart() {
        // TODO Auto-generated method stub
        super.onStart();

        String infoma = (tweetList.get(position)).toString();
        TextView myTextView = (TextView) findViewById(R.id.textView);
        myTextView.setText(infoma);
    }
    private void loadFromFile() {
        try {
            FileInputStream fis = openFileInput(FILENAME);
            BufferedReader in = new BufferedReader(new InputStreamReader(fis));

            Gson gson = new Gson();

            //tweetList = gson.fromJson(in, ArrayList<Tweet>);
            // Taken from https://stackoverflow.com/question/12384064/gson-convert-from-json-into java
            // 2017 01-26 17:53:59
            tweetList = gson.fromJson(in, new TypeToken<ArrayList<NormalTweet>>(){}.getType());

            fis.close();

        } catch (FileNotFoundException e) {
            tweetList = new ArrayList<Tweet>();
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }
}
