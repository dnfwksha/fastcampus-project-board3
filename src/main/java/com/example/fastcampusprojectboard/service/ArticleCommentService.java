package com.example.fastcampusprojectboard.service;

import com.example.fastcampusprojectboard.dto.ArticleCommentDto;
import com.example.fastcampusprojectboard.repository.ArticleCommentRepository;
import com.example.fastcampusprojectboard.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Transactional
@Service
public class ArticleCommentService {

    private final ArticleRepository articleRepository;
    private final ArticleCommentRepository articleCommentRepository;

    @Transactional(readOnly = true)
    public List<ArticleCommentDto> searchArticleComment() {
        return List.of();
    }
}
