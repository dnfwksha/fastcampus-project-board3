package com.example.fastcampusprojectboard.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Objects;

public class ArticleComment {
    private Long id;
    private Article article;    //  게시글 (ID)
    private String content;     //  본문




}
