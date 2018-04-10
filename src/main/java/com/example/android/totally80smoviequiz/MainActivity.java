package com.example.android.totally80smoviequiz;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    /* Question 1 */
    RadioButton question1_choice_et;
    /* Question 2 */
    RadioButton question2_choice_tron;
    /* Question 3 */
    CheckBox question3_choice1_anthony;
    CheckBox question3_choice2_emilio;
    CheckBox question3_choice3_judd;
    CheckBox question3_choice4_matthew;
    CheckBox question3_choice5_molly;
    CheckBox question3_choice6_rob;
    CheckBox question3_choice7_ally;
    /* Question 4 */
    EditText question4_answer;
    /* Question 5 */
    RadioButton question5_choice_genius;
    /* Question 6 */
    EditText question6_answer;
    /* Question 7 */
    RadioButton question7_choice_labyrinth;
    /* Question 8 */
    RadioButton question8_choice_starfighter;
    /* Question 9 */
    RadioButton question9_choice_thing;
    /* Question 10 */
    EditText question10_answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Hide the keyboard
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        setContentView(R.layout.activity_main);
    }

    /* This method is called when the grade quiz button is clicked */

    public void gradeQuiz(View view) {
        CharSequence resultsDisplay;
        int answer1_score;
        int answer2_score;
        int answer3_score;
        int answer4_score;
        int answer5_score;
        int answer6_score;
        int answer7_score;
        int answer8_score;
        int answer9_score;
        int answer10_score;
        int final_score;

        /* ----------------------- */
        /* Question 1 - Answer: ET */
        /* ----------------------- */
        Boolean answer1;

        question1_choice_et = (RadioButton) this.findViewById(R.id.question1_radio_et);
        answer1 = question1_choice_et.isChecked();
        if (answer1) {
            answer1_score = 1;
        } else {
            answer1_score = 0;
        }

        /* ------------------------- */
        /* Question 2 - Answer: Tron */
        /* ------------------------- */
        Boolean answer2;

        question2_choice_tron = (RadioButton) this.findViewById(R.id.question2_radio_tron);
        answer1 = question2_choice_tron.isChecked();
        if (answer1) {
            answer2_score = 1;
        } else {
            answer2_score = 0;
        }

        /* -------------------------------------------------------- */
        /* Question 3  - Answer: Anthony, Emilio, Judd, Molly, Ally */
        /* -------------------------------------------------------- */

        Boolean answer3_choice1;
        Boolean answer3_choice2;
        Boolean answer3_choice3;
        Boolean answer3_choice4;
        Boolean answer3_choice5;
        Boolean answer3_choice6;
        Boolean answer3_choice7;
        question3_choice1_anthony = (CheckBox) this.findViewById(R.id.question3_choice1_anthony);
        question3_choice2_emilio = (CheckBox) this.findViewById(R.id.question3_choice2_emilio);
        question3_choice3_judd = (CheckBox) this.findViewById(R.id.question3_choice3_judd);
        question3_choice4_matthew = (CheckBox) this.findViewById(R.id.question3_choice4_matthew);
        question3_choice5_molly = (CheckBox) this.findViewById(R.id.question3_choice5_molly);
        question3_choice6_rob = (CheckBox) this.findViewById(R.id.question3_choice6_rob);
        question3_choice7_ally = (CheckBox) this.findViewById(R.id.question3_choice7_ally);
        answer3_choice1 = question3_choice1_anthony.isChecked();
        answer3_choice2 = question3_choice2_emilio.isChecked();
        answer3_choice3 = question3_choice3_judd.isChecked();
        answer3_choice4 = question3_choice4_matthew.isChecked();
        answer3_choice5 = question3_choice5_molly.isChecked();
        answer3_choice6 = question3_choice6_rob.isChecked();
        answer3_choice7 = question3_choice7_ally.isChecked();
        if (answer3_choice1 && answer3_choice2 && answer3_choice3 && !answer3_choice4 && answer3_choice5 && !answer3_choice6 && answer3_choice7) {
            answer3_score = 1;
        } else {
            answer3_score = 0;
        }

        /* ------------------------------------ */
        /* Question 4 - Answer is "not to play" */
        /* ------------------------------------ */
        String answer4;

        question4_answer = (EditText) this.findViewById(R.id.question4_answer);
        answer4 = question4_answer.getText().toString().toLowerCase();
        if (answer4.equals("not to play")) {
            answer4_score = 1;
        } else {
            answer4_score = 0;
        }

        /* -------------------------------- */
        /* Question 5 - Answer: Real Genius */
        /* -------------------------------- */
        Boolean answer5;

        question5_choice_genius = (RadioButton) this.findViewById(R.id.question5_choice_genius);
        answer5 = question5_choice_genius.isChecked();
        if (answer5) {
            answer5_score = 1;
        } else {
            answer5_score = 0;
        }

        /* -------------------------------- */
        /* Question 6 - Answer: "excellent" */
        /* -------------------------------- */
        String answer6;

        question6_answer = (EditText) this.findViewById(R.id.question6_answer);
        answer6 = question6_answer.getText().toString().toLowerCase();
        if (answer6.equals("excellent")) {
            answer6_score = 1;
        } else {
            answer6_score = 0;
        }

        /* ------------------------------ */
        /* Question 7 - Answer: Labyrinth */
        /* ------------------------------ */
        Boolean answer7;

        question7_choice_labyrinth = (RadioButton) this.findViewById(R.id.question7_choice_labyrinth);
        answer7 = question7_choice_labyrinth.isChecked();
        if (answer7) {
            answer7_score = 1;
        } else {
            answer7_score = 0;
        }

        /* -------------------------------- */
        /* Question 8 - Answer: Starfighter
        /* -------------------------------- */
        Boolean answer8;

        question8_choice_starfighter = (RadioButton) this.findViewById(R.id.question8_choice_starfighter);
        answer8 = question8_choice_starfighter.isChecked();
        if (answer8) {
            answer8_score = 1;
        } else {
            answer8_score = 0;
        }

        /* -------------------------- */
        /* Question 9 - Answer: Thing
        /* -------------------------- */
        Boolean answer9;

        question9_choice_thing = (RadioButton) this.findViewById(R.id.question9_choice_thing);
        answer9 = question9_choice_thing.isChecked();
        if (answer9) {
            answer9_score = 1;
        } else {
            answer9_score = 0;
        }

        /* --------------------------- */
        /* Question 10 - Answer: "one" */
        /* --------------------------- */
        String answer10;

        question10_answer = (EditText) this.findViewById(R.id.question10_answer);
        answer10 = question10_answer.getText().toString().toLowerCase();
        if (answer10.equals("one")) {
            answer10_score = 1;
        } else {
            answer10_score = 0;
        }

        /* ------------------------------- */
        /* Add it up and find final score! */
        /* ------------------------------- */

        final_score = answer1_score + answer2_score + answer3_score + answer4_score + answer5_score + answer6_score + answer7_score + answer8_score + answer9_score + answer10_score;

        if (final_score == 10) {
            resultsDisplay = "RADICAL! You got 10 out of 10";
        } else {
            resultsDisplay = "BOGUS. Only " + final_score + " out of 10";
        }

        Context context = getApplicationContext();
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context, resultsDisplay, duration);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();

    }
}
