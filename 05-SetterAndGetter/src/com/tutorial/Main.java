package com.tutorial;

class User {
    private String username;
    private String pasword;

    // membuat konstruktor
    User(String username, String pasword) {
        this.username = username;
        this.pasword = pasword;

    }

    // method getter (tanpa parameter)
    public String getUsername(){
        return this.username;
    }
    public String getPasword(){
        return this.pasword;
    }

    // method setter
    public void setPasword(String pasword) {
        this.pasword = pasword;
    }
}

public class Main {
    public static void main(String[] args) {
        // instansiasi objek
        User person_1 = new User ("Uciha Saburo","123456789");

        // panggil method getter
        System.out.println(person_1.getUsername());
        System.out.println(person_1.getPasword());

        person_1.setPasword("1234554321");
        System.out.println("new pasword " +person_1.getPasword());

    }   
}
