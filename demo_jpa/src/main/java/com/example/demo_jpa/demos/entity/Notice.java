package com.example.demo_jpa.demos.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Notice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String contents;


    public Notice() {
    }

    public Notice(String contents) {
        this.contents = contents;

    }
    @Override
    public String toString() {
        return String.format(
                "Notice[id=%d, contents='%s']",
                id, contents);
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public Long getId() {
        return id;
    }

    public String getContents() {
        return contents;
    }


}
