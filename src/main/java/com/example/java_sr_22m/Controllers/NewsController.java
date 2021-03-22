package com.example.java_sr_22m.Controllers;

import com.example.java_sr_22m.BLL.Services.INewsService;
import com.example.java_sr_22m.DAL.Entities.News;
import com.example.java_sr_22m.DTO.NewsDeleteDto;
import com.example.java_sr_22m.DTO.NewsPostDto;
import com.example.java_sr_22m.DTO.NewsUpdateDto;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/news")
public class NewsController {
    private final INewsService newsService;

    @Autowired
    public NewsController(INewsService newsService) {
        this.newsService = newsService;
    }

    @GetMapping(value = "/getnews")
    public ResponseEntity<List<News>> GetAllNews() {
        List<News> allNews = newsService.GetAllNews();

        return new ResponseEntity<>(allNews, HttpStatus.OK);
    }

    @PostMapping(value = "/create")
    public ResponseEntity<String> CreateNews(@RequestBody NewsPostDto newsPostDto) {
        String message = newsService.CreateNews(newsPostDto);

        return new ResponseEntity<>(message, HttpStatus.OK);
    }

    @DeleteMapping(value = "/deletebyid")
    public ResponseEntity<String> DeleteNewsById(@RequestBody NewsDeleteDto newsDeleteDto) {
        String message = newsService.DeleteNewsById(newsDeleteDto);

        return new ResponseEntity<>(message, HttpStatus.OK);
    }

    @PutMapping(value = "/updatenews")
    public ResponseEntity<String> UpdateNews(@RequestBody NewsUpdateDto newsUpdateDto) {
        String message = newsService.UpdateNews(newsUpdateDto);

        return new ResponseEntity<>(message, HttpStatus.OK);
    }

}
