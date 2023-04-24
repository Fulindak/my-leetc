package org.example.easy;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String minSize = getMinSizeString(strs);
        for (String i: strs) {
            while (!i.startsWith(minSize)){
               minSize =  minSize.substring(0, minSize.length()-1);
            }
        }
        return minSize;
    }
     public String getMinSizeString(String[] strs) {
         String minSizeString = strs[0];
         int position;
         int count = 0;
         for (int i = 1; i < strs.length; i++) {
             if(minSizeString.length() > strs[i].length()) {
                 minSizeString = strs[i];
             }
         }
         return minSizeString;
     }
}
