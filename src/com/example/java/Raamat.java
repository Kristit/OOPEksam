package com.example.java;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by kristitammet on 25/01/2017.
 */
public class Raamat {

    String raamatukeel;
    ArrayList<String> sonaraamat = new ArrayList<>();

    public Raamat(String raamatukeel) {
        this.raamatukeel = raamatukeel;
    }

    public void misKeelesRaamatOn(String raamatukeel){

        System.out.println("See sõnaraamat on "+ raamatukeel + " keeles");

    }

        public void sisestaSona(String text){
            sonaraamat.add(sonaraamat.size(), text);

        }

    public String otsiEsimeseTaheJargi(String vaste ){
        char esimeneTaht = u.charAt(0);
        ArrayList <String> sobivaAlgusega = new ArrayList <String>();//seda ei tohi ¸les panna, sest siis ta lisab vast2 eelmistele v‰‰rutustele juurde, mitte ei tee uut
        for (int i = 0; i < sonaraamat.size(); i++) {
            if (sonaraamat.get(i).charAt(0) == vaste) {
                String tahegaSone = sonaraamat.get(i);
                sobivaAlgusega.add(tahegaSone);
            }
        }
        String [] sobivaAlgusegaString = new String[sobivaAlgusega.size()];
        for (int i = 0; i < sobivaAlgusega.size(); i++) {
            sobivaAlgusegaString[i] = sobivaAlgusega.get(i);
        }
        return sobivaAlgusegaString;



    }


      public void eemaldaSona( String text){
          sonaraamat.remove(text);

      }



}
