package main

type TreeNode struct {
	Val   int
	Left  *TreeNode
	Right *TreeNode
}

func sortedArrayToBST(nums []int) *TreeNode {
	return helper(nums, 0, len(nums))
}

func helper(nums []int, left, right int) *TreeNode {
	if left > right {
		return nil
	}

	mid := left + ((right - left) / 2)
	root := &TreeNode{Val: nums[mid]}
	root.Left = helper(nums, left, mid-1)
	root.Right = helper(nums, mid+1, right)
	return root
}

func main() {
	arr := []int{-10, -3, 0, 5, 9}
	sortedArrayToBST(arr)
}
