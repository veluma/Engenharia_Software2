package com.es2.memento;

import java.util.ArrayList;

public class Server {

    private ArrayList<String> studentNames = new ArrayList<>();

    public void addStudent(java.lang.String studentName)
            throws ExistingStudentException{
        if (studentNames.contains(studentName)) {
            throw new ExistingStudentException();
        }
        studentNames.add(studentName);

    }

    public Server() {
    }

    public Memento backup(){
        return new Memento(studentNames);
    }

    public void restore(Memento state){
        studentNames = state.getState();
    }

    public ArrayList<String> getStudentNames() {
        return studentNames;
    }

    public void setStudentNames(ArrayList<String> studentNames) {
        this.studentNames = studentNames;
    }
}
