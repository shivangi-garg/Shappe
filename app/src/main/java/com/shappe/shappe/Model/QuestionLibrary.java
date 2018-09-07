package com.shappe.shappe.Model;



public class QuestionLibrary {
    public String mQuestions []={
            "Are you having repititive unwanted thoughts?",
            "Are you avoiding these unwanted thoughts because they make you anxious?",
            "Do you want to control your thoughts but fail?",
            "Do you sometimes feel that you need to wash hands after touching something?",
            "Do you need to re-check twice to be sure of things?",
            "Do you dispose the old house-hold items that are not of use to you now?",
            "Do you repeatedly count your objects or belongings used in your daily life?",
            "Do you relieve your anxiety by re-arranging certain objects in your house?",
            "Are you superstitious?",
            "Do you sometimes fail to express?",
            "Do you have difficulty self-soothing (making yourself feel safe on the inside)?",
            "Do you feel compelled to do certain tasks or behaviors over and over again fearing something bad could happen?",
            "Do you have concerns with contamination or getting a serious illness such as AIDS?",
            "Are you over concerned with keeping objects in exact perfect order?",
            "Do you have mental images of death or horrible events?",
            "Do you have personally inacceptable religious or sexual thoughts?",
            "Do you worry about fire, burglary or flooding the house?",
            "Do you worry about spreading an illness?",
            "Do you worry about losing something valuable?",
            "Do you worry about physically harming a loved one?",
            "Do you believe that your thoughts can influence the fate of others or the universe?"

    };
    private String mChoices[][]={
            {"True","False"},
            {"True","False"},
            {"True","False"},
            {"True","False"},
            {"True","False"},
            {"True","False"},
            {"True","False"},
            {"True","False"},
            {"True","False"},
            {"True","False"},
            {"True","False"},
            {"True","False"},
            {"True","False"},
            {"True","False"},
            {"True","False"},
            {"True","False"},
            {"True","False"},
            {"True","False"},
            {"True","False"},
            {"True","False"},
            {"True","False"},
            {"True","False"}
    };
    private String mCorrectAnswers[]={
            "True","True","True","True","True","True","True","True","True","True",
            "True","True","True","True","True","True","True","True","True","True","True","True"};

    public String getQuestion(int a)
    {
        String question =mQuestions[a];
        return question;
    }
    public String getChoice1(int a)
    {
        String choice= mChoices[a][0];
        return choice;
    }
    public String getChoice2(int a)
    {
        String choice= mChoices[a][1];
        return choice;
    }
    public String getCorrectAnswer(int a)
    {
        String answer= mCorrectAnswers[a];
        return answer;
    }

}
