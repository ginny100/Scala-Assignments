def factorial(x: Int) : Int =  x match{
  case 1 => 1
  case x => x * factorial(x-1)
}

// Driver Code
print(factorial(4))
