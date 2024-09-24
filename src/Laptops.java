import java.util.*;

public class Laptops {
    public static void main(String[] args) {
            Set<Laptop> laptops = new HashSet<>();
            laptops.add(new Laptop("Acer", "16GB", "512GB"));
            laptops.add(new Laptop("Acer", "8GB", "256GB"));
            laptops.add(new Laptop("Apple", "16GB", "1TB"));
            laptops.add(new Laptop("Lenovo", "32GB", "1TB"));
            laptops.add(new Laptop("Apple", "16GB", "512GB"));
            laptops.add(new Laptop("Xiaomi", "64", "1TB"));

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите цифру, соответствующую необходимому критерию:\n"+
                "1 - название бренда\n" +
                "2 - ОЗУ\n" +
                "3 - Объем ЖД: ");
        String criteriaKey = scanner.nextLine().trim();

        System.out.print("Введите параметры фильтра : ");
        String criteriaValue = scanner.nextLine().trim();

        LaptopFilter.filterLaptops(laptops, criteriaKey, criteriaValue);
    }
}