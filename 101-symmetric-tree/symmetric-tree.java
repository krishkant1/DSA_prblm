class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true ;
        return mirror(root.left,root.right);
    }
    public boolean mirror(TreeNode root1, TreeNode root2){
        if(root1 == null && root2 == null)return true ;
        if(root1 == null || root2 == null)return false ;
        if(root1.val != root2.val) return false ;

        boolean r1 = mirror(root1.left,root2.right);
        boolean r2 = mirror(root2.left,root1.right);
        return r1 && r2 ;
    }
}