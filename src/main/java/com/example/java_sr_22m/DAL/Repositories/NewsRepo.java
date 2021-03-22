package com.example.java_sr_22m.DAL.Repositories;

import com.example.java_sr_22m.DAL.Entities.News;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewsRepo extends JpaRepository<News, Long> {
}
