package com.syed.day7;

public class StringB {
    public static void main(String[] args){
        String name = "Syed";
        name = name + " Ibrahim";
        System.out.println(name);
        StringBuffer sb = new StringBuffer("Syed");
        sb.append(" Hakeem");
        System.out.println(sb);
        StringBuilder sbl = new StringBuilder("Afrin");
        sbl.append(" Fathima");
        System.out.println("Name is " + sbl);
    }
}
