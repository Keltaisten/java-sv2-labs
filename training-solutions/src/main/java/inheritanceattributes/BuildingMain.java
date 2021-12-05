package inheritanceattributes;

public class BuildingMain {
    public static void main(String[] args) {
        Building building = new Building("Kórház",1200, 6);
        SchoolBuilding schoolBuilding = new SchoolBuilding("Iskola", 1000,3,20);
        System.out.println(building.name);
        System.out.println(building.getFloors());
        System.out.println(building.area);
        System.out.println();
        System.out.println(schoolBuilding.name);
        System.out.println(schoolBuilding.getFloors());
        System.out.println(schoolBuilding.area);
        System.out.println(schoolBuilding.getNumberOfClassRooms());
    }
}
