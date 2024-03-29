// Задание

// -Подумать над структурой класса Ноутбук для магазина техники - выделить поля и
// методы. Реализовать в java.
// - Создать множество ноутбуков.
// - Написать метод, который будет запрашивать у пользователя критерий (или критерии)
// фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно
// хранить в Map. Например:
// “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет …
// - Далее нужно запросить минимальные значения для указанных критериев - сохранить
// параметры фильтрации можно также в Map.
// - Отфильтровать ноутбуки их первоначального множества и вывести проходящие по
// условиям.


public class Notebook {

    private String brand;
    private String os;
    private int hardDrive;
    private int memory;
    private String color;
    private String[] fields = {"brand", "os", "hardDrive", "memory", "color"};

    public Notebook (String brand, String os, int hardDrive, int memory, String color) {
        this.brand = brand;
        this.os = os;
        this.hardDrive = hardDrive;
        this.memory = memory;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public int getHardDrive() {
        return hardDrive;
    }

    public int getMemory() {
        return memory;
    }

    public String getOs() {
        return os;
    }

    public String[] getFields() {
        return fields;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setHardDrive(int hardDrive) {
        this.hardDrive = hardDrive;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public void setOs(String os) {
        this.os = os;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!this.getClass().equals(obj.getClass())) return false;
        Notebook note = (Notebook) obj;
        return (this.brand.equals(note.getBrand()) && this.color.equals(note.getColor()) && this.hardDrive == note.getHardDrive() && this.memory == note.getMemory() && this.os.equals(note.getOs()));
    }

    @Override
    public int hashCode() {
        return (this.brand.hashCode() + this.color.hashCode() + this.hardDrive + this.memory + this.os.hashCode());
    }

    @Override
    public String toString() {

        return String.format("Notebook, brand: %s, os: %s, memory: %d gb's, hard drive %d gb's, color: %s", this.brand, this.os, this.memory, this.hardDrive, this.color);
    }

    public void searchInBrand(String brand) {
        if (this.brand.equals(brand)) System.out.println(this.toString()); 
    }

    public void searchInColor(String color) {
        if (this.color.equals(color)) System.out.println(this.toString()); 
    }

    public void searchInOs(String os) {
        if (this.os.equals(os)) System.out.println(this.toString()); 
    }

    public void searchInMemory(int memory) {
        if (this.memory == memory) System.out.println(this.toString()); 
    }

    public void searchInHard(int hard) {
        if (this.hardDrive == hard) System.out.println(this.toString()); 
    }

    

}
