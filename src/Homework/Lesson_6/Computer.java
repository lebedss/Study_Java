package Homework.Lesson_6;

public class Computer {
    private String Name;
    private int ram;
    private String cpu;
    private int hdd;
    private String OC;
    private String color;

    public Computer(String name, int ram, String cpu, int hdd, String OC, String color) {
        Name = name;
        this.ram = ram;
        this.cpu = cpu;
        this.hdd = hdd;
        this.OC = OC;
        this.color = color;
    }

    public boolean isMatch(int criteria, String value) {
        boolean isMatch = true;
        switch (criteria) {
            case 1 -> isMatch = ram >= Integer.parseInt(value);
            case 2 -> isMatch = hdd >= Integer.parseInt(value);
            case 3 -> isMatch = OC.equals(value);
            case 4 -> isMatch = color.equals(value);
            case 5 -> isMatch = cpu.equals(value);
        }
        return isMatch;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "Name='" + Name + '\'' +
                ", ram=" + ram +
                ", cpu='" + cpu + '\'' +
                ", hdd=" + hdd +
                ", OC='" + OC + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public String getOC() {
        return OC;
    }

    public void setOC(String OC) {
        this.OC = OC;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
