package collectionsautoboxing;

import java.util.HashMap;
import java.util.Map;

public class Vote {
    public Map<VoteResult, Integer> getResult(Map<String, VoteResult> data) {
        Map<VoteResult, Integer> result = new HashMap<>();
        result.put(VoteResult.YES, 0);
        result.put(VoteResult.NO, 0);
        result.put(VoteResult.ABSTAIN, 0);
        for (VoteResult v : data.values()) {
            if (v == VoteResult.YES) {
                result.replace(VoteResult.YES, result.get(VoteResult.YES) + 1);
            } else if (v == VoteResult.NO) {
                result.replace(VoteResult.NO, result.get(VoteResult.NO) + 1);
            } else if (v == VoteResult.ABSTAIN) {
                result.replace(VoteResult.ABSTAIN, result.get(VoteResult.ABSTAIN) + 1);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Vote vote = new Vote();
        Map<String, VoteResult> datas = new HashMap<>();
        datas.put("John Doe", VoteResult.YES);
        datas.put("Jack Doe", VoteResult.NO);
        datas.put("Jill Doe", VoteResult.YES);
        System.out.println(vote.getResult(datas));
    }
}
