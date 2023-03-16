import scala.annotation.tailrec

class InsertionSort {

  // Sorts the given input list using the insertion sort algorithm.
  def insertionSort(list: List[Int]): List[Int] = {

    // To find the minimum element in the list
    @tailrec
    def findMin(list: List[Int], sortedList: List[Int]): List[Int] = list match {
      case Nil => sortedList
      case head :: tail => findMin(tail, insert(head, sortedList))
    }

    // To insert an element into a sorted list
    def insert(element: Int, sortedList: List[Int]): List[Int] = sortedList match {
      case Nil => List(element)
      case head :: tail =>
        if (element <= head) element :: sortedList
        else head :: insert(element, tail)
    }

    findMin(list, Nil)
  }
}
