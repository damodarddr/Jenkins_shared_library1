stage('Clean Workspace') {
    steps {
        script {
            deleteDir()
        }
    }
}
