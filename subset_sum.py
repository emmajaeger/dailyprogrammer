def subset_sum(lst):
	if len(lst) == 0:
		return False
	else:
		for j in range(len(lst)):
			for k in range(len(lst)):
				if lst[j] + lst[k] == 0:
					return True
		return False