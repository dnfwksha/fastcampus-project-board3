package com.example.fastcampusprojectboard.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Article {

    private Long id;
    private String title;   //  제목
    private String content; //  본문
    private String hashtag; //  해시태그
    private final Set<ArticleComment> articleComments = new LinkedHashSet<>();



}
