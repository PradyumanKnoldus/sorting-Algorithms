import org.scalatest.flatspec.AnyFlatSpec

class SelectionSortTest extends AnyFlatSpec {

  val sort = new SelectionSort()

  "SelectionSort" should "return an empty list when given an empty list" in {
    val input = List.empty[Int]
    val expectedOutput = List.empty[Int]
    assert(sort.selectionSort(input) == expectedOutput)
  }

  "SelectionSort" should "sort a list of integers in ascending order" in {
    val input = List(4, 2, 7, 1, 3)
    val expectedOutput = List(1, 2, 3, 4, 7)
    assert(sort.selectionSort(input) == expectedOutput)
  }

}
