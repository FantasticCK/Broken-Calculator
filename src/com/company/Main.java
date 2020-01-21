package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}

class Solution {
    public int brokenCalc(int X, int Y) {
        if (X == Y)
            return 0;
        if (Y < X)
            return X - Y;

        return Y % 2 == 0 ? brokenCalc(X, Y / 2) + 1 : brokenCalc(X, (Y + 1) / 2) + 2;
    }
}