from supportCIpA import convertIntToBinary, ipAddressSplit

ipAddress = "192.168.0.112"

ipAddressList = ipAddressSplit(ipAddress)

num1 = int(ipAddressList[0])
num2 = int(ipAddressList[1])
num3 = int(ipAddressList[2])
num4 = int(ipAddressList[3])

#print("Number 1 (Integer): " + str(num1))

print("Number 1 (Binary): " + str(convertIntToBinary(num1)))
print("Number 2 (Binary): " + str(convertIntToBinary(num2)))
print("Number 3 (Binary): " + str(convertIntToBinary(num3)))
print("Number 4 (Binary): " + str(convertIntToBinary(num4)))

print("Ip address: " + str(ipAddressList))