package com.gstock.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gstock.springboot.models.Article;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {

}
