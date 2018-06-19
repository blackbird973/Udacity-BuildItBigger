package yohan.builditbigger.com.jokesandroidlibrary;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Yohan on 17/06/2018.
 */

public class DisplayJokeFromIntent extends AppCompatActivity {

    TextView tv_joke;

    public static final String JOKE_ID = "joke";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.displayjoke);


        tv_joke=(TextView) findViewById(R.id.jokelabel);
        String jokestring = getIntent().getStringExtra(JOKE_ID);



        if (jokestring != null) {
            tv_joke.setText(jokestring);
        } else {
            tv_joke.setText("error");
        }

    }

}