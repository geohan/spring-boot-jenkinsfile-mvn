node {
    def mvnHome = tool 'M3'
    stage ('checkout project') {
        git url: 'https://github.com/ravis-git/spring-boot-jenkinsfile-mvn.git'
    }
    
    stage ('Check build environment') {
        sh 'mvn -v'
        sh 'java -version'
    }

    stage ('test') {
        sh 'mvn test'
    }
}
