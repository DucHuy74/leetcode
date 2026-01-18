class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int result = 0;
        for(int g: gain){
            max+=g;
            result = Math.max(max, result);
        }
        return result;
    }
}
