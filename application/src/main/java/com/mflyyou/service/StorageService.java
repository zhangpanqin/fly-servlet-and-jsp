package com.mflyyou.service;


import java.util.ArrayList;
import java.util.List;

public class StorageService {

    private List<Person> db = new ArrayList<Person>();

    {
        db.add(new Person("初始化添加", 1));
    }

    public void add(Person person) {
        var newPerson = new Person(person.getFirstName(), person.getYob());
        db.add(newPerson);
    }

    public List<Person> getAllPersons() {
        return db;
    }
}
