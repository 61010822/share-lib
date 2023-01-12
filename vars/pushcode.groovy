def call(){
    IMAGE="maven-proj"
    echo "** Logging in **"
    docker login -u pittimonr -p $PASS
    echo "** Tagging image **"
    docker tag $IMAGE:$BUILD_TAG pittimonr/$IMAGE:$BUILD_TAG
    echo "** Pushing image **"
    docker push pittimonr/$IMAGE:$BUILD_TAG 
    //sh './jenkins/push/push.sh'
}
