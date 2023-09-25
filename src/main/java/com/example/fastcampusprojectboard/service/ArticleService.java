package com.example.fastcampusprojectboard.service;

import com.example.fastcampusprojectboard.repository.ArticleRepository;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ArticleService {

    private final ArticleRepository articleRepository;
}
