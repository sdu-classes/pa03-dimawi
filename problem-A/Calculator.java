class Calculator{
    public int arip1;
    public int arip2;
    public Calculator(double a1, double a2){
        try{
            if((int)a1 != a1 || (int)a2 != a2) throw new NumberFormatException();
            else{
                this.arip1 = (int) a1;
                this.arip2 = (int) a2;
            }
        }catch(NumberFormatException n){
            n.printStackTrace();
        }
    }
    public int add(){
        try{
            if(arip1<0 || arip2<0) throw new ArithmeticException();
            else return arip1+arip2;
        }catch(ArithmeticException a){
            a.printStackTrace();
            return 1;
        }
    }
    public int subtract(){
        try{
            if(arip1<0 || arip2<0) throw new ArithmeticException();
            else return arip1 - arip2;
        }catch(ArithmeticException a){
            a.printStackTrace();
            return 1;
        }
    }
    public int multiplication(){
        try{
            if(arip1==0 || arip2==0) throw new ArithmeticException();
            else return arip1 * arip2;
        }catch(ArithmeticException a){
            a.printStackTrace();
            return 1;
        }
    }
    public int division(){
        try{
            if(arip1==0 || arip2==0) throw new ArithmeticException();
            else return arip1 / arip2;
        }catch(ArithmeticException a){
            a.printStackTrace();
            return 1;
        }
    }
}
