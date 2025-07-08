/*********************************************************

 Following is the BinaryTreeNode structure:

 class BinaryTreeNode<T> {
     T data;
     BinaryTreeNode<T> left;
     BinaryTreeNode<T> right;
     BinaryTreeNode() {
         this.data = null;
         this.left = null;
         this.right = null;
     }
     BinaryTreeNode(T data) {
         this.data = data;
         this.left = null;
         this.right = null;
     }
     BinaryTreeNode(T data, BinaryTreeNode<T> left, BinaryTreeNode<T> right) {
         this.data = data;
         this.left = left;
         this.right = right;
     }
 };
 ********************************************************/

public class Solution {
    public static BinaryTreeNode<Integer> deleteNode(BinaryTreeNode<Integer> root, int key) {
        // Write your code here.
		if(root==null){
			return null;
		}

		if(key<root.data){
			root.left=deleteNode(root.left, key);
		}
		else if(key>root.data){
			root.right=deleteNode(root.right, key);
		}
		else {
			if(root.left==null){
				return root.right;
			}
			else if(root.right==null){
				return root.left;
			}

			root.data=minVal(root.right);

			root.right=deleteNode(root.right, root.data);
		}

		return root;
    }

	public static int minVal(BinaryTreeNode<Integer> root){
		int mini=root.data;

		while(root.left!=null){
			root=root.left;
			mini=root.data;
		}

		return mini;
	}
}