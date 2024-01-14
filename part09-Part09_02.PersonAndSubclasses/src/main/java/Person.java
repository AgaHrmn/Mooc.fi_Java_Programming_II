/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aolej
 */
public class Person {

    private String name;
    private String addr;

    public Person(String name, String addr) {
        this.name = name;
        this.addr = addr;
    }

    public String toString() {
        return name + "\n  " + addr;
    }

    public String getName() {
        return this.name;
    }

    public String getAddr() {
        return this.addr;
    }
}
