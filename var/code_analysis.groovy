
def call(){
  withSonarQubeEnv('Sonar') {
          sh '''
            sonar-scanner \
              -Dsonar.projectKey=school-management-system \
              -Dsonar.projectName=school-management-system \
              -Dsonar.sources=. \
              -Dsonar.java.binaries=. \
              -X
          '''
        }
}
