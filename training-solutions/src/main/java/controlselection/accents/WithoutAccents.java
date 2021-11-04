package controlselection.accents;

public class WithoutAccents {
    public char whichChar(char charrr){
        char nextChar;
            switch(charrr){
                case 'á':
                    nextChar = 'a';
                    break;
                case 'é':
                    nextChar = 'e';
                    break;
                case 'í':
                    nextChar = 'i';
                    break;
                case 'ó':
                case 'ö':
                case 'ő':
                    nextChar = 'o';
                    break;
                case 'ú':
                case 'ü':
                case 'ű':
                    nextChar = 'u';
                    break;
                default: nextChar = charrr;
            }
        return nextChar;
    }
}
