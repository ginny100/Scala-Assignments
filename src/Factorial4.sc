def product(f: Int => Int)(a: Int, b: Int): Int ={
  if(a > b) 1
  else f(a) * product(f)(a+1,b)
}

/**
 * Non-recursive Factorial
 * @param n
 * @return
 */
def fact(n: Int) =
  product(x => x)(1, n)

// Driver Code
print(fact(5))