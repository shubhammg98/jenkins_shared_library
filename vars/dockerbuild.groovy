def call(String project, String ImageTag, String hubuser){
    
    sh """
        docker image build -t ${hubuser}/${project} .
        docker image tag ${hubUser}/${project} ${hubUser}/${project}:${ImageTag}
        docker image tag ${hubuser}/${project} ${shubhamdevops}/${project}:Latest
    """
}

