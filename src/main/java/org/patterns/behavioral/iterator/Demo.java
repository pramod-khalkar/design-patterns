package org.patterns.behavioral.iterator;

/**
 * Date: 21/11/21
 * Time: 11:23 am
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class Demo {

    public static void main(String[] args) {
        Repository repository = new Repository();
        Iterator<?> iterator = repository.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
