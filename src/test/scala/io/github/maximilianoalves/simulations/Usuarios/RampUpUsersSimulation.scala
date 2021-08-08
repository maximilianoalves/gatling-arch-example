package io.github.maximilianoalves.simulations.Usuarios

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.github.maximilianoalves.config.Config
import io.github.maximilianoalves.requests.{Produtos, Usuarios}
import io.github.maximilianoalves.utils.Utils

import scala.concurrent.duration._


class RampUpUsersSimulation extends Simulation {

  val virtualUsers = 10
  val time = 10

  val httpProtocol = http
    .baseUrl(Config.prod)
    .disableFollowRedirect
    .warmUp(Config.prod)

  val scenarioUsuarios = scenario("Cenários para a busca dos usuários - 40%")
    .exec(Usuarios.buscarTodosUsuarios)
    .inject(rampUsersPerSec(1).to(virtualUsers) during (time seconds))

  setUp(scenarioUsuarios).protocols(httpProtocol)
}
