package com.quizforge.backend.repository;

import com.quizforge.backend.model.Question;
import com.quizforge.backend.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface QuestionRepository extends JpaRepository<Question,Long> {
    Set<Question> findByQuiz(Quiz quiz);
}
