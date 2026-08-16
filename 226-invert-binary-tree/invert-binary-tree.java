class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null ;
        return FreeNode(root);
    }
    public TreeNode FreeNode(TreeNode root1){
        if(root1 == null) return null;
        Swap(root1);
        FreeNode(root1.left);
        FreeNode(root1.right);
        return root1;
    }
    
    public void Swap(TreeNode root1){
        TreeNode temp = root1.left;
        root1.left = root1.right ;
        root1.right = temp;
    }
}