node
{
    stage('clonning from GIT'){
git branch: 'master', credentialsId: 'GIT_REPO', url: 'https://github.com/saraniya1/firstrepo.git'
     }

stage('SonarQube Analysis') {
    def scannerHome = tool 'SonarQubeScanner-5.0.1'
      withSonarQubeEnv('SonarQubeScanner-5.0.1') {
      sh """/var/lib/jenkins/tools/hudson.plugins.sonar.SonarRunnerInstallation/SonarQubeScanner-5.0.1/bin/sonar-scanner \
     -D sonar.projectVersion=1.0-SNAPSHOT \
       -D sonar.login=admin \
      -D sonar.password=H3r3andth3r3 \
      -D sonar.projectBaseDir=/var/lib/jenkins/workspace/SQ-Git-Pipeline/ \
        -D sonar.projectKey=symphony-dev \
        -D sonar.sourceEncoding=UTF-8 \
        -D sonar.language=java \
        -D sonar.sources=/var/lib/jenkins/workspace/SQ-Git-Pipeline \
        -D sonar.tests=/var/lib/jenkins/workspace/SQ-Git-Pipeline \
        -D sonar.host.url=http://34.229.109.77:9000/"""
        }
}
}
