package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;


@Component
public class PhoneBookList {

    public List<String> lista = new ArrayList<String>();

    public String add(String name) {
        lista.add (name);
        return name;
    }

}