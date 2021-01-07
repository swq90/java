package com.example.demo_jpa.demos.repository;
import java.util.List;

import com.example.demo_jpa.demos.entity.Notice;
import org.springframework.data.repository.CrudRepository;

//@Repository
public interface NoticeRepository extends CrudRepository<Notice, Long> {

    List<Notice> findByContents(String contents);

}