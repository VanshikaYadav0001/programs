class Main {
    public static void main(String[] args) {
        String arr[]={"a","aba","abc","abba"};
        for(int i=0;i<arr.length;i++){
            String rev = palindrome(arr[i]);
            
            if(rev.equals(arr[i])){
            System.out.println(arr[i]+rev+"true");
        }
        else{
            System.out.println(arr[i]+rev+"false");
        }
        }
        
    }
    public static String palindrome (String me){
        {String Reverse="";
        for(int i=me.length()-1;i>=0;i--){
            Reverse= Reverse+me.charAt(i);
            
        }
        return Reverse;
    }
}
}