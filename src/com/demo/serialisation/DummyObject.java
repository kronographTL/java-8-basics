package com.demo.serialisation;

import java.io.Serializable;

class DummyObject implements Serializable {
    // If we want to Serialize only the name and the school
    private String name;
    private String school;
    private static int standard;
    private transient  String address;

    public DummyObject(String name, String school, String address,int standard) {
        this.name = name;
        this.school = school;
        this.address = address;
        this.standard = standard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static int getStandard() {
        return standard;
    }

    public static void setStandard(int standard) {
        DummyObject.standard = standard;
    }

    @Override
    public String toString() {
        return "DummyObject{" +
                "Name ='" + name + '\'' +
                ", School='" + school + '\'' +
                ", Address='" + address + '\'' +
                ", Standard='" + standard + '\'' +
                '}';
    }
}
