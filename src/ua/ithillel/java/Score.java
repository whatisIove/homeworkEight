package ua.ithillel.java;

public class Score {
    public String category;
    public double[] statistic = new double[10];

    {
        double a;
        for (int i = 0; i < statistic.length; i++) {
            a = (Math.random() * 20 - 10) * 10;
            statistic[i] = a;
        }
    }
}
