package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    Button topButton;
    Button bottomButton;
    TextView plot;
    int mStoryIndex = 1;
    int mCurrentStory = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        topButton = (Button) findViewById(R.id.buttonTop);
        bottomButton = (Button) findViewById(R.id.buttonBottom);
        plot = (TextView) findViewById(R.id.storyTextView);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        topButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateStory('t');
                mStoryIndex++;
            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        bottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateStory('b');
                mStoryIndex++;
            }
        });

    }

    void updateStory(char button) {
        Log.d("Destiny", "stage : " + mStoryIndex + " current story: " + mCurrentStory);
        if (button == 't') {
            if (mStoryIndex == 1 && mCurrentStory == 1) {
                plot.setText(R.string.T3_Story);
                topButton.setText(R.string.T3_Ans1);
                bottomButton.setText(R.string.T3_Ans2);
                mCurrentStory = 3;
            }
            if (mStoryIndex == 2 && mCurrentStory == 3) {
                plot.setText(R.string.T6_End);
                topButton.setVisibility(View.GONE);
                bottomButton.setVisibility(View.GONE);
            }
            if (mStoryIndex == 2 && mCurrentStory == 2) {
                plot.setText(R.string.T3_Story);
                topButton.setText(R.string.T3_Ans1);
                bottomButton.setText(R.string.T3_Ans2);
                mCurrentStory = 3;
            }
            if (mStoryIndex == 3 && mCurrentStory == 3) {
                plot.setText(R.string.T6_End);
                topButton.setVisibility(View.GONE);
                bottomButton.setVisibility(View.GONE);
            }
        } else {
            if (mStoryIndex == 2 && mCurrentStory == 3) {
                plot.setText(R.string.T5_End);
                topButton.setVisibility(View.GONE);
                bottomButton.setVisibility(View.GONE);
            }
            if (mStoryIndex == 1 && mCurrentStory == 1) {
                plot.setText(R.string.T2_Story);
                topButton.setText(R.string.T2_Ans1);
                bottomButton.setText(R.string.T2_Ans2);
                mCurrentStory = 2;
            }
            if (mStoryIndex == 2 && mCurrentStory == 2) {
                plot.setText(R.string.T4_End);
                topButton.setVisibility(View.GONE);
                bottomButton.setVisibility(View.GONE);
            }
            if (mStoryIndex == 3 && mCurrentStory == 3) {
                plot.setText(R.string.T5_End);
                topButton.setVisibility(View.GONE);
                bottomButton.setVisibility(View.GONE);
            }

        }
    }
}
