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
public class Voce implements Comparable <Voce>{
    private String nome;
    private String valore;
    public Voce (String nome,String valore){
        this.nome=nome;
        this.valore=valore;
    }
    public String toString(){
        return "Il nome e`:"+nome+", il numero e`:"+valore;
    }
    public int compareTo(Voce o){
        if(nome.equals(o.nome))return 0;
        return -1;
    }
    public String getNome(){
        return nome;
    }
    public String getValore(){
        return valore;
    }
    public void setValore(String valore){
        this.valore=valore;
    }
    
}
