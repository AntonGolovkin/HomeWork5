package ru.geekbrains.hw5;

public class Worker {
    public String name;
    public String position;
    public String email;
    public String phoneNumber;
    public int salary;
    public int age;



    public Worker(String name, String position, String email, String phoneNumber, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void info(){
        System.out.println(name + " " + position + " " + email + " " + phoneNumber + " " + salary + " " + age);
    }

}
