package util;

import java.util.Scanner;

public class Input{
    private static Scanner scanner = new Scanner(System.in);
    public Input(){}

    public boolean yesNo() {
        System.out.println("say yes or no ");
        String answer = scanner.nextLine();

        if(answer.equals("y") || answer.equals("yes")) {
            return true;
        }else
            return false;
    }

//    public int getInt() {
//        System.out.println("Gimme a number.\n");
//        int answer = Integer.parseInt(getString());
//
//        if (answer == Integer.valueOf(answer)) {
//            answer == scanner.nextInt();
//        }
//        return 0;
//    }

    int getInt(int min, int max) throws Exception{
        System.out.format("Gimme a number between %d and %d\n",min,max );
        int answer = Integer.valueOf(getString());

        try{
            if (answer < min || answer > max) {
                throw new Exception("read the curriculum");
            }
            System.out.println(answer);
        } catch (NumberFormatException e) {
            System.out.println("Nah playa, i said gimme a numba");
            getInt(min, max);
        }
        return answer;
    }

//    double getDouble() {
//        System.out.println("Gimme a number.\n");
//        double answer = scanner.nextDouble();
//        return answer;
//    }

    double getDouble(double min, double max) throws Exception {
        System.out.format("Gimme a number between %.1f and %.1f\n",min,max );
        double answer = Double.valueOf(getString());
        try {
            if (answer < min || answer > max) {
                throw new Exception("Read the curriculum");
            }
            System.out.println(answer);
        } catch (Exception e) {
            throw new Exception("read the curriculum");
        }
        return answer;
    }

    String getString(){
        String answer = scanner.nextLine();
        return answer;
    }

}
