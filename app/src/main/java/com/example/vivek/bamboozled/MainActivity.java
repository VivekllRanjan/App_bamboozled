package com.example.vivek.bamboozled;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4;
    TextView S,Q;
    private Questions mQuestion = new Questions();
    private String mAnswer;
    private int mScore = 0;
    private int mQuestionLengeth = mQuestion.mQuestions.length;
    Random r;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        r  = new Random();
        setContentView(R.layout.activity_main);
        b1 = (Button)findViewById(R.id.answer1);
        b2 = (Button)findViewById(R.id.answer2);
        b3 = (Button)findViewById(R.id.answer3);
        b4 = (Button)findViewById(R.id.answer4);
        S  = (TextView)findViewById(R.id.textView);
        Q  = (TextView)findViewById(R.id.textView2);
        S.setText("Score: "+mScore);
        updateQuestion(r.nextInt(mQuestionLengeth));
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b1.getText().toString() == mAnswer)
                {
                    mScore++;
                    S.setText("Score: "+mScore);
                    updateQuestion(r.nextInt(mQuestionLengeth));
                }
                else
                    gameOver();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b2.getText().toString() == mAnswer)
                {
                    mScore++;
                    S.setText("Score: "+mScore);
                    updateQuestion(r.nextInt(mQuestionLengeth));
                }
                else
                    gameOver();

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b3.getText().toString() == mAnswer)
                {
                    mScore++;
                    S.setText("Score: "+mScore);
                    updateQuestion(r.nextInt(mQuestionLengeth));
                }
                else
                    gameOver();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b4.getText().toString() == mAnswer)
                {
                    mScore++;
                    S.setText("Score: "+mScore);
                    updateQuestion(r.nextInt(mQuestionLengeth));
                }
                else
                    gameOver();
            }
        });
    }

    private void gameOver() {
        AlertDialog.Builder alertDialogBuilder  = new AlertDialog.Builder(MainActivity.this);
        alertDialogBuilder.setMessage("Game Over, Your Score is "+mScore+" points.")
                          .setCancelable(false)
                          .setPositiveButton("New Game",
                                  new DialogInterface.OnClickListener() {
                                      @Override
                                      public void onClick(DialogInterface dialog, int which) {
                                            startActivity(new Intent(getApplicationContext(),
                                                    MainActivity.class));
                                      }
                                  })

                          .setNegativeButton("Exit",
                                  new DialogInterface.OnClickListener() {
                                      @Override
                                      public void onClick(DialogInterface dialog, int which) {

                                      }
                                  });
        AlertDialog alertdialog = alertDialogBuilder.create();
        alertdialog.show();
    }

    private void updateQuestion(int num){
        Q.setText(mQuestion.getQuetion(num));
        b1.setText(mQuestion.getChoice1(num));
        b2.setText(mQuestion.getChoice2(num));
        b3.setText(mQuestion.getChoice3(num));
        b4.setText(mQuestion.getChoice4(num));
        mAnswer = mQuestion.getCorrectAnswer(num);

    }
}
