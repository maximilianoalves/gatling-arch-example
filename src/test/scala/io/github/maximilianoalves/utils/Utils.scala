package io.github.maximilianoalves.utils

object Utils {

  def getEnv(name: String, defaultEnv: String): String = {
    return sys.props.getOrElse(name, sys.env.getOrElse(name, defaultEnv))
  }
}
