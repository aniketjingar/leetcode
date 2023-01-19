class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> magazineLetters = new HashMap<>();
        
        for (Character ch: magazine.toCharArray()) {
            int count = magazineLetters.getOrDefault(ch, 0);
            magazineLetters.put(ch, count+1);
        }
        
        for (Character ch: ransomNote.toCharArray()) {
            int count = magazineLetters.getOrDefault(ch, 0);
            if (count == 0) {
                return false;
            }
            magazineLetters.put(ch, count - 1);
        }
        return true;
    }
}
