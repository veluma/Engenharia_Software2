package com.es2.memento;

import java.util.ArrayList;

public class Memento {
    private java.util.ArrayList<java.lang.String> state;


    public Memento(java.util.ArrayList<java.lang.String> studentNames){
        this.setState(new ArrayList<>(studentNames));

    }

    public ArrayList<String> getState() {
        return state;
    }

    public void setState(ArrayList<String> state) {
        this.state = state;
    }
}
