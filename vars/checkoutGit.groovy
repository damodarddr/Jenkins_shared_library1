def call(String gitUrl, String gitBranch) {
    pipeline {
        agent any
        stages {
            stage('Checkout from Git') {
                steps {
                    script {
                        checkout([$class: 'GitSCM', branches: [[name: gitBranch]], userRemoteConfigs: [[url: gitUrl]]])
                    }
                }
            }
        }
    }
}
