//def call(String aws_account_id, String region, String shubhamdevops){
    
  // sh """
    //    docker image build -t ${shubhamdevops}/${project} .
      //  docker image tag ${shubhamdevops}/${project} ${shubhamdevops}/${project}:${ImageTag}
        //docker image tag ${shubhamdevops}/${project} ${shubhamdevops}/${project}:Latest
   // """

//}
//def call(String aws_account_id, String region, String ecr_reponame){
    
  // sh """
   //     docker image build -t ${ecr_reponame} .
   //     docker tag ${ecr_reponame}:latest ${aws_account_id}.dkr.ecr.${region}.amazonaws.com/${ecr_reponame}:latest
    //"""

//}
 def call(String project, String ImageTag, String shubhamdevops){
    
     sh """
      docker image build -t ${shubhamdevops}/${project} . 
      docker image tag ${shubhamdevops}/${project} ${shubhamdevops}/${project}:${ImageTag}
      docker image tag ${shubhamdevops}/${project} ${shubhamdevops}/${project}:latest
     """
 }
