/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esrubrica;

/**
 *
 * @author Riccardo
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Voce a=new Voce("gigio","3524754"); 
      Rubric b=new Rubric(a);
      b.insert("tobia", "3456789");
      b.insert("zio", "345789");
      b.insert("tobia", "345679");
      b.insert("zio", "345789");
      System.out.println(b.toString());
        System.out.println(b.find("tobia"));
        System.out.println(b.isEmpty());
        b.remove("gigio");
        System.out.println(b.toString());
        b.makeEmpty();
         System.out.println(b.toString());
        System.out.println(b.isEmpty());
        b.remove("ascoli");
    }
    
}
