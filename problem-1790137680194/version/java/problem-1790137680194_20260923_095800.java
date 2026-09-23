// Last updated: 9/23/2026, 9:58:00 AM
1class Solution {
2    public int reverseDegree(String s) {
3     int total=0;
4     for(int i=0;i<s.length();i++){
5        char ch=s.charAt(i);
6        int reversedPos = 26 - (ch - 'a');
7        int stringPos = i + 1;
8        total += reversedPos * stringPos;
9     }
10     return total;
11    }
12}