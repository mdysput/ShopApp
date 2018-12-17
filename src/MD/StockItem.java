package MD;

public class StockItem implements Comparable<StockItem>{
    private final String name;
    private double price;
    private int quanlityStock;

    public StockItem(String name, double price) {
        this.name = name;
        this.price = price;
        this.quanlityStock=0;
    }

    public StockItem(String name, double price, int quanlityStock) {
        this.name = name;
        this.price = price;
        this.quanlityStock = quanlityStock;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int quantityInStock() {
        return quanlityStock;
    }

    public void setPrice(double price) {
        if(price>0.0){
            this.price = price;
        }
    }

    public void adjustStock(int quanlity){
        int newQuantity= this.quanlityStock+quanlity;
        if(newQuantity>=0){
            this.quanlityStock= newQuantity;
        }
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("Entering StockItem.equals");
        if(o == this){
            return true;
        }
        if((o== null) || (o.getClass() != this.getClass())){
            return false;
        }
        String objName= ((StockItem) o).getName();
        return this.name.equals(objName);

    }

    @Override
    public int hashCode() {
        return this.name.hashCode()+31;
    }
    @Override
    public int compareTo(StockItem o) {
        if(this==o){
            return 0;
        }
        if(o !=null){
            return this.name.compareTo(o.getName());
        }

        throw new NullPointerException();
    }

    @Override
    public String toString() {
        return this.name+": "+this.price;
    }
}
