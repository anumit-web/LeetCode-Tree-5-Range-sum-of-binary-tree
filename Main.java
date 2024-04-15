/*
/usr/local/Cellar/openjdk/21.0.2/bin/javac *.java
/usr/local/Cellar/openjdk/21.0.2/bin/java Main
*/

import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {

        System.out.println("Range Sum of BST");

        Solution solution = new Solution();

        BuildTree1 tree1 = new BuildTree1();

        TreeNode root1 = tree1.getTree();
        int low = 7;
        int high = 15;
        int sum = solution.RangeSumBST(root1, low, high);
        System.out.println("Output = Range Sum of BST, Binary search tree = " + sum); // how to print tree

    }

}
