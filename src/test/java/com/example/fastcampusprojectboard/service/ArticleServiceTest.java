package com.example.fastcampusprojectboard.service;

import com.example.fastcampusprojectboard.domain.Article;
import com.example.fastcampusprojectboard.domain.type.SearchType;
import com.example.fastcampusprojectboard.dto.ArticleDto;
import com.example.fastcampusprojectboard.repository.ArticleRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.data.domain.Page;

import java.time.LocalDateTime;
import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.willDoNothing;
import static org.mockito.Mockito.doNothing;

@DisplayName("비즈니스 로직 - 게시글")
@ExtendWith(MockitoExtension.class)
class ArticleServiceTest {

    @InjectMocks private ArticleService sut;
    @Mock private ArticleRepository articleRepository;


    @DisplayName("게시글을 검색하면, 게시글 리스트를 반환한다.")
    @Test
    void test1(){
        //  Given

        //  When
        Page<ArticleDto> articles = sut.searchArticles(SearchType.TITLE,"search keyword");

        //  Then
        assertThat(articles).isNotNull();

    }

    @DisplayName("게시글을 조회하면, 게시글을 반환한다.")
    @Test
    void test2(){
        //  Given

        //  When
        ArticleDto articles = sut.searchArticle(1L);

        //  Then
        assertThat(articles).isNotNull();
    }

    @DisplayName("게시글 정보를 입력하면, 게시글을 생성한다.")
    @Test
    void test3(){
        //  Given
        ArticleDto dto = ArticleDto.of(LocalDateTime.now(), "dnfwk", "title", "content", "hashtag");
        willDoNothing().given(articleRepository.save(any(Article.class)));

        //  When
        sut.saveArticle(dto);

        //  Then
        then(articleRepository).sho

    }
}

//Mockito