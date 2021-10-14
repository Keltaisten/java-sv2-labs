package stringtype.registration;

public class UserValidator {
        String username;
        String password1;
        String password2;
        String email;

        public void setUsername(String username) {
                this.username = username;
        }

        public void setPassword1(String password1) {
                this.password1 = password1;
        }

        public void setPassword2(String password2) {
                this.password2 = password2;
        }

        public void setEmail(String email) {
                this.email = email;
        }

        public boolean isValidUsername(String username){
                boolean bool = username.length() < 1? false: true;
                return bool;
        }

        public boolean isValidPassword(String password1, String password2){
                boolean boolGreater = password1.length() >= 8? true: false;
                boolean boolEqual = password1.equals(password2)? true: false;
                return boolGreater & boolEqual;
        }

        public boolean isValidEmail(String email){
                boolean boolQ = email.indexOf("@") <1? false: true;
                boolean boolDot = email.indexOf(".") == (email.length() -1) | email.indexOf(".") < 0? false: true;
                boolean boolNotNeighbour = email.indexOf("@") == (email.indexOf(".") - 1)? false: true;
                return boolQ & boolDot & boolNotNeighbour;
        }

}
