package br.ufsm.csi.pp.reflection;

public class Cat {
    private final String name;private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @JSON
    public String getName() {
        System.out.println("TESTE GET NAME");
        return name;
    }

    @JSON
    public int getAge() {
        System.out.println("TESTE GET AGE");
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void meow(){
        System.out.println("meow from print");
    }


}
