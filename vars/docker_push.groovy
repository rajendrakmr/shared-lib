
def call(String Image, String ImageTag, String dockerUser){
  withCredentials([usernamePassword(credentialsId: 'dockerHubCreds', passwordVariable: 'dockerhubpass', usernameVariable: 'dockerhubuser')]) {
      sh "docker login -u ${dockerhubuser} -p ${dockerhubpass}"
  }
  sh "docker push ${dockerUser}/${Image}:${ImageTag}"
}
