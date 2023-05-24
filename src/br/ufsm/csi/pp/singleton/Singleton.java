package br.ufsm.csi.pp.singleton;

public class Singleton{
    private static Singleton instance;

    private Singleton(){
    }

    //how to obtain an instance
    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    public void showMsg(){
        System.out.println("message");
    }


}

