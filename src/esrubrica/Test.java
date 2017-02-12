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
 /**
  * con scanner
Scanner in=new Scanner(System.in);
      System.out.println("Inserisci il nome da aggiungere alla rubrica:");
      String c=in.next();
      System.out.println("Inserisci il numero di telefono:");
      String d=in.next();
      Voce a=new Voce(c,d); 
      Rubric b=new Rubric(a);
      System.out.println("Inserisci il nome da aggiungiere alla rubrica:");
      String e=in.next();
      System.out.println("Inserisci il numero di telefono:");
      String f=in.next();
      b.insert(e, f);
      System.out.println("Inserisci il nome da aggiungere alla rubrica:");
      String g=in.next();
      System.out.println("Inserisci il numero di telefono:");
      String h=in.next();
      b.insert(g,h);
      System.out.println(b.toString());
      System.out.println("Inserisci il nome da cercare:");
      String i=in.next();
      System.out.println(b.find(i));
      System.out.println("Inserisci il nome da eliminare dalla rubrica:");
      String l=in.next();
      b.remove(l);
      System.out.println(b.toString());
*/
