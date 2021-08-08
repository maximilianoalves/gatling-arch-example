<h1 align="center">Exemplo de arquitetura de testes utilizando Rest-Assured</h1>


## Tecnologias utilizadas  
- [Gatling core](https://mvnrepository.com/artifact/io.gatling/gatling-core)
- [Gatling test framework](https://mvnrepository.com/artifact/io.gatling/gatling-test-framework)
- [Gatling charts highcharts](https://mvnrepository.com/artifact/io.gatling.highcharts/gatling-charts-highcharts)
- [Gatling app](https://mvnrepository.com/artifact/io.gatling/gatling-app)
- [Gatling recorder](https://mvnrepository.com/artifact/io.gatling/gatling-recorder)
- [Scala lib](https://mvnrepository.com/artifact/org.scala-lang/scala3-library)
- [Scala reflect](https://mvnrepository.com/artifact/org.scala-lang/scala-reflect)

## Estrutura de arquivos

📦src  
┣ 📂main  
┃ ┣ 📂java  
┃ ┗ 📂resources  
┗ 📂test  
┃ ┣ 📂java  
┃ ┃ ┗ 📂io.github.maximilianoalves  
┃ ┗ 📂scala  
┃ ┃ ┣ 📂io  
┃ ┃ ┃ ┗ 📂github  
┃ ┃ ┃ ┃ ┗ 📂maximilianoalves  
┃ ┃ ┃ ┃ ┃ ┣ 📂config  
┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜Config.scala  
┃ ┃ ┃ ┃ ┃ ┣ 📂header  
┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜Header.scala  
┃ ┃ ┃ ┃ ┃ ┣ 📂requests  
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜Produtos.scala  
┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜Usuarios.scala  
┃ ┃ ┃ ┃ ┃ ┣ 📂simulations  
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂FluxoCompleto  
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜FluxoCompletoSimulation.scala  
┃ ┃ ┃ ┃ ┃ ┃ ┗ 📂Usuarios  
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜RampUpUsersSimulation.scala  
┃ ┃ ┃ ┃ ┃ ┗ 📂utils  
┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜Utils.scala  
┃ ┃ ┣ 📜Engine.scala  
┃ ┃ ┣ 📜IDEPathHelper.scala  
┃ ┃ ┗ 📜Recorder.scala  

## Exemplos de Execução.
**PROIBIDO EXECUTAR ESTA AÇÃO COM UM VOLUME DE USUÁRIOS EXCESSIVO EM SERVIÇOS EXTERNOS SEM PRÉVIO CONSENTIMENTO.**

```java
    package -Dgatling.simulationClass=io.github.maximilianoalves.simulations.Usuarios.RampUpUsersSimulation -DENV=prod
```

