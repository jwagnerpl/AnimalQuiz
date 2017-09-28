package teamtreehouse.com.animalquiz;

import static teamtreehouse.com.animalquiz.R2.id.questionTextView;
import static teamtreehouse.com.animalquiz.R2.id.submitButton;

public class Question {
    int value;
    String questionText;


    public Question(String questionText) {
        this.value = 10;
        this.questionText = questionText;
    }

    public Question() {
    }


    public static final Question[] questions = new Question[]{
            new Question("I could survive in nature by myself."),
            new Question("I love to get outside and do crazy things."),
            new Question("I strongly dislike boring things."),
            new Question("People say I'm super duper crazy."),
            new Question("I have at least three tattoos."),
            new Question("I like big, WILD ANIMALS."),
            new Question("I would love to go sky diving."),
            new Question("I have at least three tattoos.")
    };
}
