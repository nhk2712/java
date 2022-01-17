class sequence{
    // u(n) = a*u(n-1)+b
    static void find(int u1,int a,int b){
        if (a==1){
            System.out.print("u(n)=");
            System.out.print(u1);
            System.out.print("+(n-1)*");
            System.out.print(b);
        }
        else{
            System.out.print("u(n)=");
            System.out.print(u1);
            System.out.print("*");
            System.out.print(a);
            System.out.print("^(n-1)+");
            System.out.print(b/(a-1));
            System.out.print("*(");
            System.out.print(a);
            System.out.print("^(n-1)-1");
            System.out.print(")");
        }
    }

    public static void main(String[] args){
        int u1=1;
        int a=2;
        int b=2;
        find(u1,a,b);
    }
}