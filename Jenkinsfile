node {
    stage('clonning from GIT') {
git branch: 'master', credentialsId: 'GIT_REPO', url: 'https://github.com/saraniya1/firstrepo.git'
    }

    environment {
        SONAR_SCANNER_HOME = tool 'SonarQubeScanner-5.0.1'
    }

    stage('SonarQube analysis') {
        steps {
            withSonarQubeEnv('sonarqube-9.9') {
                sh "${env.SONAR_SCANNER_HOME}/bin/sonar-scanner -Dsonar.projectKey=symphony-dev -Dsonar.sources=/var/lib/jenkins/workspace/SQ-Git-Pipeline"
            }
        }
    }
}
