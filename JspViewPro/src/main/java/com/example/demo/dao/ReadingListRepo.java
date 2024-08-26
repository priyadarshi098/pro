package com.example.demo.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entities.Book;

public interface ReadingListRepo extends JpaRepository<Book, Long> {

	List<Book> findByReader(String reader);
}
