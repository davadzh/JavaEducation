package com.example.java_sr_22m.BLL.Services;

import com.example.java_sr_22m.DAL.Entities.News;
import com.example.java_sr_22m.DAL.Repositories.NewsRepo;
import com.example.java_sr_22m.DTO.NewsDeleteDto;
import com.example.java_sr_22m.DTO.NewsPostDto;
import com.example.java_sr_22m.DTO.NewsUpdateDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class NewsService implements INewsService {
    private final NewsRepo newsRepo;

    @Autowired
    public NewsService(NewsRepo newsRepo) {
        this.newsRepo = newsRepo;
    }

    @Override
    public List<News> GetAllNews() {
        return newsRepo.findAll();
    }

    @Override
    public String CreateNews(NewsPostDto newsPostDto) {
        News candidate = new News(newsPostDto);
        newsRepo.save(candidate);

        return "Новость успешно создана";
    }

    @Override
    public String DeleteNewsById(NewsDeleteDto newsDeleteDto) {
        newsRepo.deleteById(newsDeleteDto.id);

        return  "Новость успешно удалена";
    }

    @Override
    public String UpdateNews(NewsUpdateDto newsUpdateDto) {
        Optional<News> candidate = newsRepo.findById(newsUpdateDto.id);

        if (candidate.isEmpty())
            throw new RuntimeException();

        News news = candidate.get();
        news.setAuthor(newsUpdateDto.author);
        news.setName(newsUpdateDto.name);
        news.setText(newsUpdateDto.text);
        news.setCategory(newsUpdateDto.category);
        news.setModifyDate(new Date());

        newsRepo.save(news);
        return "Новость успешно обновлена";
    }
}
