public class StringMethods {
    public static void main(String[] args) {
        String stringVariable = " java ";
        //returns false here because stringVariable is not null
        //returns true if stringVariable="" because stringVariable value is null
        System.out.println(stringVariable.isEmpty());
        //trims the space in the front and in the back of the string
        String trimmedString = stringVariable.trim();
        System.out.println(trimmedString);

        String subString =stringVariable.substring(2);
        System.out.println(subString);

        StringBuilder build = new StringBuilder("Program");
        build.delete(2, 5);
        System.out.println(build);
    }
}
