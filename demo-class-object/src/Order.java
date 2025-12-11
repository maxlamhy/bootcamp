// ! Order Class

import java.math.BigDecimal;

public class Order {
  private int id;
  private Item[] items;

  // ! give up empty constructor
  public Order(int id) {
    this.id = id;
    this.items = new Item[0];
  }

  // presentation
  public double amount() {
    BigDecimal total = BigDecimal.ZERO;
    for (Item item : this.items) {
      total = total.add(BigDecimal.valueOf(item.amount()));
    }
    return total.doubleValue();
  }

  public void clear() {
    this.items = new Item[0];
  }
  
  public void add(Item newItem) {
    Item[] newItems = new Item[this.items.length + 1];
    for (int i = 0; i < this.items.length; i++) {
      newItems[i] = this.items[i];
    }
    newItems[newItems.length - 1] = newItem;
    this.items = newItems;
  }

  public int getId() {
    return this.id;
  }

  public static void main(String[] args) {
    Order o1 = new Order(1);
    Order o2 = new Order(2);
    Customer c1 = new Customer();
    c1.add(o1); // loop
    c1.add(o2); // loop
    System.out.println(c1.getOrder(1).getId()); // 1



  }


}