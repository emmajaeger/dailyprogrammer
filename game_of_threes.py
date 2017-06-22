def game_of_threes(input):
	input = int(input)
	if input == 1:
		print(1)
	elif input % 3 == 0:
		print(input, 0)
		game_of_threes(input / 3)
	elif (input + 1) % 3 == 0:
		print(input, 1)
		game_of_threes((input + 1) / 3)
	elif (input - 1) % 3 == 0:
		print(input, -1)
		game_of_threes((input - 1) / 3)