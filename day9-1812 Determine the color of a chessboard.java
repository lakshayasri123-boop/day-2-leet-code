class Solution {
    public boolean squareIsWhite(String coordinates) {
        char col=coordinates.charAt(0);
        char row=coordinates.charAt(1);

        int colNumber=col - 'a'+1;
        int rowNumber=row-0;

        return (colNumber+rowNumber) % 2!=0;
    }
}
