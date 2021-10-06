/*Given a String S, reverse the string without reversing its individual words. Words are separated by dots.

Example 1:

Input:
S = i.like.this.program.very.much
Output: much.very.program.this.like.i
Explanation: After reversing the whole
string(not individual words), the input
string becomes
much.very.program.this.like.i */

class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
        String str="";
        String[] arr = S.split("\\.");
        for(int i=0; i<arr.length/2; i++) {
            String temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
        
        str = String.join(".",arr);
        return str;
    }
}
