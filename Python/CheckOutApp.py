
def main():
    add_new()
    back_menu()

def add_new():
    name = input("Dear customer what's your name: ")
   

def back_menu():
    input_list = []

    product = input("What do you want to buy: ")
    input_list.append(product)
    print(input_list)

    pieces = input("How many pieces: ")
    input_list.append(pieces)
    print(input_list)

    print("""
   Add more items?

   1. Yes
   2. No
    """)

    option = int(input("Select Option: "))

    match option:
        case 1:
            back_menu()
        case 2:
            second_name = input("Enter your full name: ")
            print("Customer Name: " + second_name + " LEO KASTRO STORES")

            print("""
            You have been given a discount of 10%
            MAIN BRANCH
            LOCATION: 11, ISAAC ADENUGA STREET, AGILITY, MILE12  LAGOS.
            TEL: 03293828343
            Date: 28-AUG-25 8:48:11pm

            ==============================================================
                            "ITEM","QTY","PRICE","TOTAL(NGN)"
            """)
        case _:
            print("Invalid option. Try again.")
            back_menu()


def add_new():
    name = input("Dear customer what's your name: ")


def main():
    add_new()
    back_menu()


if __name__ == "__main__":
    main()
