package classstructuremethods;

public class ClientMain {

    public static void main(String[] args) {
        Client client = new Client();
        client.setName("János");
        client.setYear(1990);
        client.setAddress("UK London High str. 123.");

        System.out.println("Ez a neve: " + client.getName());
        System.out.println("Ez a születési éve: " + client.getYear());
        System.out.println("Itt lakik: " + client.getAddress());

        client.migrate("USA Chicago Lincoln str. 321");
        System.out.println("Az új címed sikeresen megváltozott: " + client.getAddress());
    }
}
