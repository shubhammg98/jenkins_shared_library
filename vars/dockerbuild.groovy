def call(String project, String ImageTag, String shubhamdevops){
    
   sh """
        docker image build -t ${shubhamdevops}/${project} .
        docker image tag ${shubhamdevops}/${project} ${shubhamdevops}/${project}:${ImageTag}
        docker image tag ${shubhamdevops}/${project} ${shubhamdevops}/${project}:Latest
    """

}