package n69_sqrt_x

func mySqrt(x int) int {
	r := int64(x)
	for r*r > int64(x) {
		r = (r + int64(x)/r) / 2
	}
	return int(r)
}
