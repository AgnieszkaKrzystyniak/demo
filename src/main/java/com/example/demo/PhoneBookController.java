package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class PhoneBookController {

    private static final String MODEL_PHONEBOOK_ATTRIBUTE_NAME = "phoneBookMsg";
    //private final RandomNumberProvider randomNumberProvider;


    @Autowired
    public PhoneBookList phoneBookList;

    @GetMapping("/api/index")
    public String showFirstNumber(final ModelMap modelMap) {
        modelMap.addAttribute(MODEL_PHONEBOOK_ATTRIBUTE_NAME, "hello in thymeleaf from model map");
        modelMap.addAttribute("elements", List.of("one", "two", "three"));
        //modelMap.addAttribute("orderForm", new Entry());
        //modelMap.addAttribute("ordersList", List.of(new Entry("Jan", "Abecki", 523), new Entry()));

        Entry entry = new Entry("Ala", "Abecki", "111222333");
        Entry entry2 = new Entry("Jan", "Babecki", "999888777");

        List<Object> list = List.of(entry, entry2);
        modelMap.addAttribute("entries", list);

        modelMap.addAttribute("entryForm", new Entry());

        return "index";

    }

    //@PostMapping("/create")
    //public String add() {

      //  return "add";
    //}

}