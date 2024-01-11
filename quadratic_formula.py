"""
quadratic_formula.py computes the roots of a quadratic equation; version 2
"""
# ^This isn't quite right, but we are not writing this code in OOP style yet. We will correct this once we're writing our code in that way

import math


def quadratic_formula(a:float, b:float, c:float) -> tuple:
  """Returns tuple of roots using coefficients of a quadratic provided 
  """
  try:
    root_one = (-b + math.sqrt(b**2 - 4*a*c))/ (2*a)
    root_two = (-b - math.sqrt(b**2 - 4*a*c))/ (2*a)  
  except:
    return None, None

  return root_one, root_two


def coefficient_inputs() -> tuple:
  """Prompts user to enter coefficients of a quadratic
  """
  
  print("Enter the coefficients for the quadratic ax^2 + bx + c")
  
  a = float(input("Enter the value of a:"))
  b = float(input("Enter the value of b:"))
  c = float(input("Enter the value of c:"))
  
  return a, b, c

def display_roots(root_one, root_two):
  """Prints the values provided
  """
  print("Your zeros are " + str(root_one) + ", " + str(root_two))



#calling all the functions
#if imported, these lines won't be called thanks to __main__
#if program is ran as a file, these lines will be called
if __name__ == '__main__':
  ai, bi, ci = coefficient_inputs()
  r1, r2 = quadratic_formula(ai, bi, ci)
  display_roots(r1, r2)



