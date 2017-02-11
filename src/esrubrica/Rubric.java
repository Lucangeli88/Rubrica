/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esrubrica;

import java.util.ArrayList;

/**
 *
 * @author Riccardo
 */
public class Rubric implements Dictionary {
    private ArrayList <Voce> a;
    private boolean state=false;
    public Rubric (Voce e){
        a=new ArrayList <Voce>();
        a.add(e);
    }
    public boolean isEmpty(){
        if(a.size()==0)return true;
        return false;
    }
    public void makeEmpty(){
        a.clear();
    }
 
    public void insert(Comparable key, Object value){
            if(key==null)throw new IllegalArgumentException("Inserisci un nome");
            for(int i=0;i<=a.size()-1;i++){
                if(a.get(i).getNome().equals(key)){
                    a.get(i).setValore((String)value);
                    state=true;
                }
            }
            if(!state){
                Voce b=new Voce((String)key,(String)value);
                a.add(b);
            }
    } 
    public void remove(Comparable key){
            for(int i=0;i<=a.size()-1;i++){
                if(a.get(i).getNome().equals(key)){
                    a.remove(i);
                    state=true;
                }//if
            }//for
            if (!state)throw new DictionaryItemNotFoundException("Nome non trovato"); 
    }
    
    public String find(Comparable key){
        int b=0;
        int i;
        for(i=0;i<=a.size()-1;i++){
            if(a.get(i).getNome().equals(key)){
                b=i;
                i=a.size()-1;
            }        
          }
        if(b==0)throw new DictionaryItemNotFoundException("Nome non trovato");
        else  return "Il numero della persona cercata e`:"+a.get(b).getValore()+'\n';
    }
    public String toString(){
        String s="";
        for(int i=0;i<=a.size()-1;i++){
           s+=a.get(i).toString()+'\n';
        }
        return s;
    }
    
}
