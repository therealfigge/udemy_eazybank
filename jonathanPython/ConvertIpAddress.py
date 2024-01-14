from supportCIpA import convertIntToBinary, ipAddressSplit

ipAddress = "192.168.0.112"

ipAddressList = ipAddressSplit(ipAddress)

num1 = ipAddressList[0]
num2 = ipAddressList[1]
num3 = ipAddressList[2]
num4 = ipAddressList[3]

binList = []

binList = convertIntToBinary(255)

print("Binary for one number: " + str(binList))
print("Ip address: " + str(ipAddressList))

