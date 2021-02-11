class FractionDriver {
    public static void main(String[] args){
        Fraction frac1 = new Fraction();
        System.out.print(frac1.getNum() + " ");
        System.out.println(frac1.getDen());
        
        Fraction frac2 = new Fraction(3, 2);
        System.out.print(frac2.getNum() + " ");
        System.out.println(frac2.getDen());
        
        Fraction frac3 = new Fraction("5/3");
        System.out.print(frac3.getNum() + " ");
        System.out.println(frac3.getDen());
        
        Fraction frac4 = new Fraction(frac2);
        System.out.print(frac4.getNum() + " ");
        System.out.println(frac4.getDen());
        
        System.out.println("");
        
        Fraction frac5 = new Fraction (252, 105);
        System.out.print(frac5.getNum() + " ");
        System.out.println(frac5.getDen());
        frac5.reduce();
        System.out.println(frac5.toString());
        System.out.println(frac5.toDouble());
        System.out.println("");
        
        Fraction f1 = new Fraction(4, 3);
        Fraction f2 = new Fraction(15, 24);
        System.out.println(Fraction.multiply(f1, f2));
        
        f1 = new Fraction(3, 7);
        f2 = new Fraction(9, 16);
        System.out.println(Fraction.divide(f1, f2));
        
        f1 = new Fraction(3,8);
        f2 = new Fraction(1,4);
        System.out.println(Fraction.add(f1, f2));
        System.out.println(Fraction.subtract(f1, f2));
    }
}