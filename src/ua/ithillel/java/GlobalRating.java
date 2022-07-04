package ua.ithillel.java;

public class GlobalRating {

    public Score[] data;

    {
        data = new Score[4];
        data[0] = new Score();
        data[1] = new Score();
        data[2] = new Score();
        data[3] = new Score();
        data[0].category = "Views";
        data[1].category = "Actions";
        data[2].category = "Sharings";
        data[3].category = "Buyings";
    }
}
