package com.app.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.Video;
import com.app.repository.VideoRepository;
import com.app.service.VideoService;

@Service
public class VideoServiceImpl implements VideoService {
	@Autowired
	private VideoRepository repo;

	@Override
	public List<Video> findAllVideo() {

		return repo.findAll();
	}

	@Override
	public void deleteOneVideo(Long id) {
		repo.deleteById(id);

	}

	@Override
	public List<String> findAllCourses() {
		List<Video> findAll = repo.findAll();
		List<String> list = new ArrayList<>();
		for (Video video : findAll) {
			if (video.getTitle().equals("java")) {
				list.add(video.getTitle());
			}

		}
		return list;
	}

	@Override
	public List<String> findAllCourseByTitle(String title) {
		return repo.findByTitle(title);
	}

	@Override
	public Video saveVideo(Video video) {
		return repo.save(video);
	}

}
