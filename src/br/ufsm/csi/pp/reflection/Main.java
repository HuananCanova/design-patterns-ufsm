package br.ufsm.csi.pp.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, IllegalAccessException {
        Cat cat = new Cat("Damon", 22);
        Field[] catFields = cat.getClass().getDeclaredFields();

        for (Field field : catFields) {
            System.out.println(field.getName());
        }

        Method[] declaredMethods = cat.getClass().getDeclaredMethods();
        for (Method method: declaredMethods){
            if (method.getName().equals("meow")){
                method.invoke(cat);
            }
            System.out.println(method.getName());
        }

        for(Method method : cat.getClass().getDeclaredMethods()){
            if(method.isAnnotationPresent(JSON.class)){
                method.getName();
            }
        }



        }
}
