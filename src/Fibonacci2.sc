def fib(n: Int): Int = n match {
  case 0 => n
  case 1 => n
  case n => fib(n - 1) + fib(n - 2)
}

// Driver Code
print(fib(1))
print(fib(10))