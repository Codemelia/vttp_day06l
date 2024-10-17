// compile
// javac -d classes --source-path src src/vttp_day06l/App.java
// javac -d bin --source-path . ./*.java
// javac -d bin --source-path . ./*.java day06/*.java

// run
// java -cp bin App

// package to jar

// run jar

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import day06.MyImplementation;
import day06.Person;
import day06.Product;

public class App {

    public static void main(String[] args) {

        /* Thread th = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + " -> " + i);
                }
            }
        });
        th.start(); */

        /* MyImplementation my1 = new MyImplementation();
        MyImplementation my2 = new MyImplementation();
        MyImplementation my3 = new MyImplementation();
        MyImplementation my4 = new MyImplementation();
        MyImplementation my5 = new MyImplementation();

        // Executing tasks using a single thread
        ExecutorService es = Executors.newSingleThreadExecutor();
        es.execute(my1);
        es.execute(my2);
        es.shutdown(); // To release memory

        // Execute the tasks using fixed thread pool
        ExecutorService es1 = Executors.newFixedThreadPool(5);
        es1.execute(my1);
        es1.execute(my2);
        es1.execute(my3);
        es1.execute(my4);
        es1.execute(my5);
        es1.shutdown(); // To release memory */

        /* List<Product> products = new ArrayList<Product>();
        products.add(new Product(1L, "Apple iPad", "Apple tablet", "computer"));
        products.add(new Product(2L, "Apple Macbook Pro", "Apple laptop", "computer"));
        products.add(new Product(3L, "Logitech Mouse", "Mouse", "computer"));
        products.add(new Product(4L, "32 inch monitor", "Samsung monitor", "computer"));
        products.add(new Product(5L, "Huawei 5", "Huawei phone", "mobile"));
        products.add(new Product(6L, "Oppo 7 Pro", "Oppo phone", "mobile"));
        products.add(new Product(7L, "Galaxy 24", "Samsung phone", "mobile"));
        products.add(new Product(8L, "iPhone 15", "Apple phone", "mobile"));

        products.forEach(prod -> {
            System.out.println(prod.toString());
        }); */

        /* products.forEach(Product::print);

        System.out.println("----------------------------\n");

        // only retrieve products with category 'mobile'
        // using stream and lambda functions

        List<Product> filteredProducts = new ArrayList<Product>();
        filteredProducts = products
        .stream()
        .filter(p -> p.getCategory().equals("mobile"))
        .collect(Collectors.toList());
        
        filteredProducts.forEach(Product::print); */

        LocalDate ld = LocalDate.of(1990, 1, 12);
        Date currentDate = Date.from(ld.atStartOfDay(ZoneId.systemDefault()).toInstant());

        List<Person> persons = new LinkedList<>();
        persons.add(new Person(1L, "Bernard", "Tan", 30000.0, currentDate));
        persons.add(new Person(2L, "James", "Wong", 39000.0, currentDate));
        persons.add(new Person(3L, "Clint", "Poon", 28000.0, currentDate));
        persons.add(new Person(4L, "Leo", "Shen", 27500.0, currentDate));
        persons.add(new Person(5L, "Bruce", "Wayne", 31000.0, currentDate));
        persons.add(new Person(6L, "Mei", "Chan", 30000.0, currentDate));
        persons.add(new Person(7L, "Paula", "Ronald", 31500.0, currentDate));
        persons.add(new Person(8L, "Trixie", "Tan", 30500.0, currentDate));

        // sort single column
        Comparator<Person> compare = Comparator.comparing(p -> p.getFirstName());

        // ascending order
        persons.sort(compare);
        persons.forEach(p -> {
            System.out.println(p.toString());
        });

        // sort multiple columns
        Comparator<Person> compareMultiple = Comparator.comparing(Person::getFirstName)
        .thenComparing(Person::getLastName);

        // descending order
        persons.sort(compareMultiple.reversed());
        persons.forEach(p -> {
            System.out.println(p.toString());
        });
        
    }
}