package virtualmethod.grammar;

public class PhrasalVerb extends Verb implements Preposition{
    protected String preposition;

    public PhrasalVerb(String word, String preposition) {
        super(word);
        this.preposition = preposition;
    }

    @Override
    public String getPreposition() {
        return preposition;
    }

    public String getWholeWord(){
        return preposition + word;
    }
}
