package com.extnds.competitive.datastructures;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class CircularList<T> {

    private final List<T> list;

    public CircularList() {
        list = new ArrayList<>();
    }

    public CircularList(final List<T> list) {
        this();
        this.list.addAll(list);
    }

    public void addNodeAtStart(T data) {

        list.add(0, data);
    }

    public void addNodeAtEnd(T data) {

        list.add(data);
    }

    public T getNodeAt(int index) {
        return containsNodeAt(index) ? list.get(index) : null;
    }

    public boolean containsNodeAt(int index) {
        return index >= 0 && index < list.size();
    }

    public int getSize() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public String prettyPrint() {

        return getSingleLoopStream(0)
            .map(Object::toString)
            .collect(Collectors.joining(" "));
    }

    public Iterator<T> getSingleLoopIterator(final int startPosition) {

        if (startPosition < 0 || startPosition >= list.size()) {
            throw new IllegalArgumentException("Invalid Start Position");
        }
        return new Iterator<T>() {

            int visitedCount = 0;
            boolean hasAllNodesBeenVisited = false;
            int iteratorPosition = startPosition - 1;

            @Override
            public boolean hasNext() {
                return !(list.isEmpty() || hasAllNodesBeenVisited);
            }

            @Override
            public T next() {

                if (iteratorPosition == list.size() - 1) {
                    iteratorPosition = 0;
                } else {
                    iteratorPosition++;
                }
                hasAllNodesBeenVisited = ++visitedCount >= list.size();
                return list.get(iteratorPosition);
            }
        };
    }

    public Stream<T> getSingleLoopStream(final int startPosition) {

        return StreamSupport.stream(
            Spliterators.spliteratorUnknownSize(
                getSingleLoopIterator(startPosition),
                Spliterator.ORDERED
            ),
            false
        );
    }
}

