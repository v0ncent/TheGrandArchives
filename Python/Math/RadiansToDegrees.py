from math import pi as pi


# using math.pi we can create two algorithms for converting degrees to radians and vice versa

# radians to degrees
def radians_to_degrees(rad):
    return 180 * rad / pi


# degrees to radians
def degrees_to_radians(degrees):
    return degrees * (pi / 180)
