package br.ufsm.csi.pp.prova;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @JSON
    public String getName() {
        return name;
    }

    @JSON
    public int getAge() {
        return age;
    }
}


