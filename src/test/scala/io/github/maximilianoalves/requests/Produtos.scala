package io.github.maximilianoalves.requests

import io.gatling.core.Predef.{exec, _}
import io.gatling.http.Predef._
import io.github.maximilianoalves.header.Header

object Produtos {

  var buscarTodosProdutos = exec(
    http("Buscar todos os produtos")
      .get("/produtos")
      .headers(Header.defaultHeader)
      .check(status.is(200))
  )

}