/************************************************************

 Following is the TreeNode class structure

 class TreeNode<T>
 {
     T data;
     TreeNode<T> left;
     TreeNode<T> right;

     TreeNode(T data)
     {
         this.data = data;
         left = null;
         right = null;
     }
 };

 ************************************************************/

public class Solution {

    public static int lowestCommonAncestor(TreeNode<Integer> root, int x, int y) {
        //    Write your code here.
        TreeNode<Integer> tnood=helper(root, x, y);

        return (tnood!=null) ? tnood.data : -1;
    }
    private static TreeNode<Integer> helper(TreeNode<Integer> root, int x, int y) {
        //    Write your code here.
        if(root==null){
            return null;
        }
        
        if(root.data==x || root.data==y){
            return root;
        }

        TreeNode<Integer> l=helper(root.left , x, y);
        TreeNode<Integer> r=helper(root.right , x, y);

        if(l!=null && r!=null){
            return root;
        }

        return (l!=null) ? l : r;
    }
}
