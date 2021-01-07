package com.example.demo_jpa.demos.web;

import com.example.demo_jpa.demos.repository.NoticeRepository;
import com.example.demo_jpa.demos.entity.Notice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class NoticeController {

    @Autowired
    NoticeRepository repository;

    @RequestMapping("/save")
    @ResponseBody
    public String saveNotice(Notice n) {
        repository.save(n);
        return "you will save: notice=" + n.getContents() ;
    }

    @RequestMapping("/search")
    @ResponseBody
    public String searchNotice(Notice n) {
        List<Notice>  result= repository.findByContents(n.getContents());
        return "notice:" + result ;
    }
    @RequestMapping("/drop")
    @ResponseBody
    public String dropNotice(Notice n) {
        repository.deleteById(n.getId());
//        List<Notice>  result= repository.findByContents(n.getContents());
        return "drop notice:" + n.getId() ;
    }

}