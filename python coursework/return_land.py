import time
from datetime import datetime
def return_land(file_name, kitta_no, customer_name, rent_dur, return_dur, ph_number):
    """ This is the function for returning the rented land.
    The arguments used in this function are file_name, kitta_no, customer_name, ret_dur, return_dur, ph_number"""
    now = datetime.now()
    formatted_datetime = now.strftime(" %H:%M:%S")
    date = now.date()
    try:
        with open(file_name, 'r') as file:
            lines = file.readlines()
        for i, line in enumerate(lines):
            if line.startswith(kitta_no):
                data = line.strip().split(', ')
                if kitta_no == data[0] and data[5] == "Rented":
                    lines[i] = f"{data[0]}, {data[1]}, {data[2]}, {data[3]}, {data[4]}, Available\n"
                    invoice_name = f"Return_{customer_name}_{datetime.now().strftime('%Y-%m-%d_%H-%M-%S')}.txt"
                    with open(invoice_name, 'w') as invoice:
                        invoice.write("=======================Invoice for returning land ========================\n")
                        invoice.write(f"Date:{date} \t\t\t\t\t\t\t\t\tTime:{formatted_datetime}\n")
                        invoice.write("------------------------------------------------------------------------------\n")
                        invoice.write(f"Customer Name: {customer_name}\n")
                        invoice.write(f"Phone Number: +977-{ph_number}\n")
                        invoice.write(f"Kitta Number: {data[0]}\n")
                        total_amount = int(data[4]) * rent_dur
                        invoice.write(f"Total Amount to pay: {total_amount}\n")
                        invoice.write(f"City/District: {data[1]}\n")
                        invoice.write(f"Direction: {data[2]}\n")
                        invoice.write(f"Date and Time of Return: {datetime.now().strftime('%Y-%m-%d %H:%M:%S')}\n")
                        if return_dur > rent_dur:
                            total_amount = int(data[4]) * rent_dur
                            invoice.write(f"Total Amount without fine: {total_amount}\n")
                            fine_amount = 0.1 * total_amount*(return_dur-rent_dur)
                            total_amount += fine_amount
                            invoice.write(f"Total Amount with fine: RS.{total_amount}\n")
                        elif return_dur <= rent_dur:
                            total_amount = int(data[4]) * rent_dur
                            invoice.write(f"Total Amount: RS.{total_amount}\n")
                        invoice.write("--------------------------------------------------------------------------\n\n")
                        # invoice.write(f"You have been fined for {fine_amount} as your deadline exceeds")
                        print("\nPrinting Invoice!!!!!!!!!!!!!!")
                        print("Please Wait!!!!!!!!!!\n")
                        time.sleep(5)
                        print("=======================Invoice for returning land ========================")
                        print(f"Date:{date} \t\t\t\t\t\tTime:{formatted_datetime}\n")
                        print("------------------------------------------------------------------------------")
                        print(f"Customer Name: {customer_name}")
                        print(f"{'Phone Number:':<20} +977-{ph_number}")
                        print(f"Kitta Number: {data[0]}")
                        print(f"City/District: {data[1]}")
                        print(f"Direction: {data[2]}")
                        print(f"Date and Time of Return: {datetime.now().strftime('%Y-%m-%d %H:%M:%S')}")
                        print(f"Total amount: {total_amount}")
                        print("------------------------------------------------------------------------------")
                        print("\nLand returned successfully!")
                    break
        else:
            print("Land not found or not rented.")

        with open(file_name, 'w') as file:
            file.writelines(lines)
    except FileNotFoundError:
        print("File not found!")
    except Exception as e:
        print("An error occurred:", str(e))