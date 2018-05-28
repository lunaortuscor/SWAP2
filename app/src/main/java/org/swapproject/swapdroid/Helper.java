package org.swapproject.swapdroid;

public class Helper {
    private String identifier;
    private char gender;

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
