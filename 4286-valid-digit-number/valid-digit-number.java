class Solution {
    public boolean validDigit(int n, int x) {
        String s=String.valueOf(n);
        System.out.println(s);
        if(Integer.valueOf(String.valueOf(s.charAt(0)))==x){
            return false;
        }
        else if(s.contains(String.valueOf(x))){
            return true;
        }
        return false;
    }
}