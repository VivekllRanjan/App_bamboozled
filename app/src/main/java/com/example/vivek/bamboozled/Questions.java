package com.example.vivek.bamboozled;

/**
 * Created by vivek on 28-Jul-17.
 */

public class Questions {
    public String  mQuestions[] = {
            "What is the abbreviation of WWW?",
            "What is IP?",
            "Which of the following is open source?"

    };
    private String mChoices[][] = {
            {"World West World","World Will Web","World Wide Web","None"},
            {"Internet poll","Internet protocol","Internet Post","None"},
            {"Android","Windows","Matlab","None"}

    };
    private String mCorrectAnswer[] = {
            "World Wide Web","Internet protocol","Android"

    };
    public String getQuetion(int a) {
        String  question = mQuestions[a];
        return question;
    }
    public String getChoice1(int a){
        String choice = mChoices[a][0];
        return choice;
    }
    public String getChoice2(int a){
        String choice = mChoices[a][1];
        return choice;
    }
    public String getChoice3(int a){
        String choice = mChoices[a][2];
        return choice;
    }
    public String getChoice4(int a){
        String choice = mChoices[a][3];
        return choice;
    }
    public String getCorrectAnswer(int a){
        String Answer = mCorrectAnswer[a];
        return Answer;
    }
}
