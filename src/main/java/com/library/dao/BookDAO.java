package com.library.dao;

import com.library.models.Book;
import com.library.models.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BookDAO {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public BookDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Book> index_book(){
        return jdbcTemplate.query("SELECT * FROM book", new BeanPropertyRowMapper<>(Book.class));
    }

    public Book show_book(int id){
        return jdbcTemplate.query("SELECT * FROM book WHERE id_book=?", new Object[]{id},
                new BeanPropertyRowMapper<>(Book.class)).stream().findAny().orElse(null);
    }

    public void save_book(Book book){
        jdbcTemplate.update("INSERT INTO book(title, author, year_book) values (?, ?, ?)",
                book.getTitle(), book.getAuthor(), book.getYear_book());
    }

    public void update_book(int id, Book updtBook){
        jdbcTemplate.update("UPDATE book SET title=?, author=?, year_book=? WHERE id_book=?",
                updtBook.getTitle(), updtBook.getAuthor(), updtBook.getYear_book());
    }

    public Book takenBooks(int id){
        return jdbcTemplate.query("SELECT * FROM person WHERE id_person=?", new Object[]{id}, new BeanPropertyRowMapper<>(Book.class))
                .stream().findAny().orElse(null);
    }

//    public boolean isFree(int id, Book book){
//        if (jdbcTemplate.query("SELECT id_person FROM book WHERE id_book=?",
//                new BeanPropertyRowMapper<>(Book.class)).stream().findAny() == null)
//        return false;
//        else return true;
//    }
}
