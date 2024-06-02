import time
# rent
from datetime import datetime

def rent_land(file_name, kitta_no, customer_name, duration, ph_number):
    """The function is designed for renting the available land on land_info.txt  """
    now = datetime.now()
    formatted_datetime = now.strftime(" %H:%M:%S")
    date = now.date()
    try:
        with open(file_name, 'r') as file:
            lines = file.readlines()
        for i, line in enumerate(lines):
            if line.startswith(kitta_no):
                data = line.strip().split(', ')
                if data[5] == "Available" and kitta_no == data[0]:
                    lines[i] = f"{data[0]}, {data[1]}, {data[2]}, {data[3]}, {data[4]}, Rented\n"
                    invoice_name = f"Invoice_{customer_name}_{datetime.now().strftime('%m-%d')}.txt"
                    with open(invoice_name, 'w') as invoice:
                        # Invoice details
                        invoice.write("=======================Invoice for Land rental System ========================\n")
                        invoice.write(f"Date:{date} \t\t\t\t\t\t\t\t\tTime:{formatted_datetime}\n" )
                        invoice.write("------------------------------------------------------------------------------\n")
                        invoice.write(f"{'Customer Name:':<20} {customer_name}\n")
                        invoice.write(f"{'Phone Number:':<20} +977-{ph_number}\n")
                        invoice.write(f"{'Kitta Number:':<20} {data[0]}\n")
                        invoice.write(f"{'City/District:':<20} {data[1]}\n")
                        invoice.write(f"{'Direction:':<20} {data[2]}\n")
                        invoice.write(f"{'Date & Time of Rent:':<20} {datetime.now().strftime('%Y-%m-%d %H:%M:%S')}\n")
                        invoice.write(f"{'Duration of Rent:':<20} {duration} months\n")
                        total_amount = int(data[4]) * duration
                        invoice.write(f"{'Total Amount:':<20} {total_amount}\n")
                        print("\nPrinting Invoice!!!!!!!!!!!!!!")
                        print("Please Wait!!!!!!!!!!\n")
                        time.sleep(5)
                        invoice.write("==========================================================================")
                        print("=======================Invoice for Land rental System ========================")
                        print(f"Date:{date} \t\t\t\t\t\tTime:{formatted_datetime}" )
                        print("------------------------------------------------------------------------------")
                        print(f"{'Customer Name:':<20} {customer_name}")
                        print(f"{'Phone Number:':<20} +977-{ph_number}")
                        print(f"{'Kitta Number:':<20} {data[0]}")
                        print(f"{'City/District:':<20} {data[1]}")
                        print(f"{'Direction:':<20} {data[2]}")
                        print(f"{'Date and Time of Rent:':<20} {datetime.now().strftime('%Y-%m-%d %H:%M:%S')}")
                        print(f"{'Duration of Rent:':<20} {duration} months")
                        print(f"{'Total Amount:':<20} {total_amount}")
                        print("==========================================================================")
                        print("\nLand rented successfully!")
                    break
        else:
            print("Land not found or already rented.")

        with open(file_name, 'w') as file:
            file.writelines(lines)
    except FileNotFoundError:
        print("File not found!")
    except Exception as e:
        print("An error occurred:", str(e))


