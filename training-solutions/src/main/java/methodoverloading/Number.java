package methodoverloading;

public enum Number {
    ONE ("one"),TWO("two"),THREE("three"),FOUR("four"),FIVE("five"),SIX("six"),SEVEN("seven"),EIGHT("eight"),NINE("nine"),TEN("ten"),ELEVEN("eleven"),TWELVE("twelve");

    private final String name;

    Number(String name) {
        this.name = name;
    }
}
