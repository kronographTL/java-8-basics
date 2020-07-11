package com.demo.serialisation;

import java.io.*;

public class SerialisationDemo {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        DummyObject beforeSerialize = new DummyObject("Anil", "HKUST","New Delhi",8);

        System.out.println("The values of the objects at the time of Initialisation :- " + beforeSerialize.toString());
        //The values of the objects at the time of Initialisation :- DummyObject{Name ='Anil', School='HKUST', Address='New Delhi', Standard='8'}
        FileOutputStream file = new FileOutputStream("myFile.ser");
        ObjectOutputStream outputStream = new ObjectOutputStream(file);
        outputStream.writeObject(beforeSerialize);

        FileInputStream file2 = new FileInputStream("myFile.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(file2);
        DummyObject afterSerialize = (DummyObject) objectInputStream.readObject();

        System.out.println("The Values after the object is Deserialize :- "+afterSerialize.toString());
        //The Values after the object is Deserialize :- DummyObject{Name ='Anil', School='HKUST', Address='null', Standard='8'}

    }
}
