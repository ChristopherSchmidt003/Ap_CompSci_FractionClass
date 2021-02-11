class Fraction {
    
    private int num;
    private int den;
    
    //Constructors
    
    public Fraction() {
        num = 1;
        den = 2;
    }
    
    public Fraction(int n, int d) {
        num = n;
        if (d == 0) {
            den = 1;
            System.out.println("ERROR, denominator cannot be zero");
        } else {
            den = d;
        }
    }
    
    public Fraction(String f) {
        int slashIndex = f.indexOf("/");
        String n = f.substring(0, slashIndex);
        String d = f.substring(slashIndex+1, f.length());
        
        this.num = Integer.parseInt(n);
        int tempd = Integer.parseInt(d);
        if (tempd == 0) {
            System.out.println("ERROR, denominator cannot be zero");
            this.den = 1;
        } else {
            this.den = tempd;
        }
    }
    
    public Fraction(Fraction f) {
        this.num = f.num;
        this.den = f.den;
    }
    
    //Accessors
    
    public int getNum(){
        return this.num;
    }
    
    public int getDen() {
        return this.den;
    }
    
    public String toString() {
        return this.num + "/" + this.den;
    }
    
    public Double toDouble() {
        double n = this.num;
        double d = this.den;
        return n/d;        
    }
    
    //Mutators
    
    public void setNum(int n) {
        this.num = n;
    }
    
    public void setDen(int d) {
        if (den != 0) this.den = d;
        else {
            System.out.println("ERROR, denominator cannot be zero");
        }
    }
    
    public void reduce() {
        int n = this.getNum();
        int d = this.getDen();
        int gcf = Euclid(this);
        
        n = this.getNum()/gcf;
        d = this.getDen()/gcf;
        
        this.setNum(n);
        this.setDen(d);
    }
    
    //Static methods
    
    public static Fraction multiply (Fraction a, Fraction b) {
        int newNum = a.getNum() * b.getNum();
        int newDen = a.getDen() * b.getDen();
        Fraction f = new Fraction (newNum, newDen);
        f.reduce();
        return f;
    }
    
    public static Fraction divide (Fraction a, Fraction b) {
        int newNum = a.getNum() * b.getDen();
        int newDen = a.getDen() * b.getNum();
        Fraction f = new Fraction (newNum, newDen);
        f.reduce();
        return f;
    }
    
    public static Fraction add (Fraction a, Fraction b) {
        if (a.num == 0){
            System.out.println("Error canno divide by zero");
            return a;
        }
        if (b.num == 0){
            System.out.println("Error canno divide by zero");
            return b;
        }
        
        int anum = a.num*b.den;
        int bnum = b.num*a.den;
        int newNum = anum + bnum;
        int newDen = a.den * b.den;
        Fraction f = new Fraction (newNum, newDen);
        f.reduce();
        return f;
    }
    
    public static Fraction subtract (Fraction a, Fraction b) {
        int anum = a.num*b.den;
        int bnum = b.num*a.den;
        int newNum = anum - bnum;
        int newDen = a.den * b.den;
        Fraction f = new Fraction (newNum, newDen);
        f.reduce();
        return f;
    }
    
    //Helpers
    
    public int Euclid (Fraction f){
        int n = Math.abs(f.getNum());
        int d = Math.abs(f.getDen());
        
        if (d == 0){
            return 1;
        }
        
        while (n != d) {
            if (n > d) {
                n = n - d;
            } else {
                d = d - n;
            }
        }
        int gcf = n;
        return gcf;
    }
}