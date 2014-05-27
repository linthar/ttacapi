

mvn -Dmaven.test.skip=true package
java -Xdebug -Xrunjdwp:server=y,transport=dt_socket,address=8000,suspend=n \
       -jar target/api.jar
