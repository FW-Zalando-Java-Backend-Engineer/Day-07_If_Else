public class NestedTernaryExample {
    public static void main(String[] args) {
        int score = 78;
        String grade = (score >= 90) ? "A" :
                       (score >= 80) ? "B" :
                       (score >= 70) ? "C" :
                        (score >= 60) ? "D" : "F";
    }
}
