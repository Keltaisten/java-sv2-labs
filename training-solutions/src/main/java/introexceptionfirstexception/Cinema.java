package introexceptionfirstexception;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem adja meg a nevét");
        String name = scanner.nextLine();
        System.out.println("Melyik filmre szeretne jegyet vásárolni?");
        String movieTitle = scanner.nextLine();
        System.out.println("Hány jegyet szeretne vásárolni?");
        int numberOfTickets = scanner.nextInt();
        System.out.println("Melyik sorba szeretné a jegyeket?");
        int row = scanner.nextInt();

        boolean bool = true;
        StringBuilder rowWithNumberOfChairs = new StringBuilder();
        for(int i = 1; i <=numberOfTickets; i++){
            if(bool){
                bool = false;
            }else{
                rowWithNumberOfChairs.append(", ");
            }
            rowWithNumberOfChairs.append(row + ". sor " + i + ". szék");
        }

        System.out.println("A mozijegy.hu rendszerben vásárolt jegyek adatai a következők: \n" +
                "Vásárló neve: " + name +
                "\nFilm címe: " + movieTitle +
                "\nLefoglalt helyek: " + rowWithNumberOfChairs +
                "\nJó szórakozást!");
    }
}
