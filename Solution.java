/*
rm *.class
/usr/local/Cellar/openjdk/21.0.2/bin/javac *.java
/usr/local/Cellar/openjdk/21.0.2/bin/java Main
*/

import java.io.*;
import java.util.*;

class Solution {

    int sum = 0;

    public int RangeSumBST(TreeNode root, int low, int high) {
        if (root == null) {
            return 0;
        }
        // inorder traversal 
        // left , root , right
        int val1 = RangeSumBST(root.left, low, high);

        if (low <= root.val && root.val <= high) {
            sum = sum + root.val;
        }

        int val2 = RangeSumBST(root.right, low, high);

        return sum;
    }
}



