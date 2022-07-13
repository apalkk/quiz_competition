package com.example.quiz_competition;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;
import android.widget.Button;
import com.google.android.material
        .snackbar
        .Snackbar;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
 TextView total_questions;
 TextView question;
 Button answer_a;
 Button answer_b;
 Button answer_c;
 Button answer_d;
 Button submit;
 String select_answer = "";
 int score = 0;
 int curr_index=0;
 int total = QnA.question.length;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        total_questions=findViewById(R.id.total_questions);
        question=findViewById(R.id.question);
        answer_a=findViewById(R.id.ans_a);
        answer_b=findViewById(R.id.ans_b);
        answer_c=findViewById(R.id.ans_c);
        answer_d=findViewById(R.id.ans_d);
        submit=findViewById(R.id.submit_button);
       answer_a.setOnClickListener(this);
       answer_b.setOnClickListener(this);
       answer_c.setOnClickListener(this);
       answer_d.setOnClickListener(this);
       submit.setOnClickListener(this);
       total_questions.setText("Total Questions:"+total);
       loadnewquestion();
    }

    private void loadnewquestion() {
        total_questions.setText(QnA.question[curr_index]);
        answer_a.setText(QnA.choices[curr_index][0]);
        answer_b.setText(QnA.choices[curr_index][1]);
        answer_c.setText(QnA.choices[curr_index][2]);
        answer_d.setText(QnA.choices[curr_index][3]);
    }

    @Override
    public void onClick(View view) {

    }
}