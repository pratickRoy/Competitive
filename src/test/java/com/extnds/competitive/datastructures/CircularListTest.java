package com.extnds.competitive.datastructures;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class CircularListTest {

    @Test
    public void test1() {

        CircularList<Integer> circularList = new CircularList<>();
        IntStream.range(0, 20)
            .boxed()
            .forEach(integer -> {
                if (integer < 10)
                    circularList.addNodeAtStart(integer);
                else
                    circularList.addNodeAtEnd(integer);
            });

        System.out.println(circularList.prettyPrint());
        assertEquals("9 8 7 6 5 4 3 2 1 0 10 11 12 13 14 15 16 17 18 19", circularList.prettyPrint());
    }

    @Test
    public void test2() {

        CircularList<Integer> circularList = new CircularList<>();
        IntStream.range(0, 20)
            .boxed()
            .forEach(integer -> {
                if (integer < 10)
                    circularList.addNodeAtEnd(integer);
                else
                    circularList.addNodeAtStart(integer);
            });

        System.out.println(circularList.prettyPrint());
        assertEquals("19 18 17 16 15 14 13 12 11 10 0 1 2 3 4 5 6 7 8 9", circularList.prettyPrint());
    }

    @Test
    public void test3() {

        CircularList<Integer> circularList = new CircularList<>();
        IntStream.range(0, 10)
            .boxed()
            .forEach(circularList::addNodeAtStart);

        System.out.println(circularList.prettyPrint());
        assertEquals("9 8 7 6 5 4 3 2 1 0", circularList.prettyPrint());
    }

    @Test
    public void test4() {

        CircularList<Integer> circularList = new CircularList<>();
        IntStream.range(0, 10)
            .boxed()
            .forEach(circularList::addNodeAtEnd);

        System.out.println(circularList.prettyPrint());
        assertEquals("0 1 2 3 4 5 6 7 8 9", circularList.prettyPrint());
    }
}