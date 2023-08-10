import java.util.Calendar;
/*
 * В данном классе нарушений не вижу, класс представляющий продукт.
 * Поля описывают определённые параметры продуктов.
 * Класс реализует интерфейс Comparable и переопределяет его метод 
 * compareTo для сравнения двух продуктов.
 */

/**
 * Реализуйте класс Товар, содержащий данные о товаре, и ТорговыйАвтомат,
 * содержащий в себе методы initProducts (List <Product>)
 * сохраняющий в себе список исходных продуктов и getProduct(String name)
 */
public abstract class Product implements Comparable<Product> {
    private String name;
    private int price;
    private int quantity;
    private Calendar bestBefore;

    public Product(String name, int price, int quantity, Calendar bestBefore) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.bestBefore = bestBefore;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public Calendar getBestBefore() {
        return bestBefore;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setBestBefore(Calendar bestBefore) {
        this.bestBefore = bestBefore;
    }

    @Override
    public String toString() {
        return "\nProduct [name = " + name + "; price = " + price + "; quantity = " + quantity
                + "; bestBefore = " + bestBefore.get(Calendar.YEAR) + "/" + bestBefore.get(Calendar.MONTH);
    }

    @Override
    public int compareTo(Product o) {
      int resultOfComparing = this.getName().compareTo(o.getName());
      if (resultOfComparing == 0) {
        resultOfComparing = this.getName().compareTo(o.getName());
      }
      return resultOfComparing;
    }
}
