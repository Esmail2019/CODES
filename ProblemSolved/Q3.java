import java.util.*;

public class Q3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float cost_pencil = sc.nextFloat();
        float cost_pen = sc.nextFloat();
        float cost_eraser = sc.nextFloat();

        float total_cost = cost_eraser + cost_pen + cost_pencil;
        System.out.println(total_cost);

        double gst = (0.18 * total_cost);
        double final_cost = (total_cost + gst);
        System.out.println(final_cost);
    }

}
