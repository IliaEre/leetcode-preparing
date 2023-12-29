package main

type MinStack struct {
	Head *Node
}

type Node struct {
	Value, Min int
	Next       *Node
}

func Constructor() MinStack {
	return MinStack{}
}

func (this *MinStack) Push(val int) {
	if this.Head == nil {
		this.Head = &Node{Value: val, Next: nil, Min: val}
	} else {
		this.Head = &Node{Value: val, Next: this.Head, Min: min(this.Head.Min, val)}
	}
}

func (this *MinStack) Pop() {
	this.Head = this.Head.Next
}

func (this *MinStack) Top() int {
	return this.Head.Value
}

func (this *MinStack) GetMin() int {
	return this.Head.Min
}

/**
 * Your MinStack object will be instantiated and called as such:
 * obj := Constructor();
 * obj.Push(val);
 * obj.Pop();
 * param_3 := obj.Top();
 * param_4 := obj.GetMin();
 */
