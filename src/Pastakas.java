

import java.util.ArrayList;

/**
 * Created by kristitammet on 24/01/2017.

 */

/*

public class Pastakas {

    private int tindiKogus;

    public Pastakas(int tindiKogus) {
        this.tindiKogus = tindiKogus;
    }

    public void kirjuta(String sone) {
        //http://beginnersbook.com/2013/12/java-string-tochararray-method-example/
        for (char c : sone.toCharArray()) { //The method toCharArray() returns an Array of chars after converting a String into sequence of characters
            if (tindiKogus <= 0) {
                return;
            }
            System.out.print( c);
            tindiKogus--;
        }
        System.out.println();

    }

    public void prindiPaljuTintiAlles() {
        System.out.println("Tinti on: " + tindiKogus);
    }
}

*/


/*
    int tinti;

    public Pastakas(int tindiKogus) {
        tinti = tindiKogus;
    }

    public void kirjuta(String tekst){
        while (tinti > 0){
        String noCaps = tekst.replace(" ", "");
        if (tinti >= noCaps.length()){
            System.out.println(tekst);
            tinti = tinti-noCaps.length();
            prindiPaljuTintiAlles();
        }
        else{
            String almostOutOfInk = tekst.substring(0, tinti);
            for (int i = 0; i < almostOutOfInk.length()  ; i++) {
                String a = String.valueOf(almostOutOfInk.charAt(i));
                if (a.equals(" ")){
                    tinti +=1;
                }
            }
            System.out.println(tekst.substring(0, tinti));
            tinti = 0;
        }}
        }


    public void prindiPaljuTintiAlles(){
        System.out.println("Tinti on veel " +tinti+ " tähe jaoks");
    }
}*/