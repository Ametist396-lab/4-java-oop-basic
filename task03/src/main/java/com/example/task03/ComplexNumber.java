package com.example.task03;

import java.awt.event.ComponentListener;

public class ComplexNumber {
    private double real_part;
    private double imaginary_part;

    public ComplexNumber(double real_part, double imaginary_part){
        this.real_part = real_part;
        this.imaginary_part = imaginary_part;
    }

    public ComplexNumber addition(ComplexNumber number){
        double real_part_new = this.real_part + number.real_part;
        double imaginary_part_new = this.imaginary_part + number.imaginary_part;
        return new ComplexNumber(real_part_new, imaginary_part_new);
    }

    public ComplexNumber multiplication(ComplexNumber number){
        double real_part_new = this.real_part * number.real_part - this.imaginary_part * number.imaginary_part;
        double imaginary_part_new = this.real_part * number.imaginary_part + this.imaginary_part * number.real_part;
        return new ComplexNumber(real_part_new, imaginary_part_new);
    }

    @Override
    public String toString() {
        return real_part + " + " + imaginary_part + "i";
    }
}
