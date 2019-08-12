package com.htc.pojo;

import java.util.Date;

public class Orders {
    private Integer id;

    private Integer userId;

    private String numbers;

    private Date createtitle;

    private String note;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getNumbers() {
        return numbers;
    }

    public void setNumbers(String numbers) {
        this.numbers = numbers == null ? null : numbers.trim();
    }

    public Date getCreatetitle() {
        return createtitle;
    }

    public void setCreatetitle(Date createtitle) {
        this.createtitle = createtitle;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }
}