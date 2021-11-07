package stringconcat.nameconcat;

public class Name {
        private String familyName;
        private String middleName;
        private String givenName;
        private Title title;

        public Name(String familyName, String middleName, String givenName, Title title) {
                this.familyName = familyName;
                this.middleName = middleName;
                this.givenName = givenName;
                this.title = title;
        }

        public String concatNameWesternStyle(){
                String wholeName = "";
                if(title != null){
                        wholeName = title.getTitlevalue();
                        wholeName = wholeName.concat(" ");
                }
                wholeName = wholeName.concat(givenName + " ");
                if(middleName != null && middleName != ""){
                        wholeName = wholeName.concat(middleName + " ");
                }
                wholeName = wholeName.concat(familyName);

                return wholeName;
        }

        public String concatNameHungarianStyle(){
                String wholeName = "";
                if(title != null){
                        wholeName = title.getTitlevalue();
                        wholeName += " ";
                }
                wholeName += givenName + " ";
                if(middleName != null && middleName != ""){
                        wholeName += middleName + " ";
                }
                wholeName += familyName;

                return wholeName;
        }
}
