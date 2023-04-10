public class laptops {

    public static int counter = 0;
    private int id;

    private String name;
    private int ram;
    private int storageCap;
    private String os;
    private String colour;
    private double diagonal;

    public laptops(String name, int ram, int storageCap, String os, String colour, double diagonal) {

        this.id = counter++;

        this.name = name;
        this.ram = ram;
        this.storageCap = storageCap;
        this.os = os;
        this.colour = colour;
        this.diagonal = diagonal;
    }

    @Override
    public String toString() {
        return String.format("Название: %s \nОбъем оперативной памяти: %d Гб \nОбъем накопителя: %d Гб \nОперационная Система: %s \nЦвет: %s \nДиагональ: %.1f \n", 
                    this.name, this.ram, this.storageCap, this.os, this.colour, this.diagonal);
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof laptops) {
            return this.name.equals(((laptops) obj).name) && this.ram == ((laptops) obj).ram 
                                && this.storageCap == ((laptops) obj).storageCap && this.os.equals(((laptops) obj).os) 
                                && this.colour.equals(((laptops) obj).colour) && this.diagonal == ((laptops) obj).diagonal;
        }
        return false;
        
    }

    public int getRam() {
        return this.ram;
    }

    public int getStorageCap() {
        return this.storageCap;
    }

    public String getOS() {
        return this.os;
    }

    public double getDiagonal() {
        return this.diagonal;
    }
}
