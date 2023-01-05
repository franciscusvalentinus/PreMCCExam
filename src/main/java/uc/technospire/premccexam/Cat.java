/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uc.technospire.premccexam;

/**
 *
 * @author franciscusvalentinus
 */
public class Cat {
    String id;
    String gender;
    String age;
    
    public Cat(String id, String gender, String age){
        this.id = id;
        this.gender = gender;
        this.age = age;
    }
    
    void Introduce(){
        System.out.println("Id kucing : " + id);
        System.out.println("Jenis kelamin kucing : " + gender);
        System.out.println("Usia kucing : " + age);
    }
}
