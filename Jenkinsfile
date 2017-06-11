node {
    stage 'checkout project'
    git url: 'https://github.com/ravis-git/spring-boot-jenkinsfile-mvn.git'

    stage 'check env'

    sh 'mvn -v'
    sh 'java -version'

    stage 'test'
    sh 'mvn test'

}