/**
 * Newton’s Method in computing the Square Root of x
 * * Newton’s method is used for approximating solutions.
 * * It is an iterative process and starts with an initial estimate which is used to find a better approximation which is then further used to find a better approximation until we reach the required result.
 *
 * This implementation does not use nested functions
 */

/**
 *
 * @param x
 * @return the absolute value of a given number
 */
def abs(x: Double) =
  if (x < 0) -x else x

/**
 *
 * @param guess
 * @param x
 * @return if the average is close enough to the actual value
 */
def isGoodEnough(guess: Double, x: Double) =
  abs(guess * guess - x) / x < 0.0001

/**
 *
 * @param guess
 * @param x
 * @return the average of y and x/y
 */
def improve(guess: Double, x: Double) =
  (guess + x / guess) / 2

/**
 *
 * @param guess
 * @param x
 * @return compute each iteration of Newton’s method
 */
def sqrtIter(guess: Double, x: Double): Double =
  if (isGoodEnough(guess, x)) guess
  else sqrtIter(improve(guess, x), x)

/**
 *
 * @param x
 * @return the square root of the given number
 */
def sqrt(x: Double) =
  sqrtIter(1.0, x)

// Driver Code
val result = sqrt(4)

println(result)