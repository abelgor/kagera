package io.kagera.api.colored

import scala.concurrent.duration.Duration

abstract class AbstractTransition[I, O](
  override val id: Long,
  override val label: String,
  override val isManaged: Boolean,
  override val maximumOperationTime: Duration = Duration.Undefined
) extends Transition {

  override def toString = label

  type Input = I
  type Output = O
}
