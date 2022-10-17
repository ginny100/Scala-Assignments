def factorial(x: Int): Int = {
  def loop(accumulator: Int, x: Int): Int = {
    if (x == 0) accumulator
    else loop(accumulator * x, x - 1)
  }
  loop(1,x)
}

// Driver Code
print(factorial(4))