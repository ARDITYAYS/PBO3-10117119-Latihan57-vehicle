/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo310117119latihan57vehicle;

/**
 *
 * @author Yogaputra
 */
public class Vehicle {

    private String myBrand;
    private String myModel;

    public Vehicle() {
        this.myBrand = " ";
        this.myModel = " ";
    }

    public String getBrand() {
        return myBrand;
    }

    public void setBrand(String Brand) {
        this.myBrand = Brand;
    }

    public String getModel() {
        return myModel;
    }

    public void setModel(String Model) {
        this.myModel = Model;
    }

}
