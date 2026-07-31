class Solution {
    public String[] findWords(String[] words) {
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";

        ArrayList<String> ans = new ArrayList<>();

        for (String word : words) {
            String lower = word.toLowerCase();
            String currentRow;

            char first = lower.charAt(0);
            if (row1.indexOf(first) != -1) {
                currentRow = row1;
            } else if (row2.indexOf(first) != -1) {
                currentRow = row2;
            } else {
                currentRow = row3;
            }

            boolean valid = true;
            for (char ch : lower.toCharArray()) {
                if (currentRow.indexOf(ch) == -1) {
                    valid = false;
                    break;
                }
            }
            if (valid) {
                ans.add(word);
            }
        }
        return ans.toArray(new String[0]);

    }
}