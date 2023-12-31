package main

func canCompleteCircuit(gas []int, cost []int) int {
	res, total, sg, sc := 0, 0, 0, 0
	for i := 0; i < len(gas); i++ {
		sg += gas[i]
		sc += cost[i]
	}

	if sg < sc {
		return -1
	}

	for i := 0; i < len(gas); i++ {
		total += gas[i] - cost[i]
		if total < 0 {
			total = 0
			res = i + 1
		}
	}

	return res
}
