package com.tuncaysahin.JAVA.DataStructures;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class JavaPriorityQueue {

    class Checker implements Comparator<Student> {
        public int compare(Student t1,Student t2){
            if(t1.getCGPA() == t2.getCGPA()){
                int x = t1.getName().compareTo(t2.getName());
                if(x == 0){
                    return t1.getId() > t2.getId() ? -1 : 1;
                }
                return x;
            }
            return t1.getCGPA() > t2.getCGPA() ? -1 : 1;
        }
    }

    class Student {
        private int id;
        private String name;
        private double cgpa;
        public Student(int id,String name,double cgpa){
            this.id = id;
            this.name = name;
            this.cgpa = cgpa;
        }
        public int getId(){
            return id;
        }
        public String getName(){
            return name;
        }
        public double getCGPA(){
            return cgpa;
        }

    }

    class Priorities {
        public List<Student> getStudents(List<String> events){
            PriorityQueue<Student> list = new
                    PriorityQueue<Student>(events.size(),new Checker());

            String[] arr;
            for(int i = 0; i < events.size() ; i++){

                arr = events.get(i).split(" ");
                if(arr[0].equals("ENTER")){
                    list.add(new Student(Integer.parseInt(arr[3]),arr[1],Double.parseDouble(arr[2])));
                }else{
                    list.poll();
                }

            }
            return new LinkedList<Student>(list);
        }
    }

}
