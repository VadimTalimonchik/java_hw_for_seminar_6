import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class hw_1 {
    
    public static void main(String[] args) throws Exception {
        
        laptops laptop1 = new laptops("Lenovo IdealPad 5", 8, 256, "Windows 11", "синий", 15.6);
        laptops laptop2 = new laptops("Honor MagicBook 16", 16, 512, "без ОС", "серый", 16.1);
        laptops laptop3 = new laptops("Apple MacBook Air 13", 8, 256, "MacOs", "золотистый", 13.3);
        laptops laptop4 = new laptops("HP 250 G7", 4, 1024, "без ОС", "черный", 15.6);
        laptops laptop5 = new laptops("Xiomi RedmiBook 15", 8, 256, "Windows 11", "серый", 15.6);
        laptops laptop6 = laptop1;

        Set<laptops> unicLaptop = new HashSet<laptops>();
        unicLaptop.add(laptop1);
        unicLaptop.add(laptop2);
        unicLaptop.add(laptop3);
        unicLaptop.add(laptop4);
        unicLaptop.add(laptop5);
        unicLaptop.add(laptop6);
        System.out.println(laptop1.equals(laptop6));
        System.out.println();
        System.out.printf("Всего уникалных ноутбуков: %d \n", unicLaptop.size());
        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите желаемые характеристики:\n1. Объем оперативной памяти: ");
        int ramUser = sc.nextInt();
        System.out.print("2. Объем накопителя: ");
        int storUser = sc.nextInt();
        System.out.print("3. Диагональ: ");
        double digUser = sc.nextDouble();
        System.out.println();
        
        for(laptops lap: unicLaptop) {
            if ((lap.getRam() >= ramUser) && (lap.getStorageCap() >= storUser)  && lap.getDiagonal() >= digUser) {
                System.out.println(lap.toString());
            }
        }
        sc.close();
    }   
}