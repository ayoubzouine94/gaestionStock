package com.gstock.springboot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gstock.springboot.models.Article;
import com.gstock.springboot.services.ArticleService;

@RestController
@RequestMapping("/")
public class ArticleController {
	
	@Autowired
	ArticleService articleService;
	
	@GetMapping("/articles")
	public List<Article> getArticle() {
		return articleService.getArticle();
	}

}
