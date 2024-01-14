/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aolej
 */
public class Student extends Person{
    private int credits;
    
    public Student(String name, String addr) {
        super(name, addr);
        this.credits = 0;
    }
    
    public void study() {
        this.credits += 1;
    }
    
    public int credits() {
        return this.credits;
    }
    
    
    public String toString(){
        return this.getName() + "\n  " + this.getAddr() + "\n  Study credits " + this.credits();
    }
}
