package com.analytics.social.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.analytics.social.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Custom query methods can be defined here if needed
	
	// Find users by category
    List<User> findByCategory(String category);
    
    // Find users by name
    List<User> findByName(String name);
    
    // Find users by bio containing a keyword
    List<User> findByBioContaining(String keyword);

	
    
   
}
