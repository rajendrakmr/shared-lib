def call(String credentialId, String url, String branch) {
    withCredentials([usernamePassword(
        credentialsId: credentialId,
        usernameVariable: 'GIT_USERNAME',
        passwordVariable: 'GIT_TOKEN'
    )]) {
        git url: url, branch: branch, credentialsId: credentialId
    }
}
