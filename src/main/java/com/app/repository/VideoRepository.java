package com.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.Video;

public interface VideoRepository  extends JpaRepository<Video, Long>{
      List<String> findByTitle(String title);
}
