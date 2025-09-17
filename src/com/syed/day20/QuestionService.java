package com.syed.day20;

public class QuestionService {
    Question[] questionList = new Question[5];
    
    public QuestionService() {
        questionList[0] = new Question(0, "Java Language", "Java", "Python", "C++", "C", "Rust");
        questionList[1] = new Question(0, "Python Language", "Java", "Python", "C++", "C", "Rust");
        questionList[2] = new Question(0, "C++ Language", "Java", "Python", "C++", "C", "Rust");
        questionList[3] = new Question(0, "Favourite Language", "Java", "Python", "C++", "C", "Rust");
        questionList[4] = new Question(0, "Favourite Language", "Java", "Python", "C++", "C", "Rust");
    }

    public void displayQuestions(){

    }
}
