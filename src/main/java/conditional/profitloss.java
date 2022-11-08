package Practice;


public class profitloss {
    static int Profit(int costPrice, int sellingPrice) {
        int Profit = (sellingPrice - costPrice);
        return Profit;
    }

    static int Loss(int costPrice, int sellingPrice) {
        int Loss = (costPrice - sellingPrice);
        return Loss;
    }

    public static void main(String[] args) {
        int costPrice = 500;
        int sellingPrice = 700;
        if (sellingPrice == costPrice)
            System.out.println("no profit nor loss");
        else if (sellingPrice > costPrice)
            System.out.println(Profit(costPrice, sellingPrice) + "You can book your Profit amount:");
        else
            System.out.println(Loss(costPrice, sellingPrice) + "You can book your Loss amount:");
    }
}





