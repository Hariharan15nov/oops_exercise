package com.Hariharan;

public class ComplexOperation {
    private double real,imaginary;

    public ComplexOperation(double real, double imaginary) {
        this.real=real;
        this.imaginary=imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add(double real,double imaginary){
        this.real= (real+this.real);
        this.imaginary=(imaginary+this.imaginary);
    }

    public void add(ComplexOperation complexNumber){
        this.real=(complexNumber.getReal()+ this.real);
        this.imaginary=(complexNumber.getImaginary()+this.imaginary);
    }

    public void subtract(double real,double imaginary){
        this.real=(real-this.real);
        this.imaginary=(imaginary-this.imaginary);
    }

    public void subtract(ComplexOperation complexNumber) {
        this.real = (complexNumber.getReal() - this.real);
        this.imaginary = (complexNumber.getImaginary() + this.imaginary);
    }
}
