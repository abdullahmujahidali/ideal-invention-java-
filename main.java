import java.util.Scanner;
import java.util.Random;

public class TestClass {

public static void main(String[] args) {
float sum, min, max;
min = Float.MAX_VALUE;
max = Float.MIN_VALUE;
sum = 0;

Scanner in = new Scanner(System.in);
for(int i = 0; i < 10 ;i++) {
float x = in.nextFloat();
sum += x;
min = Math.min(min,x);
max = Math.max(max,x);
}

float average = sum / 10.0f;

System.out.println("Average: "+average);
System.out.println("Minimum: "+min);
System.out.println("Maximum: "+max);
}

}
