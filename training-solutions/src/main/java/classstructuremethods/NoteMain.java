package classstructuremethods;

public class NoteMain {
    public static void main(String[] args) {
        Note note = new Note();
        note.setName("István");
        note.setTopic("Sakk");
        note.setText("Ne felejtsd el megvenni az ajándékot.");
        System.out.println(note.getNoteText());
    }
}
