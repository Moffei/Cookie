package com.example.dsuappacademy.cookie;

import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Called when the cookie should be eaten.
     */
    public void eatCookie(View view) {

        // TODO: Find a reference to the ImageView in the layout. Change the image.
        displayPicture();

        // TODO: Find a reference to the TextView in the layout. Change the text.
        displayText();

    }

    public void displayPicture(){
        imageView = (ImageView) findViewById(R.id.android_cookie_image_view);
        imageView.setImageResource(R.drawable.after_cookie);
    }
    public void displayText(){
        textView = (TextView) findViewById(R.id.status_text_view);
        textView.setText("I'm full");
    }


    //Reset button code
    public void resetButton(View view) {
        imageView = (ImageView) findViewById(R.id.android_cookie_image_view);
        imageView.setImageResource(R.drawable.before_cookie);

        textView = (TextView) findViewById(R.id.status_text_view);
        textView.setText("I'm so hungry");
    }
}