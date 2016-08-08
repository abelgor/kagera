package io.kagera.api

package object multiset {

  type MultiSet[T] = Map[T, Int]

  object MultiSet {

    def empty[T]: MultiSet[T] = Map.empty[T, Int]

    def apply[T](elements: T*) = elements.foldLeft(empty[T]) { case (mset, e) => mset.add(e, 1) }
  }

  implicit class MultiSetOps[T](mset: MultiSet[T]) {
    def multisetDifference(other: MultiSet[T]): MultiSet[T] =
      other.foldLeft(mset) { case (result, (p, count)) =>
        result.get(p) match {
          case None => result
          case Some(n) if n <= count => result - p
          case Some(n) => result + (p -> (n - count))
        }
      }

    def multisetSum(other: MultiSet[T]): MultiSet[T] =
      other.foldLeft(mset) { case (m, (p, count)) =>
        m.get(p) match {
          case None => m + (p -> count)
          case Some(n) => m + (p -> (n + count))
        }
      }

    def multisetSize: Int = mset.values.sum

    def multiplicities(map: MultiSet[T]): Map[T, Int] = map

    def setMultiplicity(map: Map[T, Int])(element: T, m: Int) = map + (element -> m)

    def allElements: Iterable[T] = mset.foldLeft(List.empty[T]) { case (l, (e, count)) =>
      l ++ List.fill(count)(e)
    }

    def add(element: T, count: Int): Map[T, Int] = mset + (element -> (1 + mset.getOrElse(element, 0)))

    def remove(element: T, count: Int): Map[T, Int] = mset.get(element) match {
      case None => mset
      case Some(n) if n <= count => mset - element
      case Some(n) => mset + (element -> (n - count))
    }
  }
}
