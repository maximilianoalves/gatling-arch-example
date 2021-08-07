package io.github.maximilianoalves.simulations.FluxoCompleto

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.github.maximilianoalves.config.Config
import io.github.maximilianoalves.requests.Usuarios
import scala.concurrent.duration._


class FluxoCompletoSimulation extends Simulation {

  val virtualUsers = 1
  val time = 10

  val httpProtocol = http
    .baseUrl(Config.prod)
    .disableFollowRedirect
    .warmUp(Config.prod)

  val scenarioFluxoCompleto = scenario("Realizar o fluxo completo de ponta a ponta")
    .exec(Usuarios.buscarTodosUsuarios)
    .inject(rampUsers(virtualUsers) during (time seconds))

}
