def sum(numberList: List[Int]): Int = numberList match {
  // Write your code here
  case Nil => 0
  case _ => numberList.head + sum(numberList.tail)
}

// Driver Code
println(sum(List(1, 2, 3, 4, 5)))
println(sum(List(2, 4, 6, 8, 10)))