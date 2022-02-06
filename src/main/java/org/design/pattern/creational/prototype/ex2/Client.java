package org.design.pattern.creational.prototype.ex2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Date: 05/11/21
 * Time: 3:19 am
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public class Client {

    public static void main(String[] args) throws IOException, CloneNotSupportedException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter name: ");
        String name = bufferedReader.readLine();

        System.out.println("Enter occupation: ");
        String occupation = bufferedReader.readLine();

        System.out.println("Enter age: ");
        Integer age = Integer.parseInt(bufferedReader.readLine());

        EmpRecord empRecord = new EmpRecord(name, occupation, age);
        empRecord.show();

        EmpRecord cloned = empRecord.clone();
        cloned.show();

        System.out.println(empRecord.toString());
        System.out.println(cloned.toString());
        System.out.println(empRecord == cloned);
    }
}
