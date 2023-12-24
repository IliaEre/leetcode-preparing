package main

type TreeNode struct {
	Val   int
	Left  *TreeNode
	Right *TreeNode
}

func maxPathSum(root *TreeNode) int {
	maximum := -1001
	dfs(root, &maximum)
	return maximum
}

func dfs(root *TreeNode, maximum *int) int {
	if root == nil {
		return 0
	}

	left := max(0, dfs(root.Left, maximum))
	right := max(0, dfs(root.Right, maximum))

	*maximum = max(*maximum, root.Val+left+right)
	return max(left, right) + root.Val
}
