package br.ufsm.csi.pp.singleton;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();


        if (singleton1 == singleton){
            System.out.println("equal");
        }else{
            System.out.println("different");
        }
    }
}