package com.syifa.a140810160026;

/**
 * Created by yana on 11-Apr-18.
 */

public class Convert {

    double c,r,f,k;

    public void KonversiCelcius(double c){
        this.c = c;
        this.r = c * 4/5;
        this.f = (c * 9/5) + 32;
        this.k = c+273;
    };

    public void KonversiReamur(double r){
        this.c = r * 5/4;
        this.r = r;
        this.f = (r * 9/4) + 32;
        this.k = this.c +273;
    };

    public void KonversiFarenheit(double f){
        this.c = (f - 32) * 5/9;
        this.r = (f - 32) * 4/9;
        this.f = f;
        this.k = (f - 32) * 5/9 + 273;
    };

    public void KonversiKelvin(double k){
        this.c = k - 273;
        this.r = (k - 273) * 4/5;
        this.f = (k - 273) * 9/5 + 32;
        this.k = k;
    };

    public double getCelcius() {
        return c;
    }

    public double getFarenheit() {
        return f;
    }

    public double getKelvin() {
        return k;
    }

    public double getReamur() {
        return r;
    }
}
