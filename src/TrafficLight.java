import java.util.Scanner;

public class TrafficLight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfCrosses, numberOfTunnels;
        Tunnel[] tunnels;
        int[] crosses;

        numberOfCrosses = input.nextInt();
        numberOfTunnels = input.nextInt();
        tunnels = new Tunnel[numberOfTunnels];
        crosses = new int[numberOfCrosses];

        for (int i = 0; i < numberOfTunnels; i++) {
            tunnels[i] = new Tunnel(input.nextInt(), input.nextInt());
            crosses[tunnels[i].firstConnection - 1]++;
            crosses[tunnels[i].secondConnection - 1]++;
        }

        for (int cross : crosses) {
            System.out.println(String.valueOf(cross));
        }
    }
}