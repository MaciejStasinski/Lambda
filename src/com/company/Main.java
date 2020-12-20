package com.company;

@FunctionalInterface
interface rownaniaKwadratowe {
    double oblicz(double b,double a, double c);
}
public class Main {

    public static void main(String[] args) {
        rownaniaKwadratowe delta=(b,a,c)->{ return (b*b-4*a*c);};
        rownaniaKwadratowe x1=(b,a,c) ->  { return ( ((-b-Math.sqrt(delta.oblicz(b,a,c)))/(2*a))  );};
        rownaniaKwadratowe x2=(b,a,c) -> { return ( ((-b+Math.sqrt(delta.oblicz(b,a,c)))/(2*a))  );};

        System.out.println("Delta jest równa: "+ delta.oblicz(10,4,5));
        System.out.println("Pierwiastek x1 jest równy: " +x1.oblicz(10,4,5));
        System.out.println("Pierwiastek x2 jest równy: " +x2.oblicz(10,4,5));
    }
}
