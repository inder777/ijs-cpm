# ijs-cpm
Car Park Manager is a java application which takes parking details as input and perform these three functionalities:
park - park the car to the nearest space available to the entrance
unpark - unpark the car with the provided ticket numbere
compact - compact the unoccupied spaces near the entrance.

Apporach : Approach used
The provided input is in string format with comma separated values. By parsing the input and getting the ticketNumber or license details of the car from it.

I have used HashMap as Data structure which stores ticketNumber as a key (which is unique always) and value as license Number. The main reason of using HashMap is to get the above mentioned mapping and for the faster retireval of the license number.

Park : 
validates the size of the HashMap and if the size is zero, it will assign the initial ticket number (i.e. 5000) else it will get qa new incremented ticket number and put the ticket number and license details in to the HashMap

Unpark : 
validates if the given ticket number is present in the hashmap or not. If it is present, then remove the license number details from that entry

compact:
validates if hashmap is empty, then nothing to compact. Else, compact the null values in the hashmap.


i/p and o/p scenarios:

i/p:
pABC,pFGH,pGHI
o/p:
ABC,FGH,GHI

i/p:
u5000
o/p: 
INVALID TIKCET DETAILS

i/p:
pABC,pXYZ,pEFG,u5001,pnew5001
o/p:
ABC,,EFG,new5001,

i/p:
pABC,pXYZ,pEFG,u5000,c
o/p:
XYZ,EFG,,,,,,,,

i/p:
pABC,pFGH,c
o/p:
ABC,FGH,

i/p:
pABC,pXYZ,pEFG,u5001,pRAT,u5002,c
o/p:
ABC,RAT,,,


