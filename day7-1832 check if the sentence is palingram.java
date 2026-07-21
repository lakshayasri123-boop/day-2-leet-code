class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] seen=new boolean[26];
        int count=0;
        for(char c: sentence.toCharArray()) {
            int idx=c - 'a';
            if (!seen[idx]) {
                seen[idx]=true;
                count++;
        }
        }
        return count==26;
    }
}
