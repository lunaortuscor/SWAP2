package com.example.russell.swap4;

public class Helper {
    public String identifier;
    public char gender;

    public Helper(){

    }

    public Helper(String identifier, char gender){
        this.identifier = identifier;
        if(gender == 'M' || gender == 'F'){
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
