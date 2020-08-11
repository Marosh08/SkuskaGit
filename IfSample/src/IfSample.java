/*
Ukazka pouzitia prikazu if.
Tento kod ulozte do suboru IfSample.java
 */
 class IfSample {
    public static void main(String args[]) {




        int x, y;

        x = 10;
        y = 20;

        if (x < y) System.out.println("Hodnota x je mensia ako y");

        x = x * 2;
        if (x == y) System.out.println("Hodnota x je rovna hodnote y");

        x = x * 2;
        if (x > y) System.out.println("Hodnota x je vacsia ako hodnota y");

    }
}
