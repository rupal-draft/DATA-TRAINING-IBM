# Rock-Paper-Scissors with loop

while(True):
    player_1 = input("Player 1, Enter rock, paper, or scissors: ").lower()
    player_2 = input("Player 2, Enter rock, paper, or scissors: ").lower()

    if player_1 == player_2:
        print("It's a tie!")
    elif player_1 == 'rock':
        if player_2 == 'scissors':
            print("Player 1 wins!")
        else:
            print("Player 2 wins!")
    elif player_1 == 'scissors':
        if player_2 == 'paper':
            print("Player 1 wins!")
        else:
            print("Player 2 wins!")
    elif player_1 == 'paper':
        if player_2 == 'rock':
            print("Player 1 wins!")
        else:
            print("Player 2 wins!")

    play_again = input("Do you want to play again? (Y/N)").lower()
    if play_again == 'y' or play_again == 'yes':
        pass
    else:
        break