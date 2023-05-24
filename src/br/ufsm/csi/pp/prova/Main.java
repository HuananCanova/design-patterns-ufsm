package br.ufsm.csi.pp.prova;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Huanan", 22);
        String json = JSONConverter.toJson(person);
        System.out.println(json);


        /*Person person = new Person("Huanan", 22);
        Method[] declaredMethods = person.getClass().getDeclaredMethods();
        Field[] fields = person.getClass().getDeclaredFields();




        for (Field field: fields){
            System.out.println(field.getName());
        }


        //GET METHODS WITH ANNOTATION
        for (Method method: declaredMethods){
            if (method.isAnnotationPresent(JSON.class)){
                System.out.println(method.getName());
            }
        }*/
    }
}
