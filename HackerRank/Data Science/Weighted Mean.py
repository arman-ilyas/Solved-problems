## solution using numpy
#import numpy as np
#from scipy import stats
##inputs
#firstLine = input().split()
#data = input().split()
#data_in_int =[int(i) for i in data]
#data2 = input().split()
#data_in_int2 =[int(i) for i in data2]
##logic
#print(round(np.average(data_in_int, weights=data_in_int2)))
# solution using manual calculation
firstLine = input().split()
data = input().split()
data_in_int =[int(i) for i in data]
data2 = input().split()
data_in_int2 =[int(i) for i in data2]
upper_sum = 0
lower_sum = 0
for x in range(0,len(data_in_int)):
    upper_sum = upper_sum + data_in_int[x] * data_in_int2[x]
    lower_sum = lower_sum + data_in_int2[x] 
result = upper_sum/lower_sum
print(round(result,1))