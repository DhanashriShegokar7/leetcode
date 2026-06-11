class Solution {
    public String convertToTitle(int columnNumber) {

        StringBuilder ans = new StringBuilder();

        while (columnNumber > 0) {

            columnNumber--;   // make it 0-based

            int rem = columnNumber % 26;

            ans.append((char) ('A' + rem));

            columnNumber /= 26;
        }

        return ans.reverse().toString();
    }
}