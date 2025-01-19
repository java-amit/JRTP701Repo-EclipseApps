package com.nt.service;



public class App {
	
	public int sum (int a, int b){
		return a+b;
	}
    public static void main(String[] args) {
    	App app = new App();
        System.out.println("sum is::"+app.sum(10, 20));
    }
}
