package meetingrooms;

import java.util.Scanner;

public class MeetingRoomController {

    private Office office;


    public static void main(String[] args) {
        MeetingRoomController meetingRoomController = new MeetingRoomController();
        meetingRoomController.runMenu();
    }

    private void runMenu() {
        printMenu();
    }

        Scanner scanner = new Scanner(System.in);
    private void printMenu() {
        office = new Office();
        int i;
        do {
            System.out.println("1. Tárgyaló rögzítése\n" +
                    "2. Tárgyalók sorrendben\n" +
                    "3. Tárgyalók visszafele sorrendben\n" +
                    "4. Minden második tárgyaló\n" +
                    "5. Területek\n" +
                    "6. Keresés pontos név alapján\n" +
                    "7. Keresés névtöredék alapján\n" +
                    "8. Keresés terület alapján\n" +
                    "9. Kilépés");
            i = scanner.nextInt();
            scanner.nextLine();
            switch (i){
                case 1:
                    readOffice();
                    break;
                case 2:
                    office.printNames();
                    break;
                case 3:
                    office.printNamesReverse();
                    break;
                case 4:
                    office.printEvenNames();
                    break;
                case 5:
                    office.printAreas();
                    break;
                case 6:
                    System.out.println("Adjon meg egy nevet");
                    String name = scanner.nextLine();
                    office.printMeetingRoomsWithName(name);
                    break;
                case 7:
                    System.out.println("Adjon meg egy nevet");
                    String part = scanner.nextLine();
                    office.printMeetingRoomsContains(part);
                    break;
                case 8:
                    System.out.println("Adjon meg egy számot");
                    int area = scanner.nextInt();
                    office.printAreasLargerThan(area);
                    break;
                case 9:
                    break;
                default:
                    System.out.println("Rossz parancsot adott ki");
            }
        }while(i != 9);
    }

    private void readOffice() {
        System.out.println("Adjon meg egy tárgyalót\n" +
                "Adja meg a nevét");
        String name = scanner.nextLine();
        System.out.println("Adja meg a hosszát");
        int length = scanner.nextInt();
        System.out.println("Adja meg a szélességét");
        int width = scanner.nextInt();
        office.addMeetingRoom(new MeetingRoom(name,length, width));
    }
}
