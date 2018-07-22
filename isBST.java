package class05;

public class isBST {
	public boolean isBST(TreeNode root) {
		return isBSTHelper(root,Integer.MIN_VALUE, Integer.MIN_VALUE );
	}
	private boolean isBSTHelper(TreeNode root, int min, int max) {
		if(root == null) {
			return true;
		}
		if(root.value <= min || root.value >= max) {
			return false;
		}
		return isBSTHelper(root.left, min, root.value) && isBSTHelper(root.right,root.value,max);
	}
}