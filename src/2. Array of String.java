class Main {
    public static void main(String[] args) {
        String arr[]={"a","aba","abc","abba"};
        for(int i=0;i<arr.length;i++){
            System.out.println(palindrome (arr[i]));
        }
        
    }
    public static Boolean palindrome (String me){
        {String Reverse="";
        for(int i=me.length()-1;i>=0;i--){
            Reverse= Reverse+me.charAt(i);
            
        }
        
        if(Reverse.equals(me)){
            return true;
        }
        else{
            return false;
        }
    }
}
}

