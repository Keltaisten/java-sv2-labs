package algorithmstransformation.family;

import java.util.ArrayList;
import java.util.List;

public class Family {
    List<FamilyMember> familyMemberList;

    public Family(){
        familyMemberList = new ArrayList<>();
    }

    public void addFamilyMember(FamilyMember familyMember){
        familyMemberList.add(familyMember);
    }

    public List<Integer> getAgesOfFamilyMembersWithNameGiven(String firstName){
        List<Integer> transformedList = new ArrayList<>();
        for(FamilyMember fm: familyMemberList){
            if(fm.getName().contains(firstName)){
                transformedList.add(fm.getAge());
            }
        }
        return transformedList;
    }

    public List<FamilyMember> getFamilyMemberList() {
        return familyMemberList;
    }
}
