@ECHO OFF
SET CMD_HOME=%cd%
SET MAVEN_OPTS=-Xdebug -Xnoagent -Djava.compiler=NONE -Xrunjdwp:transport=dt_socket,server=y,suspend=n,address=4000
cd %CMD_HOME%
@ECHO ON
mvn -e jetty:run 
PAUSE