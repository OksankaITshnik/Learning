package org.example.Optionals;

import java.util.Optional;

class Person {
    private final String name;
    private final String email;

    Person(String name, String email){
        this.name = name;
        this.email = email;
    }

    String getName(){
        return name;
    }

    Optional<String> getEmail(){
        return Optional.ofNullable(email);
    }
}