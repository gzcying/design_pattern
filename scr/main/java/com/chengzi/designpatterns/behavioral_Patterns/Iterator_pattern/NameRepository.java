package com.chengzi.designpatterns.behavioral_Patterns.Iterator_pattern;

/**
 * @author chengzi
 * 2019/7/4
 */
public class NameRepository implements Container {
    public String names[] ;

    public NameRepository(String[] names) {
        this.names = names;
    }

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private  class NameIterator implements Iterator {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < names.length;
        }

        @Override
        public Object next() {
            if(hasNext()) {
                return names[index++];
            }else{
                return null;
            }
        }
    }

}
