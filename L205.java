class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Character> charMap = new HashMap<>();
        Set<Character> mappedValues = new HashSet<>();

        for(int i=0;i<s.length();i++) {
            if (charMap.containsKey(s.charAt(i)) && charMap.get(s.charAt(i)) != t.charAt(i)) {
                return false;
            } else if (!charMap.containsKey(s.charAt(i)) && mappedValues.contains(t.charAt(i))) {
                return false;
            } 
            charMap.put(s.charAt(i), t.charAt(i));
            mappedValues.add(t.charAt(i));
        }

        return true;
    }

}