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
//}

// Polymorphism Overloading
//public class Cat {
//    String id;
//    String gender;
//    String age;
//    
//    public Cat(){
//        System.out.println("Create new object");
//    }
//    
//    public Cat(String id, String gender, String age){
//        this.id = id;
//        this.gender = gender;
//        this.age = age;
//    }
//    
//    void Introduce(){
//        System.out.println("Kucing tidak dapat diidentifikasi");
//    }
//    
//    void Introduce(String id, String gender, String age){
//        System.out.println("Id kucing : " + id);
//        System.out.println("Jenis kelamin kucing : " + gender);
//        System.out.println("Usia kucing : " + age);
//    }
//}

// Polymorphism Overriding
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
//class Cat{
//    private String gender;
//    private String age;
//    
//    public void setGenderAge(String a, String b){
//        gender = a;
//        age = b;
//    }
//    
//    public String getGender(){
//        return gender;
//    }
//    
//    public String getAge(){
//        return age;
//    }
//}

// Abstraction
abstract class Cat {
  abstract void hungry();

  public void meow() {
    System.out.println("meow");
  }
}

class BritishShortHair extends Cat {
  public void hungry() {
    System.out.println("meowww, i'm hungry");
  }
}