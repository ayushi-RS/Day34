class Solution {
    int sum = 0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        helper(root, low, high);
        return sum;
    }
    public void helper(TreeNode root, int l, int h){
        if(root==null)
            return;
        if(l<=root.val && h>=root.val)
            sum+=root.val;
        if(root.val > l)
            helper(root.left,l,h);
        if(root.val < h)
            helper(root.right,l,h);
    }
}