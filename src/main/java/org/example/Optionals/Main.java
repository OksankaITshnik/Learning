package org.example.Optionals;

import java.util.Optional;
import java.util.function.Function;

import static java.util.Optional.*;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Oksana", "OKSANA@gmail.COM");
        String result;
        if( person.getEmail().isPresent() ){
            result = person.getEmail().get().toLowerCase();
            System.out.println(result);
        } else {
            System.out.println("no email");
        }

        Optional<Person> o = Optional.of(person);
        Person p = o.get();
    }
}