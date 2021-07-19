def int_to_binary(n):
    # WILL format int as binary return a string
    return format(n,'b')

def str_to_binary(string):
    # give the represented number for each character by ord()
    # then format that number as binary
    #lastly turn the list of strings into string
    return ' '.join(format(ord(c), 'b') for c in string)

def decimalInt_to_binary_algo(n):
    """
    the Decimal Int to binary Algorithm:
    divide the integer by 2 and get the result reminder '%'
    then divide the result by 2 again and again until resut will be equal 1
    the result has to be int no decimal should take place so 5.7 will equal 5
    final step save the remiders and put them in reverse order
    """
    #define list with one object
    arr = [n]
    while arr[-1] != 1:
        #append list with the last item division by two 
        #remeber it has to be INT
        arr.append(int(arr[-1]/2))
    #when last item will equal 1 the loop stops
    #made a list of reminders of the reversed list
    #turn every item to string instead of int so it will be able to joined as one string
    return ''.join([str(i%2) for i in arr[::-1]])
