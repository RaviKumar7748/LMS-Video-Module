package com.app.service;

import java.util.List;

import com.app.entity.Video;

public interface VideoService {

	List<Video> findAllVideo();

	List<String> findAllCourses();
	
	Video saveVideo(Video video);

	void deleteOneVideo(Long id);

	List<String> findAllCourseByTitle(String title);
	
	

}
