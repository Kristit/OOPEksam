

import java.util.ArrayList;

/**
 * Created by kristitammet on 25/01/2017.
 */


public class Sonaraamat {

    String raamatukeel;

    ArrayList<String> sonaraamat = new ArrayList<>();

    public Sonaraamat(String raamatukeel) {

        this.raamatukeel = raamatukeel;
    }

    public void misKeelesRaamatOn() {

        System.out.println("See sõnaraamat on " + raamatukeel + " keeles");

    }

    public void sisestaSona(String text) {
        sonaraamat.add(sonaraamat.size(), text);

    }

    public String[] otsiEsimeseTaheJargi(String vaste) {
        ArrayList<String> vastus = new ArrayList<>();
        for (String sona : sonaraamat) {
            if (sona.startsWith(vaste)) {
                vastus.add(sona);
            }
        }
        return vastus.toArray(new String[vastus.size()]);


    }


    public void eemaldaSona(String text) {
        sonaraamat.remove(text);

    }


}