package app;

public class Main01 {
    static final String CURRECY = "USD";
    public static void main(String[] args) {
        double[] shares = {45.99 , 34.56, 56.65, 44.52, 46.34};
        for (int i = 0; i < shares.length; i++){
            for (int j = 1; j < (shares.length - 1); j++){
             if (shares[j - 1] < shares[j]){
                 double temp = shares[j - 1];
                 shares[j - 1] = shares[j];
                 shares[j] = temp;

             }
            }
        }
        System.out.println("Company shares per 5 days in " + CURRECY + ":");
        for (double share : shares) {
            System.out.print(share + " ");
        }
        double minValue = shares[0];
        for (int i = 1; i < shares.length; i++) {
            if (shares[i] < minValue) {
                minValue = shares[i];

            }
        }
        System.out.println("\nMinimal price : " + CURRECY + " " + minValue);

        double maxValue = shares[0];
        for (int i = 1; i < shares.length; i++){
            if (shares[i] > maxValue) {
                maxValue = shares[i];
            }
        }  System.out.println("\nMaximal price : " + CURRECY + " " + maxValue);
    }
}


