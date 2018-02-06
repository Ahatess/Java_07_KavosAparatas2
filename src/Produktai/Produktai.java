package Produktai;
import java.util.Scanner;
public class Produktai {
    private float cukrausKiekis = 0;    // gramais
    private float kavosKiekis = 0;      // gramais
    private float vandensKiekis = 0;    // mililitrais
    public Produktai(float cukrus, float kava, float vanduo){
        this.cukrausKiekis=cukrus;
        this.kavosKiekis=kava;
        this.vandensKiekis=vanduo;

    }

    public float getCukrausKiekis() {
        return cukrausKiekis;
    }

    public void setCukrausKiekis(float cukrausKiekis) {
        this.cukrausKiekis = cukrausKiekis;
    }

    public float getKavosKiekis() {
        return kavosKiekis;
    }

    public void setKavosKiekis(float kavosKiekis) {
        this.kavosKiekis = kavosKiekis;
    }

    public float getVandensKiekis() {
        return vandensKiekis;
    }

    public void setVandensKiekis(float vandensKiekis) {
        this.vandensKiekis = vandensKiekis;
    }
    public Produktai clone(Produktai originalas){
        Produktai clonas=new Produktai(originalas.getCukrausKiekis(),originalas.getKavosKiekis(),originalas.getVandensKiekis());
        return clonas;
    }
    public String toString(){
        return "kava"+ this.kavosKiekis+ "cukrus" +this.cukrausKiekis+ "vanduo" + this.vandensKiekis;
    }

}

