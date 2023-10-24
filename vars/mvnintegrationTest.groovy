//def call(){
  //  sh 'mvn verify -DskipUnitTests'
//}
def call(){
    sh 'mvn verify -DskipUnitTests'
}
//squ_9676f20da72378e135529de222a606dcb3a0a50c-sonarqube token