package com.example.fastcampusprojectboard.service;

import com.example.fastcampusprojectboard.dto.ArticleDto;
import com.example.fastcampusprojectboard.repository.ArticleRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.assertj.core.api.Assertions.*;
@DisplayName("비즈니스 로직 - 게시글")
@ExtendWith(MockitoExtension.class)
class ArticleServiceTest {

    @InjectMocks private ArticleService sut;
    @Mock private ArticleRepository articleRepository;


    @DisplayName("게시글을 검색하면, 게시글 리스트를 반환한다.")
    @Test
    void test(){
        //  Given

        //  When
        List<ArticleDto> articles = sut.searchArticles(SearchType.TITLE,"search keyword");

        //  Then
        assertThat(articles).isNotNull();

    }
}

//Mockito