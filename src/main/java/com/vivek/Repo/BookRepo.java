package com.vivek.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vivek.entity.Book;

public interface BookRepo extends JpaRepository<Book, Integer>{
	

}
