FROM tomcat

RUN ln -s /usr/local/tomcat/webapps.dist/manager webapps/manager
RUN ln -s /usr/local/tomcat/webapps.dist/host-manager webapps/host-manager
RUN ln -s /usr/local/tomcat/webapps.dist/ROOT webapps/ROOT

ADD ./target/javademo-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps.dist/

EXPOSE 8080

CMD ["catalina.sh", "run"]
