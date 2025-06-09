package com.quizforge.backend.repository;

import com.quizforge.backend.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    boolean existsByTitle(String title);
}
