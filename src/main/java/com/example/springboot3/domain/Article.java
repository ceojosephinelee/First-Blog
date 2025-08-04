package com.example.springboot3.domain;

import jakarta.persistence.*;
import lombok.Builder;

@Entity
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", updatable = false)
    private Long id;

    @Column(name="title", nullable = false)
    private String title;

    @Column(name="content", nullable = false)
    private String content;

    @Builder//  빌더 패턴으로 객체 생성, lombok에서 지원 -->어느 필드에 어떤 값이 들어가는지 '명시적'으로 파악 가능
    public Article(String title, String content) {
        this.title = title;
        this.content = content;
    }

    protected Article() { //기본 생성자

    }
    //getter
    public Long getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getContent() {
        return content;
    }

}
