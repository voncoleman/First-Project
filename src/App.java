public class App {
    public static void main(String[] args) throws Exception {
        StringExercises exercises = new StringExercises();
        String baseStr = "WeCanCodeIt";
        System.out.println ("String Length" + exercises.length("WeCanCodeIt"));
        System.out.println("All upper case" + exercises.toUpperCase("WeCanCodeIt"));
        System.out.println("All lower case" + exercises.toLowerCase("WeCanCodeIt"));
        System.out.println("Index of" + exercises.indexOf ("WeCanCodeIt", "Code"));
        System.out.println("Trim all " +exercises.trimAll("     WeCanCodeIt"));
        System.out.println("Last letter "  + exercises.lastLetter(baseStr));
        System.out.println("First letter " + exercises.firstLetter(baseStr));
        System.out.println("Replace First" + exercises.replaceFirst ("aaccaa", "aa", "bb"));
        System.out.println("Contains"  + exercises.contains(baseStr, "Code"));
        System.out.println("Contains" + exercises.contains(baseStr, "cant"));
    }



}