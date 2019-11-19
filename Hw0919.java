/*
 * Tsion Tadesse
 * COSC 311 Fall 2019
 * 11-19-19 
 */
import java.util.*;
import java.util.Hashtable;
import java.util.Random;
public class Hw0919{
    static int[] hashValues = new int [11];   
    public static void main(String[] args){
        Hw0919 hash = new Hw0919();
        Random r = new Random();    
        System.out.println("Hash program starts here:");
        for(int i=0; i<8; i++){
            int values = r.nextInt(99);
            hash.combineHash(values);            
        }
        for(int i=0; i<30; i++){
            System.out.print("*");
        }
        System.out.print("\n");
        hash.print();
        System.out.println("The program is ended");
    }
    public Hw0919(){
        for (int i=0; i<hashValues.length; i++){
            hashValues[i] = -1;
        }
    }

    private int fHash(int hKey){
        int val = -1;
        val = hKey%hashValues.length;
        return val;
    }
    
    public void combineHash(int hKey){
        int location = fHash(hKey);       
        hashValues[location] = hKey;
        System.out.println(hKey + " -> " + location);
    }

    public void print(){
        for (int i=0; i<hashValues.length; i++){
            System.out.println(hashValues[i]);
        }
    }
   
}