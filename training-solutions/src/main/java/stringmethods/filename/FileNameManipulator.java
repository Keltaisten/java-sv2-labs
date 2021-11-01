package stringmethods.filename;

public class FileNameManipulator {
    public char findLastCharacter(String str){
        return str.trim().charAt(str.trim().length()-1);
    }

    public String findFileExtension(String fileName){
        return fileName.trim().substring(fileName.trim().indexOf('.')+1);
    }

    public boolean identifyFilesByExtension(String ext, String fileName){
        return findFileExtension(fileName).equalsIgnoreCase(ext.trim());
    }

    public boolean compareFilesByName(String searchedFileName, String actualFileName){
        return findFileName(actualFileName).equalsIgnoreCase(findFileName(searchedFileName));
    }

    public String findFileName(String fileName){
        return fileName.trim().substring(0,fileName.trim().indexOf('.'));
    }

    public String changeExtensionToLower(String fileName){
        fileName = findFileName(fileName) + "." + findFileExtension(fileName).toLowerCase();
        return fileName;
    }

    public String replaceStringPart(String fileName, String present, String target){
        fileName = fileName.replace(present,target);
        return fileName;
    }

    public static void main(String[] args) {
        FileNameManipulator fNManipulator = new FileNameManipulator();
        String file = "   program.exe  ";
        String searchedFile = " program.exe ";

        System.out.println(fNManipulator.findLastCharacter(file));
        System.out.println(fNManipulator.findFileExtension(file));
        System.out.println(fNManipulator.identifyFilesByExtension("exe",file));
        System.out.println(fNManipulator.compareFilesByName(searchedFile,file));
        System.out.println(fNManipulator.findFileName(file));
        System.out.println(fNManipulator.changeExtensionToLower(file));
        System.out.println(fNManipulator.replaceStringPart(file, "program", "adat"));
    }
}
