package com.example.demo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Entry {
    public String firstName;
    public String lastName;
    public String phoneNumber;
}