public class StringExercises {
    public int length(String str){
        return str.length();

    }
    public String toUpperCase(String str){
        return str.toUpperCase();
    }
    public String toLowerCase(String str){
        return str.toLowerCase();
    }
    public int indexOf(String str, String findMe){
        return str.indexOf (findMe);
    }
    public String trimAll(String str){
        return str.trim();
    }
    public String lastLetter(String str){
        int length = str.length();
        return str.substring(length-1, length);
    }
    public String firstLetter(String str){
        return str.substring(0, 1);
    }
    public String replaceFirst(String str, String replaceThis, String withMe){
        return str.replaceFirst(replaceThis, withMe);
    }
    public boolean contains(String str, String checkThis){
        return str.contains (checkThis);
    }

}
