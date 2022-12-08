package com.example.quizapp_assignment_3;

import java.util.ArrayList;

public class QuestionBank {
    ArrayList<Question> questionList = new ArrayList<>();
    ArrayList<Integer> colorList = new ArrayList<>();


    QuestionBank(){
        Question ques1 = new Question(R.string.Question1,true);
        Question ques2 = new Question(R.string.Question2,true);
        Question ques3 = new Question(R.string.Question3,false);
        Question ques4 = new Question(R.string.Question4,false);
        Question ques5 = new Question(R.string.Question5,true);

        Question ques6 = new Question(R.string.Question6,true);

        Question ques7 = new Question(R.string.Question7,false);

        Question ques8 = new Question(R.string.Question8,true);

        Question ques9 = new Question(R.string.Question9,true);
        Question ques10 = new Question(R.string.Question10,false);

        questionList.add(ques1);
        questionList.add(ques2);
        questionList.add(ques3);
        questionList.add(ques4);
        questionList.add(ques5);
        questionList.add(ques6);
        questionList.add(ques7);
        questionList.add(ques8);
        questionList.add(ques9);
        questionList.add(ques10);

        colorList.add(R.color.SkyBlue);
        colorList.add(R.color.LightCyan);
        colorList.add(R.color.Orange);
        colorList.add(R.color.Aquamarine);
        colorList.add(R.color.purple_200);
        colorList.add(R.color.LightBlue);
        colorList.add(R.color.LightCoral);
        colorList.add(R.color.LemonChiffon);
        colorList.add(R.color.LightPink);
        colorList.add(R.color.LemonChiffon);




    }

}