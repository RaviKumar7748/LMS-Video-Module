package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.Video;
import com.app.service.impl.VideoServiceImpl;

@RestController
@RequestMapping("/api/videos")
public class VideoController {

	@Autowired
	private VideoServiceImpl service;

	@GetMapping("/all")
	public List<Video> getAllVideos() {
		return service.findAllVideo();
	}

	@PostMapping("/save")
	public Video createVideo(@RequestBody Video video) {
		return service.saveVideo(video);
	}

	@GetMapping("/courses")
	public List<String> findAllCourses() {
		return service.findAllCourses();
	}

	@DeleteMapping("/delete/{id}")
	public void deleteOneVideo(@PathVariable Long id) {
		service.deleteOneVideo(id);
	}
    
	@GetMapping("/findall/{title}")
	public List<String> findAllCourseByTitle(@PathVariable String title) {
		return service.findAllCourseByTitle(title);
	}

}
