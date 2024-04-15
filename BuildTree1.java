public class BuildTree1 {

    public static TreeNode getTree() {

        TreeNode root = new TreeNode(4);

        TreeNode left1 = new TreeNode(2);
        left1.left = new TreeNode(1);
        left1.right = new TreeNode(3);


        TreeNode right1 = new TreeNode(7);
        right1.left = new TreeNode(6);
        right1.right = new TreeNode(9);

        root.left = left1;
        root.right = right1;

        return root;

    }
}