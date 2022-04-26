package org.tensorflow.demo;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends Activity {

    private TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        resultText = (TextView) findViewById(R.id.result_text);

        int rfout = getIntent().getIntExtra("rfOutput", -1);

        if (rfout == 0) {
            resultText.setText("After analysing the features extracted from audio sample, the person is not a patient of Parkinson Disease");
        }
        else if(rfout==1) {
            resultText.setText("After analysing the features extracted from audio sample, the person is a patient of Parkinson Disease");
        }
        else{
            resultText.setText("error!!");
        }
    }
}