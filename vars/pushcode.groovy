def call(){
    sh"""    
        echo "** Logging in **"
        docker login -u pittimonr -p $PASS
        echo "** Tagging image **"
        docker tag maven-proj:$BUILD_TAG pittimonr/maven-proj:$BUILD_TAG
        echo "** Pushing image **"
        docker push pittimonr/$IMAGE:$BUILD_TAG 
        //sh './jenkins/push/push.sh'
    """
}
