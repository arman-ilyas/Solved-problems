import numpy as np
from scipy import stats

firstLine = input().split()
data = input().split()
type(data)
data2 =[float(i) for i in data]
print(round(np.mean(data2),1))
print(round(np.median(data2),1))
mode = stats.mode(data2)
print(int(mode[0]))






