package Patterns;

public class PatternsExercise {

    public static void main(String[] args) {
        PatternsExercise p = new PatternsExercise();
        p.pattern5();
    }

    public void pattern1() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("⭐");
            }
            System.out.println();
        }
    }

    public void pattern2() {
        for(int i = 1; i <= 5; i++) {
             for(int j = 1; j<= i; j++) {
                 System.out.print("⭐");
             }
            System.out.println();
        }
    }

    public void pattern3() {
        for(int i = 1; i <= 5; i++) {
            for(int j = i; j<= 5; j++) {
                System.out.print("⭐");
            }
            System.out.println();
        }
    }

    public void pattern4() {
        for(int i = 1; i<=5; i++) {
            for(int j = 1; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public void pattern5() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("⭐");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("⭐");
            }
            System.out.println();
        }
    }
}
