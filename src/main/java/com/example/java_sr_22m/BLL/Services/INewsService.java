package com.example.java_sr_22m.BLL.Services;

import com.example.java_sr_22m.DAL.Entities.News;
import com.example.java_sr_22m.DTO.NewsDeleteDto;
import com.example.java_sr_22m.DTO.NewsPostDto;
import com.example.java_sr_22m.DTO.NewsUpdateDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface INewsService {
    List<News> GetAllNews();
    String CreateNews(NewsPostDto newsPostDto);
    String DeleteNewsById(NewsDeleteDto newsDeleteDto);
    String UpdateNews(NewsUpdateDto newsUpdateDto);
}
