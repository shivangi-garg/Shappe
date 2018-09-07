package com.shappe.shappe.Model;


public class QuestionLibrary2 {
    public String mQuestions[] = {
            "Are you able to relax?",
            "Do you tend to focus on upsetting situations or events happening in your life?",
            "Do you feel fearful for no reason?",
            "Do you have diarrhea, constipation and other digestive problems?",
            "Are you easily alarmed, frightened or surprised?",
            "Do you experience shortness of breath or choking feelings?",
            "Do you have sweaty or cold, clammy hands?",
            "Are you afraid of crowds, being left alone, the dark, of strangers or of traffic?",
            "Do you think a lot about the things you do?",
            "Are you afraid of what awaits you in the future?",
            "Do you feel that you are not as happy as people around you?",
            "Do you have a dry mouth?",
            "When someone snaps at you, do you spend the whole day thinking about it?",
            "Are your muscles tense, aching or sore?",
            "Do you faint or feel like fainting?",
            "Do you have difficulty swallowing or have a lump in throat feeling?",
            " Are you easily irritated ?",
            "Do you have negative thoughts about life at night?",
            "Do you have hot and/or cold flashes?",
            "Do you have trouble falling or staying asleep?",
            "Do you feel dizzy or light-headed?",
            "Are you satisfied with what you look like?"

    };
    private String mChoices[][] = {
            {"True", "False"},
            {"True", "False"},
            {"True", "False"},
            {"True", "False"},
            {"True", "False"},
            {"True", "False"},
            {"True", "False"},
            {"True", "False"},
            {"True", "False"},
            {"True", "False"},
            {"True", "False"},
            {"True", "False"},
            {"True", "False"},
            {"True", "False"},
            {"True", "False"},
            {"True", "False"},
            {"True", "False"},
            {"True", "False"},
            {"True", "False"},
            {"True", "False"},
            {"True", "False"},
            {"True", "False"}
    };
    private String mCorrectAnswers[] = {
            "True", "True", "True", "True", "True", "True", "True", "True", "True", "True",
            "True", "True", "True", "True", "True", "True", "True", "True", "True", "True", "True", "True"};

    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;
    }

    public String getChoice1(int a) {
        String choice = mChoices[a][0];
        return choice;
    }

    public String getChoice2(int a) {
        String choice = mChoices[a][1];
        return choice;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }
}


