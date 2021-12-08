#Monte Carlo
import random
import matplotlib.pyplot as plt
import math

INTERVAL = 100000
x = []
y = []

rectangle = 0
for i in range(INTERVAL):
    rand_x= random.uniform(0, 4)
    x.append(rand_x)
    rand_y= random.uniform(0, 4)
    y.append(rand_y)
    if((0 <= rand_x) and (rand_x <= 1) and (0 <= rand_y) and (rand_y <= 3)):
        rectangle += 1
    if((1 <= rand_x) and (rand_x <= 2) and (1 <= rand_y) and (rand_y <= 3)):
        rectangle += 1
    if((2 <= rand_x) and (rand_x <= 4) and (1 <= rand_y) and (rand_y <= 2)):
        rectangle += 1
    if((3 <= rand_x) and (rand_x <= 4) and (0 <= rand_y) and (rand_y <= 1)):
        rectangle += 1
plt.scatter(x, y)
result = (rectangle * 16)/ INTERVAL
print(rectangle, result)
plt.show()
