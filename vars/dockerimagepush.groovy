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
        export AWS_ACCESS_KEY_ID=AKIA243XJVHZEYFYSO62
        export AWS_SECRET_ACCESS_KEY=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
        export AWS_DEFAULT_REGION=ap-south-1
         aws ecr get-login-password --region ${region} | docker login --username AWS --password-stdin ${aws_account_id}.dkr.ecr.${region}.amazonaws.com
        docker push ${aws_account_id}.dkr.ecr.${region}.amazonaws.com/${ecr_reponame}:latest
    
    """

}
  
 
 