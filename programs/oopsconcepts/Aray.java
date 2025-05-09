public class Aray {
    public static void main(String[] args) throws Exception {
        int age=24;
        age = inc(age);
        System.out.println("Age 2:"+age);
     String[] depts = {"AI/DS", "IOT", "AI/ML"};
    changeDepts(depts);
    System.out.println("First index in main:"+depts[0]);

}

private static int inc(int value) {
    return value + 1;
}
private static void changeDepts(String[] depts) {
    depts[0]="AI-DS";
    System.out.println("First index in method:"+depts[0]);
}
}
