package controlselection.consonant;

public class ToConsonant {
        public char whichCharacter(char charrr){
            char nextChar;
            if(charrr<='z' && charrr>='a'){
            switch(charrr){
                case 'a':
                    nextChar = 'b';
                    break;
                case 'e':
                    nextChar = 'f';
                    break;
                case 'i':
                    nextChar = 'j';
                    break;
                case 'o':
                    nextChar = 'p';
                    break;
                case 'u':
                    nextChar = 'v';
                    break;
                default: nextChar = charrr;
            }
            }else{
                nextChar = '?';
            }
            return nextChar;
        }
}
