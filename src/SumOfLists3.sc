def sum(numberList: List[Int]): Int = {
  if (numberList == Nil) 0
  else numberList.head + sum(numberList.tail)
}

// Driver Code
println(sum(List(1, 2, 3, 4, 5)))
println(sum(List(2, 4, 6, 8, 10)))