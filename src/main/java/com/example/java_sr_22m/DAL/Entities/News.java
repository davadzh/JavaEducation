package com.example.java_sr_22m.DAL.Entities;

import com.example.java_sr_22m.DTO.NewsPostDto;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
public class News {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    private String author;
    private String name;
    private String text;
    private String category;
    private Date creationDate;
    private Date modifyDate;

    public News(){}

    public News(NewsPostDto newsPostDto) {
        this.author = newsPostDto.author;
        this.name = newsPostDto.name;
        this.text = newsPostDto.text;
        this.category = newsPostDto.category;
        this.creationDate = new Date();
        this.modifyDate = null;
    }
}
