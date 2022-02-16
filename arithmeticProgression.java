class Sequence{
    public int u1;
    public int d;

    public void Sequence(int u1, int d){
        this.u1 = u1;
        this.d = d;
    }

    public int getNum(int n){
        return this.u1+(n-1)*this.d;
    }
}

class arithmeticProgression{
    public static void main(String[] args){
        Sequence csc = new Sequence(1,2);
        int n=2;
        System.out.println(csc.getNum(n));
    }
}