class Solution {
    public String gcdOfStrings(String str1, String str2) {
        // kiem tra xem neu chuoi noi lien = hay ko, ko thì return
        if(!(str1 + str2).equals(str2 + str1))
            return "";
        int gcd = gcd(str1.length(), str2.length());
        return str1.substring(0, gcd);
    }

    private int gcd(int a, int b){
        return b == 0 ? a : gcd(b, a % b);
    }
}

//kiểm tra str1 + sstr2 === str2 + str1
//nếu == tìm chuỗi con chung dài nhất
// không thì return ""
/*
vidu  str1 = "ABCABC" and str2 = "ABC"
str1 + str2 = ABCABCABC
str2 + str1 = ABCABCABC
str1 + str2 == str2 + str1
return str.substr(0, gcd(size(str1), gcd(size(str2))))
where gcd(3, 6) = 3
=> "ABC"
 */