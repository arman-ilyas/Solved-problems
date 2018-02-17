
# coding: utf-8

# In[1]:


1+1


# In[2]:


print(hello)


# In[3]:


print("HELLO")


# In[4]:


1+1
2+2


# In[5]:


print("версия scikit-learn: {}".format(sklearn.__version__))


# In[4]:


2**0.5


# In[7]:


a = 5
print(_a**_a)


# In[15]:


my_string = "tom soyer"
print(my_string[:2])


# In[ ]:


myList = [1, 2, 3]
myList.


# In[ ]:


import numpy as np

a = np.array([[10, 7, 4], [3, 2, 1]])
np.median(a)


# In[3]:


nb = input('Choose a number: ')


# In[ ]:


import numpy as np

data = input('Choose a number: ').split(" ")
type(data)
data2 =[float(i) for i in data]
print(np.mean(data2))
print(np.median(data2))
print(np.mode(data2))


# In[1]:


import numpy as np

data = input('Choose a number: ').split(" ")
type(data)
data2 =[float(i) for i in data]
print(np.mean(data2))
print(np.median(data2))
print(np.mode(data2))


# In[13]:


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


# In[ ]:




