class Solution {
    public int maxDistance(int[] colors) {
        int maxdis=0;
        int l=0;
        int n=colors.length;
        int r=n-1;
        while(l!=r){
            if(colors[l]!=colors[r]){
                maxdis=Math.max(maxdis,r-l);
            }
            l+=1;
        }
        int i=0;
        int j=n-1;
        int md=0;
        while(i!=j){
            if(colors[i]!=colors[j]){
                md=Math.max(md,j-i);
            }
            j--;
        }
        return Math.max(md,maxdis);
    }
}