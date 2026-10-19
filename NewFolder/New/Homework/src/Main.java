import java.util.Arrays;
import java.util.Objects;

class Product {
  private int id;
  private String name;
  private int price;
  private String category;

  public Product(int id, String name, int price, String category) {
    this.id = id;
    this.name = name;
    this.price = price;
    this.category = category;
  }

  public int getId() {
    return id;
  }

  public String getCategory() {
    return category;
  }

  @Override
  public String toString() {
    return "Товар[артикул=" + id + ", название=" + name + ", цена=" + price + ", категория=" + category + "]";
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Product product = (Product) obj;
    return id == product.id &&
            Objects.equals(category, product.category);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, category);
  }
}

class Order {
  private String customer;
  private Product[] basket;

  public Order(String customer, Product[] basket) {
    this.customer = customer;
    this.basket = basket;
  }

  public String getCustomer() {
    return customer;
  }

  public Product[] getBasket() {
    return basket;
  }

  @Override
  public String toString() {
    return "Заказ{клиент=" + customer + ", товары=" + Arrays.toString(basket) + "}";
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Order order = (Order) obj;

    if (!Objects.equals(customer, order.customer)) return false;
    Product[] thisBasket = this.basket;
    Product[] otherBasket = order.basket;
    if (thisBasket == null && otherBasket == null) return true;
    if (thisBasket == null || otherBasket == null) return false;
    if (thisBasket.length != otherBasket.length) return false;

    for (int i = 0; i < thisBasket.length; i++) {
      Product p1 = thisBasket[i];
      Product p2 = otherBasket[i];
      if (p1 == null && p2 == null) continue;
      if (p1 == null || p2 == null) return false;
      if (!p1.equals(p2)) return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(customer, Arrays.hashCode(basket));
  }
}


public class Main {
  public static void main(String[] args) {

    Product p1 = new Product(1, "Ноутбук", 1500, "Электроника");
    Product p2 = new Product(2, "Смартфон", 800, "Электроника");
    Product p3 = new Product(3, "Книга", 30, "Литература");
    Product p4 = new Product(1, "Планшет", 500, "Электроника");
    Product p5 = new Product(4, "Наушники", 120, "Электроника");

    System.out.println("=== Товары ===");
    System.out.println(p1);
    System.out.println(p2);
    System.out.println(p3);
    System.out.println(p4);
    System.out.println(p5);

    System.out.println("\n=== Сравнение товаров ===");
    System.out.println("p1.equals(p2) -> " + p1.equals(p2));
    System.out.println("p1.equals(p4) -> " + p1.equals(p4));
    System.out.println("p2.equals(p5) -> " + p2.equals(p5));
    System.out.println("p3.equals(p3) -> " + p3.equals(p3));


    Product[] basket1 = {p1, p2, p3};
    Product[] basket2 = {p1, p2, p3};
    Product[] basket3 = {p1, p2, p5};
    Product[] basket4 = {p1, p2};
    Product[] basket5 = {p1, p4, p3};

    Order order1 = new Order("Иван Петров", basket1);
    Order order2 = new Order("Иван Петров", basket2);
    Order order3 = new Order("Мария Смирнова", basket1);
    Order order4 = new Order("Иван Петров", basket3);
    Order order5 = new Order("Иван Петров", basket4);
    Order order6 = new Order("Иван Петров", basket5);


    System.out.println("\n=== Заказы ===");
    System.out.println(order1);
    System.out.println(order2);
    System.out.println(order3);
    System.out.println(order4);
    System.out.println(order5);
    System.out.println(order6);

    System.out.println("\n=== Сравнение заказов ===");
    System.out.println("order1.equals(order2) -> " + order1.equals(order2));
    System.out.println("order1.equals(order3) -> " + order1.equals(order3));
    System.out.println("order1.equals(order4) -> " + order1.equals(order4));
    System.out.println("order1.equals(order5) -> " + order1.equals(order5));
    System.out.println("order1.equals(order6) -> " + order1.equals(order6));
  }
}