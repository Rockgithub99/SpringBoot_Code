package com.example.Opretion.Repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Opretion.Entity.Book;
@Repository
public interface BookRepo extends CrudRepository<Book ,Integer>{

}
