def displayInfo(filename):
    """ display all the information form  text file of land information. it uses single arguments 'filename'
    if the specified file is not founds it throws file not found exception """
    try:
        gap = ' ' * 3  # inter-field gap or 3 spaces
        heading = f"| {'Kitta No.':<10s} | {gap}{'City/District':<20s} | {gap}{'Direction':<10s} | {gap}{'Area(anna)':<10s} | {gap}{'Price':<10s} | {gap}{'Availability':<15s} |"
        print("=" * 108)
        print(heading)
        print("-" * 108)

        with open(filename, 'r') as file:
            for line in file:
                data = line.strip().split(',')

                rec = f"| {data[0]:<10s} | {gap}{data[1]:<20s} | {gap}{data[2]:<10s} | {gap}{data[3]:<10s} | {gap}{data[4]:<10s} | {gap}{data[5]:<15s} |"
                print(rec)

        print("=" * 108)
    except FileNotFoundError as exception:
        print("File not found")
        print(" ")
















