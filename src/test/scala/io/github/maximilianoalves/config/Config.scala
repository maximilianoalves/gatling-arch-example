package io.github.maximilianoalves.config

import io.github.maximilianoalves.utils.Utils

object Config {

  val prod = Utils.getEnv("ENV", "tst") match {
    case "prod" => "https://serverest.dev/"
    case "tst" => "https://tst.serverest.dev/"
  }

}