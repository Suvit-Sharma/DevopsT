FROM tomcat

COPY target/javademo-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/

EXPOSE 8081

CMD ["catalina.sh", "run"]
