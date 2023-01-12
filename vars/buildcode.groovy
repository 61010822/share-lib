def call(code) {
  sh """
     pwd
     ./jenkins/build/mvn.sh mvn -B -DskipTests clean package
     ${code}
  """
}
