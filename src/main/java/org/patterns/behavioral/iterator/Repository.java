package org.patterns.behavioral.iterator;

/**
 * Date: 21/11/21
 * Time: 11:20 am
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class Repository implements Container {

    private final String[] names = new String[] {"pramod", "khalkar", "Shinde", "Rajesh", "Prakash"};

    @Override
    public Iterator<?> getIterator() {
        return new RepoIterator();
    }

    class RepoIterator implements Iterator<String> {

        private int index = 0;

        @Override
        public boolean hasNext() {
            if (index < names.length) {
                return true;
            }
            return false;
        }

        @Override
        public String next() {
            return names[index++];
        }
    }
}
