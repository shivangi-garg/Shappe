package com.shappe.shappe.Model;


public class QuestionLibrary1 {
    public String mQuestions []={
            "Do you have little or no interest in doing things?",
     "Do you feel down, depressed or hopeless?",
    "Do you feel irritable or snap at people?",
    "Do you have trouble falling or staying asleep or sleep too much?",
    "Do you feel tired or have little energy?",
    "Do you have poor appetite or overeat?",
    "Do you have a bad feeling about yourself that you are a failure or have let yourself or your family down?",
    "Do you have trouble concentrating on things,such as reading newspaper or watching television?",
    "Do you have thoughts that you would be better off dead or hurting yourself?",
    "Is it very difficult for you to face guilt feeling?",
    "Are you easily bothered by things that didn't use to bother you earlier?",
    "Are you unable to feel happy even when your family and friends try to cheer you up?",
    "Do you suffer from lack of attention?",
    "Do you feel like nothing good awaits you in the future?",
    "Do you feel that things you did before did not turn out right?",
    "Do you find yourself worrying too much about a particular thing?",
    "Do you have negative thoughts at night or when you are alone?",
    "Are you more quiet than usual?",
    "Do you feel that you have no friends?",
    "Do you spend the whole day without doing any pleasurable activity?",
    "Do you feel like crying?",
    "Do you smoke, drink alcohol or use drugs?"

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






















