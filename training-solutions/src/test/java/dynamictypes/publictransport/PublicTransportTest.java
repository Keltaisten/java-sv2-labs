package dynamictypes.publictransport;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PublicTransportTest {

    @Test
    void testCreate(){
        PublicVehicle bus = new Bus(689,20,"Mercedes");
        PublicVehicle tram = new Tram(1,150,4);
        PublicVehicle metro = new Metro(4,100,12);
        PublicTransport publicTransport = new PublicTransport();
        publicTransport.addVehicle(bus);
        publicTransport.addVehicle(tram);
        publicTransport.addVehicle(metro);

        assertEquals(3, publicTransport.getPublicVehicles().size());
    }

}