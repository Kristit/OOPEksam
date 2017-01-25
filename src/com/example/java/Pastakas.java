package com.example.java;

import java.util.ArrayList;

/**
 * Created by kristitammet on 24/01/2017.
 * <p>
 * <p>
 * <p>
 * pastakas.kirjuta("Elu oleks palju lihtsam, kui meil oleks selle lähtekood.");
 * <p>
 * pastakas.prindiPaljuTintiAlles();
 * <p>
 * pastakas.kirjuta("Õiged progejad ei kommenteeri oma koodi. Kui seda oli raske kirjutada, siis peab olema seda ka raske lugeda!");
 * <p>
 * }
 */
public class Pastakas {

    int tindiKogus = 60;
    int tint;
    int kulutatudTint;
    int tintiAlles;

    public Pastakas(int tindiKogus) {
        tint = this.tindiKogus;

    }


    public void kirjuta(String text) {
        System.out.println(text);
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (!Character.isSpaceChar(c)) {
                count++;
            }

        }
        kulutatudTint = count;

    }


    public void prindiPaljuTintiAlles() {
        tintiAlles = tint - kulutatudTint;
        System.out.println("Tinti on alles: " + tintiAlles+ " ühikut.");

    }
}

