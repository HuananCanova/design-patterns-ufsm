package br.ufsm.csi.pp.prova;

import java.lang.reflect.Method;

public class JSONConverter {
    public static String toJson(Object o){
        StringBuilder sb = new StringBuilder("{\n");
        Method[] methods = o.getClass().getDeclaredMethods();
        for (Method method: methods){
            if(method.isAnnotationPresent(JSON.class)){
                String propertyName = method.getName().substring(3);
                String propertyValue;

                try {
                    propertyValue = method.invoke(o).toString();
                } catch (Exception e) {
                    propertyValue = "null";
                }

                sb.append(" \"").append(propertyName).append("\":\"").append(propertyValue).append("\",\n");
            }
        }
        /*if (sb.charAt(sb.length() - 1) == ','){
            sb.deleteCharAt(sb.length() - 1);
        }*/
        sb.append("}");
        return sb.toString();
    }
}
