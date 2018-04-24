package com.example.android.newquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    boolean question1ChoiceThreeAnswer = false;
    boolean question4ChoiceOneAnswer = false;
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void question1Answer(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.question1_choice3:
                if (checked)
                    Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show();
                    question1ChoiceThreeAnswer = true;
                    score ++;
                break;
            case R.id.question1_choice2:
                if (checked)
                    Toast.makeText(this, "Wrong", Toast.LENGTH_SHORT).show();
                    question1ChoiceThreeAnswer = false;
                break;
            case R.id.question1_choice1:
                if (checked)
                    Toast.makeText(this, "Wrong!", Toast.LENGTH_SHORT).show();
                    question1ChoiceThreeAnswer = false;
        }
    }

    public void question2Answers(View view){

        boolean checked = ((CheckBox) view).isChecked();

        CheckBox b1 = (CheckBox) findViewById(R.id.question2_choice1);
        CheckBox b2 = (CheckBox) findViewById(R.id.question2_choice2);
        CheckBox b3 = (CheckBox) findViewById(R.id.question2_choice3);

        if (b1.isChecked() && b2.isChecked() && !b3.isChecked()){
            Toast.makeText(this, "Correct!", Toast.LENGTH_LONG).show();
            score ++;
        } else{
            Toast.makeText(this, "Wrong", Toast.LENGTH_SHORT).show();
        }

    }

    public void question3Answers(View view){

        String q3Ans = "golden";

        EditText t1 = (EditText) findViewById(R.id.question3_text);

        if (t1.getText().toString().equalsIgnoreCase(q3Ans)){
            Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show();
            score ++;
        } else {
            Toast.makeText(this, "Wrong", Toast.LENGTH_SHORT).show();
        }

    }

    public void question4Answer(View view){

        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.question4_choice1:
                if (checked)
                    Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show();
                question4ChoiceOneAnswer = true;
                score ++;
                break;
            case R.id.question4_choice2:
                if (checked)
                    Toast.makeText(this, "Wrong", Toast.LENGTH_SHORT).show();
                question4ChoiceOneAnswer = false;
                break;
            case R.id.question1_choice1:
                if (checked)
                    Toast.makeText(this, "Wrong!", Toast.LENGTH_SHORT).show();
                question4ChoiceOneAnswer = false;
        }
            }
            
    public void submitAnswers(View view) {

        Toast.makeText(this, "You scored" + score +"/4", Toast.LENGTH_LONG).show();
    }





















}
