package class05;

public class RangeInorder {
	public void rangeInorder(TreeNode root, int lower, int upper) {
		if(root == null) {
			return;
		}
		if(root.value > upper) {
			rangeInorder(root.left, lower, upper);
		}
		if(root.value < lower) {
			rangeInorder(root.right, lower,upper);
		}
		if(root.value >= lower && root.value <= upper) {
			System.out.println(root.value);
		}
	}
}

class TreeNode{
	TreeNode left;
	TreeNode right;
	int value;
}
