class Main{
    public static void main(String args[]){
        for( int i=1;i<=100;i++){
            System.out.println(i + "Is Prime "  +Prime(i));
        }
    }
    public static boolean Prime(int n){
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
            
        }
        return true;
    }

}

