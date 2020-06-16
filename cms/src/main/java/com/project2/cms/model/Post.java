package com.project2.cms.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(schema="project2", name= "POST_TABLE")
public class Post {
	
	
	
	//No arg constructor
	public Post () {
		
	}
	
	//Constructor
	public Post(int postid, int author, String postTitle, String postDescription, String postText, String dateSubmitted,
			String datePublished, String postType, String postField, String keyWords, int resolver, String status, int published) {
		super();
		this.postid = postid;
		this.author = author;
		this.postTitle = postTitle;
		this.postDescription = postDescription;
		this.postText = postText;
		this.dateSubmitted = dateSubmitted;
		this.datePublished = datePublished;
		this.postType = postType;
		this.postField = postField;
		this.keyWords = keyWords;
		this.resolver = resolver;
		this.status = status;
		this.published = published;
	}
		//Fields
	
		@Id
		@Column(name = "postid")
		@GeneratedValue
		private int postid;
		@Column(name = "author")
		private int author;
		@Column(name = "postTitle")
		private String postTitle;
		@Column(name = "postDescription")
		private String postDescription;
		@Column(name = "postText")
		private String postText;
		@Column(name = "dateSubmitted")
		private String dateSubmitted;
		@Column(name = "datePublished")
		private String datePublished;
		@Column(name = "postType")
		private String postType;
		@Column(name = "postField")
		private String postField;
		@Column(name = "keyWords")
		private String keyWords;
		@Column(name = "resolver")
		private int resolver;
		@Column(name = "status")
		private String status;	
		@Column(name = "published")
		private int published;
		
		
		
		//Field Getter and setters
		
		public int getId() {
			return postid;
		}
		public void setId(int id) {
			this.postid = id;
		}
		public String getPostTitle() {
			return postTitle;
		}
		public void setPostTitle(String postTitle) {
			this.postTitle = postTitle;
		}
		public String getPostDescription() {
			return postDescription;
		}
		public void setPostDescription(String postDescription) {
			this.postDescription = postDescription;
		}
		public String getPostText() {
			return postText;
		}

		public void setPostText(String postText) {
			this.postText = postText;
		}
		public String getPostType() {
			return postType;
		}
		public void setPostType(String postType) {
			this.postType = postType;
		}
		public String getPostField() {
			return postField;
		}
		public void setPostField(String postField) {
			this.postField = postField;
		}
		public String getKeyWords() {
			return keyWords;
		}
		public void setKeyWords(String keyWords) {
			this.keyWords = keyWords;
		}
		public int getResolver() {
			return resolver;
		}
		public void setResolver(int resolver) {
			this.resolver = resolver;
		}
			public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
			public int getAuthor() {
			return author;
		}
		public void setAuthor(int author) {
			this.author = author;
		}
		public String getDateSubmitted() {
			return dateSubmitted;
		}
		public void setDateSubmitted(String dateSubmitted) {
			this.dateSubmitted = dateSubmitted;
		}
		public String getDatePublished() {
			return datePublished;
		}
		public void setDatePublished(String datePublished) {
			this.datePublished = datePublished;
		}
		public int getPublished() {
			return published;
		}

		public void setPublished(int published) {
			this.published = published;
		}

		//toString method override
		@Override
		public String toString() {
			return "Post [id=" + postid + ", author=" + author + ", postTitle=" + postTitle + ", postDescription="
					+ postDescription + ", dateSubmitted=" + dateSubmitted + ", datePublished=" + datePublished
					+ ", postType=" + postType + ", postField=" + postField + ", keyWords=" + keyWords + ", resolver="
					+ resolver + ", status=" + status + "]";
		}
		
		
		
		
}
