import java.util.HashSet;
import java.util.Set;


public class LaptopFilter {
    public static void filterLaptops(Set<Laptop> laptops, String criteriaKey, String criteriaValue) {
        Set<Laptop> filteredLaptops = new HashSet<>();

        for (Laptop laptop : laptops) {
            boolean matches = false;

            switch (criteriaKey.toLowerCase()) {
                case "1":
                    matches = laptop.getBrand().equalsIgnoreCase(criteriaValue);
                    break;
                case "2":
                    matches = laptop.getRam().contains(criteriaValue);
                    break;
                case "3":
                    matches = laptop.getSsd().contains(criteriaValue);
                    break;
                default:
                    System.out.println("Неизвестный критерий: " + criteriaKey);
                    return;
            }

            if (matches) {
                filteredLaptops.add(laptop);
            }
        }
        System.out.println("Ноутбуки, подходящие под ваши критерии - "+filteredLaptops);
    }
}