package com.quizforge.backend.service;

import com.quizforge.backend.model.Question;
import com.quizforge.backend.model.Quiz;

import java.util.Set;

public interface QuestionService {
    public Question addQuestion(Question question);
    public Question updateQuestion(Question question);

    public Set<Question>getQuestions();

    public Question getQuestion(Long id);

    public Set<Question> getQuestionsOfQuiz(Quiz quiz);

    public void deleteQuestion(Long id);

    public Question get(Long questionId);
}

