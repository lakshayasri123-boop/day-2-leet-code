import java.util.*;

class ThroneInheritance {

    HashMap<String, List<String>> family = new HashMap<>();
    HashSet<String> dead = new HashSet<>();
    String king;

    public ThroneInheritance(String kingName) {
        king = kingName;
        family.put(kingName, new ArrayList<>());
    }

    public void birth(String parentName, String childName) {
        family.get(parentName).add(childName);
        family.put(childName, new ArrayList<>());
    }

    public void death(String name) {
        dead.add(name);
    }

    public List<String> getInheritanceOrder() {
        List<String> ans = new ArrayList<>();
        dfs(king, ans);
        return ans;
    }

    void dfs(String name, List<String> ans) {
        if (!dead.contains(name))
            ans.add(name);

        for (String child : family.get(name))
            dfs(child, ans);
    }
}
1600
