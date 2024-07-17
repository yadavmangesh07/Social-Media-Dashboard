package com.analytics.social.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Analytics {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int followers;
    private int following;
    private int posts;
    private int accountReach;
    private int accountEngaged;
    private int contentShared;
    private int activePromotions;
    private int totalStories;
    private int totalFollows;
    private int totalSaves;
    private int totalComments;
    private int totalShares;
    public Analytics(int followers, int following, int posts, int accountReach, int accountEngaged, int contentShared,
			int activePromotions, int totalStories, int totalFollows, int totalSaves, int totalComments,
			int totalShares) {
		super();
		this.followers = followers;
		this.following = following;
		this.posts = posts;
		this.accountReach = accountReach;
		this.accountEngaged = accountEngaged;
		this.contentShared = contentShared;
		this.activePromotions = activePromotions;
		this.totalStories = totalStories;
		this.totalFollows = totalFollows;
		this.totalSaves = totalSaves;
		this.totalComments = totalComments;
		this.totalShares = totalShares;
	}
	public Analytics() {
		super();
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getFollowers() {
		return followers;
	}
	public void setFollowers(int followers) {
		this.followers = followers;
	}
	public int getFollowing() {
		return following;
	}
	public void setFollowing(int following) {
		this.following = following;
	}
	public int getPosts() {
		return posts;
	}
	public void setPosts(int posts) {
		this.posts = posts;
	}
	public int getAccountReach() {
		return accountReach;
	}
	public void setAccountReach(int accountReach) {
		this.accountReach = accountReach;
	}
	public int getAccountEngaged() {
		return accountEngaged;
	}
	public void setAccountEngaged(int accountEngaged) {
		this.accountEngaged = accountEngaged;
	}
	public int getContentShared() {
		return contentShared;
	}
	public void setContentShared(int contentShared) {
		this.contentShared = contentShared;
	}
	public int getActivePromotions() {
		return activePromotions;
	}
	public void setActivePromotions(int activePromotions) {
		this.activePromotions = activePromotions;
	}
	public int getTotalStories() {
		return totalStories;
	}
	public void setTotalStories(int totalStories) {
		this.totalStories = totalStories;
	}
	public int getTotalFollows() {
		return totalFollows;
	}
	public void setTotalFollows(int totalFollows) {
		this.totalFollows = totalFollows;
	}
	public int getTotalSaves() {
		return totalSaves;
	}
	public void setTotalSaves(int totalSaves) {
		this.totalSaves = totalSaves;
	}
	public int getTotalComments() {
		return totalComments;
	}
	public void setTotalComments(int totalComments) {
		this.totalComments = totalComments;
	}
	public int getTotalShares() {
		return totalShares;
	}
	public void setTotalShares(int totalShares) {
		this.totalShares = totalShares;
	}
	
    
}
	
	