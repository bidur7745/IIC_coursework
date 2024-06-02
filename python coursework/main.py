# main
import time

from display_land_info import displayInfo
from rent_land import rent_land
from return_land import return_land

def print_header():
    """ Header message """
    print("\n\n|***************************************************************|")
    print("|-----------------Welcome to Land Rental system-----------------|")
    print("|***************************************************************|")

def print_menu():
    """ display the list of menu for using land rental system """
    border = "=" * 50
    print(border)
    time.sleep(1)
    print("||{:^46}||".format("Welcome to the Menu"))
    time.sleep(0.8)
    print(border)
    time.sleep(0.6)
    print("|| {:<44} ||".format("1. Display Land Information"))
    time.sleep(0.7)
    print("|| {:<44} ||".format("2. Rent Land"))
    time.sleep(0.4)
    print("|| {:<44} ||".format("3. Return Rented Land"))
    time.sleep(0.2)
    print("|| {:<44} ||".format("4. Exit"))
    time.sleep(0.1)
    print(border)

def print_footer():
    """ Footer message"""
    print("\n\n****************************************************************")
    print("<<<<<<<<<<<<<<<<<<<<Thank you for choosing us!!!!>>>>>>>>>>>>>>>")
    print("****************************************************************")


def char():
    print("----------------------------------------------------------------")


def error_input():
    """Error Message"""
    print(
        "************************************************************************\n"
        "*           Invalid Input. PLease input 1,2,3,4, as input              *\n"
        "************************************************************************\n"
    )

def validate_kitta_number(kitta_no, land_data):
        """
        This is the validation function designed to validate the kitta number input by the user
         returns true if the kitta number exist in file otherwise it is false
        """
        for line in land_data:
            data = line.strip().split(',')
            if kitta_no in data:
                return True
        print("Kitta number not found. Please enter the valid kita number")
        return False


def validate_duration(duration):
    """
    Validate the duration of rent and return provided by the user. returns True if the duration is a positive integer, False otherwise.
    """
    while True:
                try:
                    duration = int(duration)
                    if duration > 0:
                        return duration
                    else:
                        print("Duration must be a positive integer.")
                except ValueError:
                    print("Duration must be a positive integer.")
                duration = input("Enter the duration of rent (in months): ")




def is_land_rented(kitta_no, file_name):
    """
    Check if the land with the given kitta number is already rented.
    Returns True if the land is rented, False otherwise.
    """
    with open(file_name, 'r') as file:
        for line in file:
            data = line.strip().split(',')
            if kitta_no == data[0]:
                if data[-1].strip() == "Rented":
                    return True
                else:
                    return False
    return False


def main():
    """ The main method of the program from where all the function are called in loop"""
    file_name = "land_info.txt"
    print_header()
    while True:

        print_menu()

        choice = input("Enter your choice: ")
        print()

        if choice == "1":
            displayInfo(file_name)
        elif choice == "2":
            while True:
                kitta_no = input("Enter the kitta number of the land to rent: ")
                if validate_kitta_number(kitta_no, open(file_name)):
                    break  # Exit the loop if the kitta number is valid
            customer_name = input("Enter your name: ")
            duration = validate_duration(input("Enter the duration of rent (in months): "))
            ph_number = input("Enter your phone number: ")
            rent_land(file_name, kitta_no, customer_name, duration, ph_number)
        elif choice == "3":
            while True:
                kitta_no = input("Enter the kitta number of the rented land to return: ")
                if validate_kitta_number(kitta_no, open(file_name)):
                    break  # Exit the loop if the kitta number is valid
            customer_name = input("Enter your name: ")
            rent_dur = validate_duration(input("Enter the duration of rent (in months): "))
            return_dur = validate_duration(input("Enter the duration of return (in months): "))
            ph_number = input("Enter your phone number: ")
            return_land(file_name, kitta_no, customer_name, rent_dur, return_dur, ph_number)
        elif choice == "4":
            print_footer()
            break
        else:
            error_input()
            print("Invalid choice. Please enter a valid option.")


if __name__ == "__main__":
    main()

