FROM tomcat:8.0

ADD ./target/javademo-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps.dist/

EXPOSE 8080

CMD ["catalina.sh", "run"]
