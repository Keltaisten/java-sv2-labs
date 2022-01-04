package virtualmethod.grammar;

public class Grammar {
    public static void main(String[] args) {
        Verb verb = new PhrasalVerb("csinál","meg");
        Verb verb2 = new PhrasalVerbWithSuffix("csinál", "meg", "juk");
        Preposition preposition = new PhrasalVerb("alszik","el");
        Preposition preposition2 = new PhrasalVerbWithSuffix("alsz","el","om");
        PhrasalVerb phrasalVerb = new PhrasalVerb("utazik","át");
        PhrasalVerb phrasalVerb2 = new PhrasalVerbWithSuffix("utaz","el","unk");
        Suffix suffix = new PhrasalVerbWithSuffix("úsz","át","od");
        PhrasalVerbWithSuffix phrasalVerbWithSuffix = new PhrasalVerbWithSuffix("olvas","végig","sák");

        System.out.println(verb.getWord());

        System.out.println(verb2.getWord());

        System.out.println(preposition.getPreposition());
        System.out.println(preposition.getWholeWord());

        System.out.println(preposition2.getPreposition());
        System.out.println(preposition2.getWholeWord());

        System.out.println(phrasalVerb.getPreposition());
        System.out.println(phrasalVerb.getWord());
        System.out.println(phrasalVerb.getWholeWord());

        System.out.println(phrasalVerb2.getPreposition());
        System.out.println(phrasalVerb2.getWord());
        System.out.println(phrasalVerb2.getWholeWord());

        System.out.println(suffix.getSuffix());

        System.out.println(phrasalVerbWithSuffix.getPreposition());
        System.out.println(phrasalVerbWithSuffix.getWord());
        System.out.println(phrasalVerbWithSuffix.getSuffix());
        System.out.println(phrasalVerbWithSuffix.getWholeWord());
    }
}
