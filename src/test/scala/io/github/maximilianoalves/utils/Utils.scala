package io.github.maximilianoalves.utils

object Utils {

  def getUserQuantityByPercentage(users: Int, percentage: Int): Int = {
    val defineUserPercentage: Int = (users*percentage)/100
    if (users < 1) {
      return 1
    } else {
      return  defineUserPercentage
    }
  }

  def getEnv(name: String, defaultEnv: String): String = {
    return sys.props.getOrElse(name, sys.env.getOrElse(name, defaultEnv))
  }
}
