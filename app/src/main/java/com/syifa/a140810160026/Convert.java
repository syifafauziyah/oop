package com.syifa.a140810160026;

/**
 * Created by yana on 11-Apr-18.
 * Improved by fahmi on 16-Apr-2018
 */

public class Convert {

    private String satuan;
    private double currentVal;
    private double valInCelcius;

    public Convert(double val, String satuan) {
        this.satuan = satuan;
        this.currentVal = val;
        this.convertToCelcius();
    }

    private void convertToCelcius() {
        switch (this.satuan) {
            case Keys.CELCIUS:
                this.valInCelcius = this.currentVal;
                break;

            case Keys.REAMUR:
                this.valInCelcius = this.currentVal * 5/4;
                break;

            case Keys.KELVIN:
                this.valInCelcius = this.currentVal - 273;
                break;

            case Keys.FAHRENHEIT:
                this.valInCelcius = (this.currentVal - 32) * 5/9;
                break;

            default:
                break;
        }
    }


    public double getCelcius() {
        return this.valInCelcius;
    }

    public double getFarenheit() {
        return (this.getCelcius() * 9/5) + 32;
    }

    public double getKelvin() {
        return this.getCelcius() + 273;
    }

    public double getReamur() {
        return this.getCelcius() * 4/5;
    }
}
