//def call(){
  //  sh 'mvn verify -DskipUnitTests'
//}
def call(){
    sh 'mvn verify -DskipUnitTests'
}
//squ_5836f11a01f913d448b628a714d8ccdfae2e9229-sonarqube token