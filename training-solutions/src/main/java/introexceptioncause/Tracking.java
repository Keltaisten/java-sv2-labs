package introexceptioncause;

import java.util.List;

public class Tracking {
    public static void main(String[] args) {
        List<String> list = new TrackPoints().readTheTrackFile();
        new TrackPoints().getThePoint(list);
    }
}
