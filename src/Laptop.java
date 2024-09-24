class Laptop {
    public String brand;
    public String ram;
    public String ssd;

    public Laptop (String brand, String ram, String ssd) {
        this.ram = ram;
        this.ssd = ssd;
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public String getRam() {
        return ram;
    }

    public String getSsd() {
        return ssd;
    }

    public String toString() {
        return "Ноутбук - " +
                "Бренд = " + brand+
                ", ОЗУ = " + ram +
                ", Объём ЖД = " + ssd;
    }
}
