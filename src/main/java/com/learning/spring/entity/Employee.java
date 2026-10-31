package com.learning.spring.entity;

import java.util.List;
import java.util.Map;

public class Employee {

    private int id;
    private String name, gender;
    private Address address;

    private List<Integer> list;
    private List<Integer> set;
    private Map<Integer, String> map;

    public Employee() {
        super();
    }

    public Employee(int id, String name, String gender, Address address, List<Integer> list, List<Integer> set,
            Map<Integer, String> map) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.list = list;
        this.set = set;
        this.map = map;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Integer> getList() {
        return list;
    }

    public void setList(List<Integer> list) {
        this.list = list;
    }

    public List<Integer> getSet() {
        return set;
    }

    public void setSet(List<Integer> set) {
        this.set = set;
    }

    public Map<Integer, String> getMap() {
        return map;
    }

    public void setMap(Map<Integer, String> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", address=" + address + ", list="
                + list + ", set=" + set + ", map=" + map + "]";
    }

}
