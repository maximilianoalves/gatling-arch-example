package io.github.maximilianoalves.requests

import io.gatling.core.Predef.{exec, _}
import io.gatling.http.Predef._
import io.github.maximilianoalves.header.Header

object Usuarios {

  var buscarTodosUsuarios = exec(
      http("Buscar todos os usuários")
        .get("/usuarios")
        .headers(Header.defaultHeader)
        .check(status.is(200))
  )

}