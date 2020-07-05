package com.demo.stream;

import java.util.ArrayList;
import java.util.List;

public class StreamUtil {

    public static List<List<Apple>> getListOfApples() {

        List<List<Apple>> returnList = new ArrayList<>();
        List<Apple> apples1 = new ArrayList<>();
        apples1.add(new Apple("green"));
        apples1.add(new Apple("red"));
        apples1.add(new Apple("green"));
        apples1.add(new Apple("green"));
        apples1.add(new Apple("red"));
        List<Apple> apples2 = new ArrayList<>();
        apples2.add(new Apple("red"));
        apples2.add(new Apple("green"));
        apples2.add(new Apple("green"));
        apples2.add(new Apple("red"));
        apples2.add(new Apple("green"));
        List<Apple> apples3 = new ArrayList<>();
        apples3.add(new Apple("green"));
        apples3.add(new Apple("green"));
        apples3.add(new Apple("red"));
        apples3.add(new Apple("green"));
        apples3.add(new Apple("green"));
        List<Apple> apples4 = new ArrayList<>();
        apples4.add(new Apple("green"));
        apples4.add(new Apple("green"));
        apples4.add(new Apple("green"));
        apples4.add(new Apple("red"));
        apples4.add(new Apple("green"));
        List<Apple> apples5 = new ArrayList<>();
        apples5.add(new Apple("green"));
        apples5.add(new Apple("red"));
        apples5.add(new Apple("red"));
        apples5.add(new Apple("red"));
        apples5.add(new Apple("red"));
        returnList.add(apples1);
        returnList.add(apples2);
        returnList.add(apples3);
        returnList.add(apples4);
        returnList.add(apples5);
        return returnList;
    }
}
