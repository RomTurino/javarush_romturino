package level27;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class TruePrices {
    public static class Product {
        int id;
        String name;
        String price;
        String quantity;

        public Product(int id, String name, String price, String quantity) {
            this.id = id;
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        @Override
        public String toString() {
            return String.format("%-8d%-30s%-8s%-4s", id, name, price, quantity);
        }
    }

    public static void main(String[] args) throws Exception {
        if (args.length == 0) {
            return;
        }

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        List<Product> products = new ArrayList<>();

        try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName))) {
            while (fileReader.ready()) {
                Product product = getProduct(fileReader.readLine());
                products.add(product);
            }
        }
        String name;
        String price;
        String quantity;
        Product product;

        switch (args[0]) {
            case "-c":
                int id = 0;
                for (Product prod : products) {
                    if (prod.id > id) id = prod.id;
                }
                name = args[1].length() > 30 ? args[1].substring(0, 30) : args[1];
                price = args[2].length() > 8 ? args[2].substring(0, 8) : args[2];
                quantity = args[3].length() > 4 ? args[3].substring(0, 4) : args[3];
                product = new Product(++id, name.trim(), price, quantity);
                try (FileWriter fileWriter = new FileWriter(fileName, true)) {
                    fileWriter.write("\n");
                    fileWriter.write(product.toString());
                }
                break;
            case"-u":
                id = Integer.parseInt(args[1]);
                name = args[2].length() > 30 ? args[2].substring(0, 30) : args[2];
                price = args[3].length() > 8 ? args[3].substring(0, 8) : args[3];
                quantity = args[4].length() > 4 ? args[4].substring(0, 4) : args[4];
                product = new Product(id, name, price, quantity);
                for (Product p : products) {
                    if (p.id == id) {
                        p.name = name;
                        p.price = price;
                        p.quantity = quantity;
                    }
                }
                rewrite(fileName, products);
                break;
            case "-d":
                id = Integer.parseInt(args[1]);
                int finalId = id;
                products.removeIf(p -> p.id == finalId);
                rewrite(fileName, products);
        }
    }

    public static void rewrite(String fileName, List<Product> products) throws IOException {
        try (FileWriter fileWriter = new FileWriter(fileName)) {
            fileWriter.write("");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try (FileWriter fileWriter = new FileWriter(fileName, true)) {
            for (Product p : products) {
                fileWriter.write(p.toString());
                fileWriter.write("\n");
            }
        }
    }

    public static Product getProduct(String string) {
        String id = string.substring(0, 8).trim();
        String name = string.substring(8, 38).trim();
        String price = string.substring(38, 46).trim();
        String quantity = string.substring(46, 50).trim();
        return new Product(Integer.parseInt(id), name, price, quantity);
    }
}
