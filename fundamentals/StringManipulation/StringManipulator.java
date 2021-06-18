public class StringManipulator {
    String trimAndConcat(String str1, String str2){
        str1=str1.trim();
        str2=str2.trim();
        return (str1.concat(str2));
    }

    Integer getIndexOrNull(String s1, char s2){
        Integer s=s1.indexOf(s2);
         return s;


    }
    Integer getIndexOrNull(String a, String b){
        return a.indexOf(b);
    }

    String concatSubstring(String x, int y, int z, String c){
        return x.substring(y,z).concat(c);

    }
    








}
