build-docker-env:
	docker build -t maven dockers/maven

deploy-default:
	ssh jenkins@localhost mkdir -p deploy/release
	scp target/spring-boot-jenkinsfile-mvn-0.1.0.jar jenkins@localhost:deploy/release
	- ssh jenkins@localhost 'kill `cat deploy/release/run.pid`'
	ssh jenkins@localhost 'java -jar deploy/release/spring-boot-jenkinsfile-mvn-0.1.0.jar > /dev/null 2>&1 & echo $$! > "deploy/release/run.pid"'
