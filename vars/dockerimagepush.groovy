 //def call(String project, String ImageTag, String shubhamdevops){
   //  withCredentials([usernamePassword(
     //        credentialsId: 'shubhamdevops',
       //      passwordVariable: 'PASS',
         //    usernameVariable: 'USER'

             
     //)]) {
       //  sh "docker login -u '$USER' -p '$PASS'"
     //}
     //sh "docker image push ${shubhamdevops}/${project}:${ImageTag}"
     //sh "docker image push ${shubhamdevops}/${project}:latest"   
 //}
//withCredentials([usernamePassword(
  //  credentialsId: 'shubhamdevops',
    // passwordVariable: 'PASS',
      //usernameVariable: 'USER')]) {
    // some block
//}
def call(String aws_account_id, String region, String ecr_reponame){
    
   sh """
        aws ecr get-login-password --region ${region} | docker login --username AWS --password-stdin ${aws_account_id}.dkr.ecr.${region}.amazonaws.com
        docker push ${aws_account_id}.dkr.ecr.${region}.amazonaws.com/${ecr_reponame}:latest
    
    """

}
  
 
 