while True:
    print("\nRock - Paper - Scissors Game")

    p1 = input("Player 1 enter (rock/paper/scissors): ").lower()
    p2 = input("Player 2 enter (rock/paper/scissors): ").lower()

    # Check for valid inputs
    if p1 not in ["rock", "paper", "scissors"] or p2 not in ["rock", "paper", "scissors"]:
        print("Invalid input! Please enter rock, paper, or scissors.")
        continue

    # Check result
    if p1 == p2:
        print("It's a tie!")
    elif (p1 == "rock" and p2 == "scissors") or \
         (p1 == "paper" and p2 == "rock") or \
         (p1 == "scissors" and p2 == "paper"):
        print("Player 1 wins!")
    else:
        print("Player 2 wins!")

    # Ask to play again
    choice = input("Do you want to play again? (yes/no): ").lower()
    if choice != "yes":
        print("Game ended.")
        break