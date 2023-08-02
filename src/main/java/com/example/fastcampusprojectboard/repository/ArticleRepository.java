package com.example.fastcampusprojectboard.repository;

import com.example.fastcampusprojectboard.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article,Long> {
}
