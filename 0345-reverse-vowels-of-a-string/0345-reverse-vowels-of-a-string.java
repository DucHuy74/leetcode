class Solution {
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();

        int left = 0;
        int right = chars.length - 1;
        while(left < right){
            while(left < right && !isVowel(chars[left])){
                left++;
            }

            while(left < right && !isVowel(chars[right])){
                right--;
            }

            char tmp = chars[left];
            chars[left] = chars[right];
            chars[right] = tmp;

            left++;
            right--;
        }
        return new String(chars);
    }
    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
            || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}

/**
s -> char[]
left -> dau chuoi
right -> cuoi chuoi
left  != a, e, i, o, u -> left++
right != a, e, i, o, u -> right--
left & right = a, e, i, o, u -> swap
-> string
 */