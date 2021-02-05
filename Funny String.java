public class FunnyString {
    static int[] getAscii(String a){
        int n = a.length();
        int[] arr =new int[n];
        for (int i=0; i<n; i++){
            char character = a.charAt(i);
            int ascii = (int) character;
            arr[i] = ascii;
        }
        return arr;
    }
    
    static String funnyString(String s) {
        int n = s.length();
        int[] arr = getAscii(s);  
        int[] dif = new int[n-1];
        for(int i=0; i<n-1; i++){
            dif[i]=Math.abs(arr[i]-arr[i+1]);
        }  
        int k =0;
        for(int i=n-1; i>=1; i--){
            int temp=Math.abs(arr[i]-arr[i-1]);
            if(dif[k++]!=temp){
                return "Not Funny";
            }
        }
        
        return "Funny";
    }
