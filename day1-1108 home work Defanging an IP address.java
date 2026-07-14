class Solution {
    public String defangIPaddr(String address) {
        StringBuilder result = new StringBuilder();

        for (char ch : address.toCharArray()) {
            if (ch == '.') {
                result.append("[.]");
            } else {
                result.append(ch);
            }
        }

        return result.toString();
    }
}
