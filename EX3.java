import java.util.Random;

public class EX3 {
    public static void main(String[] args) {
        Random r = new Random();

        // nextInt()
        int randomInt = r.nextInt();
        System.out.println(randomInt);
        System.out.println(" ");

        // nextInt(int bound)
        int randomInt2 = r.nextInt(100);
        System.out.println(randomInt2);
        System.out.println(" ");

        // nextDouble()
        double randomDouble = r.nextDouble();
        System.out.println(randomDouble);
        System.out.println(" ");

        // nextFloat()
        float randomFloat = r.nextFloat();
        System.out.println(randomFloat);
        System.out.println(" ");

        // nextBoolean()
        boolean randomBoolean = r.nextBoolean();
        System.out.println(randomBoolean);
        System.out.println(" ");

        // nextLong()
        long randomLong = r.nextLong();
        System.out.println(randomLong);
        System.out.println(" ");

        // nextGaussian()
        double randomGaussian = r.nextGaussian();
        System.out.println(randomGaussian);
        System.out.println(" ");

        // setSeed(long seed)
        r.setSeed(System.currentTimeMillis());
        System.out.println(r.nextInt());
        System.out.println(" ");

        // nextBytes(byte[] bytes)
        byte[] randomBytes = new byte[10];
        r.nextBytes(randomBytes);
        for (byte b : randomBytes) {
            System.out.println(b + " ");
        }
        System.out.println();
        System.out.println(" ");

        // nextInt(int origin, int bound)
        int randomInt3 = r.nextInt(9) + 1;
        System.out.println(randomInt3);
        System.out.println(" ");
        
    }
}
