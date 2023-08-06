public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");

        int [] cat = new int [] {1, 2, 3};
        System.out.println(cat[0]);

        double [] dog = new double[] { 1.57, 7.654, 9.986};
        System.out.println(dog[1]);

        double [] frog = new double[] {2.46, 7.375, 9.746346};
        System.out.println(frog[2]);

        System.out.println("Задание 2");

        int[] animal = {1, 2, 3, 4, 5};
        for (int i = 0; i < animal.length; i++) {
            System.out.print(animal[i]);
            if (i != animal.length -1 ) {
                System.out.print(",");
            }
        }

        System.out.println();

        double [] lion = new double[] { 1.57, 7.654, 9.986};
        for (int i = 0; i < lion.length; i++) {
            System.out.print(lion[i]);
            if (i != lion.length -1 ) {
                System.out.print(",");
            }
        }

        System.out.println();

        double [] tiger = new double[] {2.46, 7.375, 9.746346};
        for (int i = 0; i < tiger.length; i++) {
            System.out.print(tiger[i]);
            if (i != tiger.length -1 ) {
                System.out.print(",");
            }
        }

        System.out.println();

        System.out.println("Задание 3");

        int[] bird = {1, 2, 3, 4, 5};
        for (int i = bird.length - 1; i >= 0; i--) {
            System.out.print(bird[i]);
            if (i != 0) {
                System.out.print(",");
            }
        }

        System.out.println();

        double [] penguin = new double[] { 1.57, 7.654, 9.986};
        for (int i = penguin.length - 1; i >= 0; i--) {
            System.out.print(penguin[i]);
            if (i != 0) {
                System.out.print(",");
            }
        }

        System.out.println();

        double [] wolf = new double[] {2.46, 7.375, 9.746346};
     for (int i = wolf.length -1; i >=0; i--) {
         System.out.print(wolf[i]);
         if (i != 0) {
             System.out.print(",");
         }
     }

        System.out.println();

        System.out.println("Задание 4");

        int[] sweet = {1, 7, 9, 15, 22};
        for (int i = 0; i < sweet.length; i++) {
            if (sweet[i] % 2 != 0) {
                sweet[i]++;
            }
        }
        System.out.print("Результат преобразования: ");
        for (int i = 0; i < sweet.length; i++) {
            System.out.print(sweet[i]);
            if (i != sweet.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();



    }
}