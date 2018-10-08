package com.fredy;

import java.util.ArrayList;

public class Capitol {

    private String titlu;

    Capitol(String titlu){
        this.titlu = titlu;
    }

    ArrayList<SubCapitol> subCapitole = new ArrayList<>();

    void addSubCapitol(SubCapitol subCapitol){
        subCapitole.add(subCapitol);
    }


    @Override
    public String toString() {
        return "Capitol{" +
                "titlu='" + titlu + '\'' +
                ", subCapitole=" + subCapitole +
                '}';
    }
}
