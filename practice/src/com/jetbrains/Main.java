package com.jetbrains;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner sn=new Scanner("Hello/this is java class/for cse-27");
	System.out.println("Boolean result : "+sn.hasNextLine());
	sn.useDelimiter("/");
	System.out.println("----TOKENIZE STRING----");
	while(sn.hasNext()){
	    System.out.println(sn.next());
    }
   System.out.println("Delimiter used: "+sn.delimiter());
	sn.close();

    }
}
