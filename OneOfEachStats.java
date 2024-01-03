import java.util.Random;

public class OneOfEachStats {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        int seed = Integer.parseInt(args[1]);
        Random generator = new Random(seed);

        int avgkids = 0;
        int twokids = 0;
        int threekids = 0;
        int fourmore = 0;

        for (int i = 0; i < num; i++) {
            boolean g = false;
            boolean b = false;
            int countt = 0;

            do {
                double pick = generator.nextDouble();
                if (pick < 0.5) {
                    b = true;
                } else {
                    g = true;
                }
                countt++;
            } while (!(b && g));

            avgkids += countt;
            if (countt == 2) {
                twokids++;
            } else if (countt == 3) {
                threekids++;
            } else if (countt >= 4) {
                fourmore++;
            }
        }

        System.out.println("Average: " + ((double) avgkids) / num + " children to get at least one of each gender.");
        System.out.println("Number of families with 2 children: " + twokids);
        System.out.println("Number of families with 3 children: " + threekids);
        System.out.println("Number of families with 4 or more children: " + fourmore);

        int maxCount = Math.max(twokids, Math.max(threekids, fourmore));
        System.out.print("The most common number of children is ");
        if (maxCount == twokids) {
            System.out.println("2.");
        } else if (maxCount == threekids) {
            System.out.println("3.");
        } else if (maxCount == fourmore) {
            System.out.println("4 or more.");
        }
    }
}
