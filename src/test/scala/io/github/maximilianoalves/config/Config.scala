package io.github.maximilianoalves.config

import io.github.maximilianoalves.utils.Utils

object Config {

  val prod = Utils.getEnv("AMBIENTE", "tst") match {
    case "prod" => "https://serverest.dev/login"
  }

}