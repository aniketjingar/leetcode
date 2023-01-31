class Solution {
    public int numUniqueEmails(String[] emails) {

        Set<String> uniqueEmails = new HashSet<>();

        for (String email: emails) {
            String[] emailDetails = email.split("@");

            String localName = emailDetails[0];
            String domainName = emailDetails[1];

            localName = localName.split("\\+")[0];
            localName = localName.replace(".", "");

            uniqueEmails.add(localName+"@"+domainName);
        }

        return uniqueEmails.size();
    }
}