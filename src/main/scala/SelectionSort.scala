import scala.annotation.tailrec

class SelectionSort {

  // Sorts the given input list using the selection sort algorithm.
  def selectionSort(inputList: List[Int]): List[Int] = {

    // To get the minimum value in the list
    def findMin(list: List[Int]): (Int, List[Int]) = list match {
      case Nil => throw new IllegalArgumentException("List is Empty")
      case head :: Nil => (head, Nil)
      case element :: tail =>
        val (minValue, remainingList) = findMin(tail)
        if (element < minValue) (element, minValue :: remainingList) else (minValue, element :: remainingList)
    }

    // Find the minimum value in the list using the findMin function,and recursively call selectionSort on the remaining list to sort it
    inputList match {
      case Nil => Nil
      case _ =>
        val (minValue, remainingList) = findMin(inputList)
        minValue :: selectionSort(remainingList)
    }
  }
}
