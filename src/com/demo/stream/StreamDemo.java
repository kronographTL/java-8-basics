package com.demo.stream;

import java.util.ArrayList;
import java.util.List;

public class StreamDemo {


    public static void main(String[] args) {

        // Demo example for the Use of flat map to falter the list of Apples
        List<List<Apple>>  listOfApples = StreamUtil.getListOfApples();
        System.out.println("Number of Green Apples : "+listOfApples.stream().flatMap(l -> l.stream().filter(a->"green".equals(a.getColour()))).count());
        System.out.println("Number of Red Apples : " +listOfApples.stream().flatMap(l->l.stream().filter(a->"red".equals(a.getColour()))).count());

        // Demo to show the use of Optional class


    }
}
