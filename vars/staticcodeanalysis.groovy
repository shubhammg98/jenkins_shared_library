def call(credentialsId){
    withSonarQubeEnv(credentialsId: 'sonarqube-key') {
        sh 'mvn clean package sonar:sonar'
    } 
        
}