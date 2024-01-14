def convertIntToBinary(num):
    bin = [0, 0, 0, 0, 0, 0, 0, 0]       
    i = 0
    currentValue = 128
    
    if (num > 255):
        print("Your number is higher than 255. Your IP address is not valid.")
        bin[0] = 299
    elif (num < 0):
        print("Your number is lower than 0. Your IP address is not valid.")
        bin[0] = 299
    else:    
        while(i < 8): 
            if(num >= currentValue):
                bin[i] = 1
                num = num - currentValue                 
            else:
                bin[i] = 0
            
            #print("Current value: " + str(currentValue))
            currentValue = currentValue / 2            
            i += 1
    
    return bin

def ipAddressSplit(ip):
    ip = ip.split(".")
    return ip