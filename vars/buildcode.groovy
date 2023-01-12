def call() {
  sh """
     pwd
     ./jenkins/build/mvn.sh mvn -B -DskipTests clean package
     ./jenkins/build/build.sh
  """
}
