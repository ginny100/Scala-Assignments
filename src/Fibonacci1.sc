def fib(n: Int): Int = {
  if (n == 0 || n == 1)
    n
  else
    fib(n - 1) + fib(n - 2)
}

// Driver Code
print(fib(1))
print(fib(10))