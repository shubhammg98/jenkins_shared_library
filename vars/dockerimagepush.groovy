 def call(String project, String ImageTag, String shubhamdevops){
     withCredentials([usernamePassword(
             credentialsId: "shubhamdevops",
             usernameVariable: "USER",
             passwordVariable: "PASS"
     )]) {
         sh "docker login -u '$USER' -p '$PASS'"
     }
     sh "docker image push ${shubhamdevops}/${project}:${ImageTag}"
     sh "docker image push ${shubhamdevops}/${project}:latest"   
 }
//withCredentials([usernamePassword(
  //  credentialsId: 'shubhamdevops',
    // passwordVariable: 'PASS',
      //usernameVariable: 'USER')]) {
    // some block
//}