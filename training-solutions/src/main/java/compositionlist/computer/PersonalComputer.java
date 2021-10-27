package compositionlist.computer;

import java.util.ArrayList;
import java.util.List;

public class PersonalComputer {
    private List<Hardware> hardwares = new ArrayList<>();

    private List<Software> softwares = new ArrayList<>();

    Cpu cpu;

    public PersonalComputer(Cpu cpu) {
        this.cpu = cpu;
    }

    public void addHardware(Hardware hardware){
        hardwares.add(hardware);
    }

    public void addSoftware(Software software){
        softwares.add(software);
    }

    @Override
    public String toString() {
        return "PersonalComputer{\n" +
                "hardwares=" + hardwares +
                ", \nsoftwares=" + softwares +
                ", \ncpu=" + cpu +
                "\n}";
    }

    public List<Hardware> getHardwares() {
        return hardwares;
    }

    public List<Software> getSoftwares() {
        return softwares;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public static void main(String[] args) {
        Cpu cpu = new Cpu("Intel", 3200);
        Hardware hardware = new Hardware("Videókártya", "Nvidia Geforce 1060");
        Software software = new Software("VLC", 2.8);
        PersonalComputer personalComputer = new PersonalComputer(cpu);

        personalComputer.addHardware(hardware);
        personalComputer.addSoftware(software);

        System.out.println(personalComputer);

    }
}
