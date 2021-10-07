/*Find longest Common Prefix that common in all strings*/

public class Main
{
    String longestCommonPrefix(String arr[], int n){
        if(n==0) return "";
        if(n==1) return arr[0];
        String str = "";
        Arrays.sort(arr);
        int last = Math.min(arr[0].length(), arr[n-1].length());
        
        int i=0;
        while(i<last && arr[0].charAt(i) == arr[n-1].charAt(i)) i++;
        str = arr[0].substring(0,i);
        return str;
    }
  }
