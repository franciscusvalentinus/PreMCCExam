/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uc.technospire.premccexam;

/**
 *
 * @author franciscusvalentinus
 */

// Inheritance
//public class Cat {
//    String id;
//    String gender;
//    String age;
//    
//    public Cat(String id, String gender, String age){
//        this.id = id;
//        this.gender = gender;
//        this.age = age;
//    }
//    
//    void Introduce(){
//        System.out.println("Id kucing : " + id);
//        System.out.println("Jenis kelamin kucing : " + gender);
//        System.out.println("Usia kucing : " + age);
//    }
//}

// Encapsulation
class Cat{
    private String gender;
    private String age;
    
    public void setGenderAge(String a, String b){
        gender = a;
        age = b;
    }
    
    public String getGender(){
        return gender;
    }
    
    public String getAge(){
        return age;
    }
}