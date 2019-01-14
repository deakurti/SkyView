public class SkyviewRunner {
    public static void main(String[] args){
        double[] scan = {0.3, 0.7, 0.8, 0.4, 1.1, 0.2, 0.5, 0.2, 1.6, 0.6, 0.9};
        double[] scan2 = {0.3, 0.7, 0.8, 0.4, 1.4, 1.1};

        Skyview sv1 = new Skyview(4,3,scan);
        Skyview sv2 = new Skyview(3,2,scan2);

        System.out.println(sv1);
        System.out.println(sv2);

        System.out.println("Average 1: " + sv1.getAverage(1,3,0,2));
        System.out.println("Average 2: " + sv2.getAverage(0,1,0,1));
    }

}
