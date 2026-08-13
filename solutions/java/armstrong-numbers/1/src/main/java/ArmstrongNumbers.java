class ArmstrongNumbers {

    boolean isArmstrongNumber(int n) {
int len=String.valueOf(n).length();
        int sum=0,r=0,t=n;
        while(n>0){
            r=n%10;
            sum+=Math.pow(r,len);
            n/=10;
        }
        return t==sum;
    }

}
