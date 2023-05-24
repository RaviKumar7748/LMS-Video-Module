package com.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Data
@Table(name = "VIDEO_TAB")
public class Video {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "VIDEO_ID")
	private Long id;
	@Column(name = "VIDEO_TITLE")
	private String title;
	@Column(name = "VIDEO_URL")
	private String url;
	@Column(name = "VIDEO_DESCRIPTION")
	private String description;

}
