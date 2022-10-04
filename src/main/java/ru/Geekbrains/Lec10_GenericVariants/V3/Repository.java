package ru.Geekbrains.Lec10_GenericVariants.V3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Repository<T extends Content> implements Iterable<T>{
    List<T> ds;

    private String name;

    public Repository(String name) {
        this.ds = new ArrayList<>();
        this.name = name;
        System.out.printf("\n  >>  %s created\n",this.name);
    }

    public void add(T content) {
        ds.add(content);
    }

    public int count() {
        return ds.size();
    }

    public T get(Integer index) {
        return ds.get(index);
    }

    // В качестве тренировки реализуйте возможность работы с foreach
    @Override
    public Iterator<T> iterator() {
        return new Iterator<>() {
            private int counter = 0;
            @Override
            public boolean hasNext() {
                return counter < ds.size();
            }

            @Override
            public T next() {
                return ds.get(counter++);
            }
        };
    }


}