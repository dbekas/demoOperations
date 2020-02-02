package com.codehub.demoOperations.controller;

import java.io.*;

public class Service {
    public int getSum(int a, int b){
        return a+b;
    }
    public int getProduct(int a, int b){
        return a*b;
    }
    public int getMax(int a, int b){
        if(a>b)
        return a;
        else return b;
    }
    public int getMin(int a, int b){
        if(a<b)
        return a;
        else return b;
    }

    public String getOperations(int a, int b){
        return "Sum is : " + getSum(a, b) +"<br>" +
                "Product is : " + getProduct(a, b) + "<br>" +
                "Max of the two is : " + getMax(a, b) + "<br>" +
                "Min of the two is : " + getMin(a, b);
    }
    public void saveToHistory(int a, int b) throws IOException {
        PrintWriter pw;
        FileWriter fw =  new FileWriter(new File("history.txt"), true);
        pw = new PrintWriter(fw);
        pw.println(a+" "+b);
        pw.close();
    }

    public StringBuilder showHistory(String filename) throws IOException {
            StringBuilder sb = new StringBuilder();
            File file = new File(filename);
            BufferedReader br = new BufferedReader(new FileReader(file));
            String st;
            while ((st = br.readLine()) != null) {
                sb.append(st).append("<br>");
            }
            return sb;
        }

}
