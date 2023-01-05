/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package uc.technospire.premccexam;

/**
 *
 * @author franciscusvalentinus
 */
public class PreMCCExam {

    public static void main(String[] args) {
        // inheritance
//        Persia simon = new Persia("1", "Male", "24", "Persia");
//        simon.Introduce();
//        simon.IntroducePersia();
//        
//        System.out.println("");
//        
//        Cat joko = new Cat("2", "Male", "12");
//        joko.Introduce();

        // encapsulation
        Cat joko = new Cat();
        joko.setGenderAge("Male", "24");
        System.out.println(joko.getGender());
        System.out.println(joko.getAge());
    }
}
