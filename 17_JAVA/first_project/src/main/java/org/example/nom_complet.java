package org.example;

public class nom_complet {

    public static String fullname(String firstname, String space, String lastname){
        return firstname + space + lastname;
    }

    public static void main(String[] args) {
        var fullname = fullname("John", " ",  "Doe");
        System.out.println(fullname);
    }
}
