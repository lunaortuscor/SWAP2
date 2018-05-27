package com.example.russell.swap4;

public class Employer {
    private String identifier;
    private char gender;

    public Employer(){

    }
    public Employer(String identifier, char gender){
        this.identifier = identifier;
        if(gender == 'M' || gender == 'F') {
            this.gender = gender;
        }
    }

    public String getIdentifier(){
        return this.identifier;
    }

    public char getGender(){
        return this.gender;
    }

}
