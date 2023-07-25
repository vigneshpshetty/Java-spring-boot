package com.vignesh.rest.webservices.restfulwebservices.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vignesh.rest.webservices.restfulwebservices.user.Post;

public interface PostRepository extends JpaRepository<Post,Integer> {


}
