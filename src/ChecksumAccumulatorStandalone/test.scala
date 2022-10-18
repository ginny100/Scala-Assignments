package ChecksumAccumulatorStandalone

import ChecksumAccumulator.calculate

import ChecksumAccumulator.calculate

//standalone object that acts as an entry point for the ChecksumAccumulator application
object EntryApplication {
  def main(args: Array[String]) = {
    for(arg<-args)
      println(arg + ": " + calculate(arg))
  }
}
