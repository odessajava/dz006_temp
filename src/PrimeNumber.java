public class PrimeNumber {
    public boolean simple(int a){
        boolean flag=false;
        int sum=0; if (a==1 || a==2) {
            flag = true;
        }
        else{

            for (int i = 0; i <= 100; i++) {
                sum = a%i;
                if(sum==0){
                    flag=true;
                    break;
                }
            }
        }


        return flag;

    }
}
