package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	Worker Armaan = new hiredContractor(new Name ("Armaan"));
    Worker Aleksei = new Employee(new Name ("Aleksei"));
    Worker Elias = new hiredContractor(new Name ("Elias"));
    Worker Akshat = new Employee(new Name ("Akshat"));

    Worker [] workers = {Akshat, Armaan, Aleksei, Elias};
    Worker [] workers2 = {Akshat, Aleksei, Elias};

    Task first = new Task(new Name ("Computer science project"),workers);
    Task second = new Task (new Name ("CS project 2"), workers2);

    Task [] tasks = {first, second};

    Project thisHomework = new Project(1, tasks);

    System.out.println(thisHomework);

    }
}

class Project
{
    public Project(int uniqueIdentifier, Task [] tasks)
    {
        this.uniqueIdentifier = uniqueIdentifier;
        this.tasks = tasks;
    }

    public String toString ()
    {
        return "[" + uniqueIdentifier + "] : " +  Arrays.toString(tasks);
    }

    private final int uniqueIdentifier;
    public Task [] tasks;
}

class Task
{
    public Task(Name name, Worker [] workers)
    {
        this.name = name;
        this.workers = workers;
    }

    public String toString()
    {
        return name + ": " + Arrays.toString(workers);
    }

    public Name name;
    public Worker [] workers;
}

class Name
{
    public Name(String name)
    {
        this.name = name;
    }

    public String toString()
    {
        return name;
    }
    public String name;
}

class Worker
{
    public Worker (Name name)
    {
        this.name = name;
    }

    protected Name name;
}

class hiredContractor extends Worker
{
    public hiredContractor(Name name)
    {
        super(name);
    }

    public String toString()
    {
        return "(" + name + ": Hired contractor)";
    }
}

class Employee extends Worker
{
    public Employee(Name name)
    {
        super (name);
    }

    public String toString()
    {
        return "(" + name + ": Employee)";
    }
}