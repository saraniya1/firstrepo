pipeline {
    agent any

    environment {
        SONAR_SCANNER_HOME = tool 'SonarQubeScanner-5.0.1'
    }

    stages {
        stage('SonarQube analysis') {
            steps {
                withSonarQubeEnv('sonarqube-9.9') {
                    sh "${env.SONAR_SCANNER_HOME}/bin/sonar-scanner -Dsonar.projectKey=symphony-dev -Dsonar.sources=/tmp/test"
                }
            }
        }
    }
}
