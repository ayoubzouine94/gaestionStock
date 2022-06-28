package com.gstock.springboot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gstock.springboot.models.Article;
import com.gstock.springboot.repositories.ArticleRepository;

@Service
public class ArticleServiceImpl implements ArticleService {
	
	@Autowired
	ArticleRepository articleRepository;

	@Override
	public List<Article> getArticle() {
		return articleRepository.findAll();

	}

}
