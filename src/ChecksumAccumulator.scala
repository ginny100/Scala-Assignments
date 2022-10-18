/**
 * A checksum is a string of characters consisting of numbers and letters.
 * It acts as a fingerprint for files and messages and is used to ensure the file or message you have received is genuine and error free.
 * To do so, you create a checksum of the file you have received and compare it to the checksum of the source file.
 * Even the most minor of changes will result in a completely different checksum.
 */

class ChecksumAccumulator {
  private var sum = 0

  /**
   * Adding the bytes of a string
   * @param b
   */
  def add(b: Byte) = sum += b

  /**
   * Calculating the final checksum
   * @return
   */
  def checksum() = ~(sum & 0xFF) + 1
}