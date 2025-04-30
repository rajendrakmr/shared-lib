def(String crendentialId,String url,String branch){
withCredentials[usernamePassword(credentialsId:'crendentialId',usernameVariable:'GIT_USERNAME',passwordVariable:'GIT_TOKEN')]{
  git url: "${url}", branch: "${branch}"
}}
