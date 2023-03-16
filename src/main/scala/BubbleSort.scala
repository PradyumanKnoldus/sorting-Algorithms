import scala.annotation.tailrec

class BubbleSort {

  // Sorts the given input list using the bubble sort algorithm.
  def bubbleSort(inputList: List[Int]): List[Int] = {

    // Repeatedly applies the `sort` function to the input list until it is fully sorted.
    @tailrec
    def loop(list: List[Int], count: Int): List[Int] = {
      if (count == list.length - 1) list
      else loop(sort(list), count + 1)
    }

    // Sorts the given list by comparing adjacent elements and swapping them if they are in the wrong order.
    def sort(list: List[Int]): List[Int] = list match {
      case Nil => Nil
      case head :: Nil => List(head)
      case firstElement :: secondElement :: tail =>
        if (firstElement > secondElement) secondElement :: sort(firstElement :: tail)
        else firstElement :: sort(secondElement :: tail)
    }

    loop(inputList, 0)
  }
}