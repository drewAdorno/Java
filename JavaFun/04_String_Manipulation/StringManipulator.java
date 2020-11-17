public class StringManipulator{
    public String trimAndConcat(String stringA, String stringB){
        return stringA.trim() + stringB.trim();
    }

    public Integer getIndexOrNull(String str, String substring ){
        if(str.indexOf(substring) == -1){
            return null;
        }
        return str.indexOf(substring);
    }
    public String concatSubstring(String stringA, int start, int end, String stringB){
        return stringA.substring(start, end)+stringB;
    }

}