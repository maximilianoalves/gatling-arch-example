package io.github.maximilianoalves.simulations.FluxoCompleto

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.github.maximilianoalves.config.Config
import io.github.maximilianoalves.requests.{Produtos, Usuarios}
import io.github.maximilianoalves.utils.Utils

import scala.concurrent.duration._


class FluxoCompletoSimulation extends Simulation {

  val virtualUsers = 10
  val time = 10

  val httpProtocol = http
    .baseUrl(Config.prod)
    .disableFollowRedirect
    .warmUp(Config.prod)

  val scenarioUsuarios = scenario("Cenários para a busca dos usuários - 40%")
    .exec(Usuarios.buscarTodosUsuarios)
    .inject(rampUsers(Utils.getUserQuantityByPercentage(virtualUsers, 40)) during (time seconds))

  val scenarioProdutos = scenario("Cenário para buscar todos os produtos. - 60%")
    .exec(Usuarios.buscarTodosUsuarios)
    .exec(Produtos.buscarTodosProdutos)
    .inject(rampUsers(Utils.getUserQuantityByPercentage(virtualUsers, 100)) during (time seconds))

  setUp(scenarioProdutos).protocols(httpProtocol)
}
