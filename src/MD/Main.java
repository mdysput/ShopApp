package MD;

public class Main {
    private static StockList stockList= new StockList();
    public static void main(String[] args) {
        StockItem temp= new StockItem("Break", 0.85, 100);
        stockList.addStock(temp);

        temp = new StockItem("Cake", 1.12,10);
        stockList.addStock(temp);

        temp = new StockItem("Car", 2131.12,1);
        stockList.addStock(temp);

        temp = new StockItem("Cola", 2.12,2);
        stockList.addStock(temp);

        temp = new StockItem("Cola", 12.1,4);
        stockList.addStock(temp);

        temp = new StockItem("Aqua", 2.01,14);
        stockList.addStock(temp);

        temp = new StockItem("Egg", 0.05,53);
        stockList.addStock(temp);

        temp = new StockItem("Beer", 2.12,12);
        stockList.addStock(temp);

        System.out.println(stockList);


        for(String s:stockList.items().keySet()){
            System.out.println(s);
        }

        System.out.println("\n");

        Basket myBasket= new Basket("Michal");
        sellItem(myBasket, "Cola", 1);
        System.out.println(myBasket);

        sellItem(myBasket, "Cola", 1);
        System.out.println(myBasket);

        sellItem(myBasket, "Cola", 1);
        sellItem(myBasket, "Bulldog", 12);
        System.out.println(myBasket);




    }

    public static int sellItem(Basket basket, String item, int quantity){
        StockItem stockItem= stockList.get(item);
        if(stockItem== null){
            System.out.println("Don't have that "+item);
            return 0;
        }
        if(stockList.sellStock(item, quantity)!= 0){
            basket.addToBasket(stockItem, quantity);
            return quantity;
        }

        return 0;
    }
}
