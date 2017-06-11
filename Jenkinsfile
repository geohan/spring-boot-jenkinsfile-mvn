node {
    stage ('checkout project') {
        git url: 'https://github.com/ravis-git/spring-boot-jenkinsfile-mvn.git'
    }
    
    stage ('Check build environment') {
    //    env.PATH = "${tool 'apache-maven-3.3.9'}/bin:${env.PATH}"
        def mvnHome = tool 'M3'
        sh 'mvn -v'
        sh 'java -version'
    }

    stage ('test') {
        sh 'mvn test'
    }
}
