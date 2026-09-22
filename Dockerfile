FROM tomcat:11-jdk17

RUN rm -rf /usr/local/tomcat/webapps/*

COPY target/UserRegistration.war /usr/local/tomcat/webapps/ROOT.war

EXPOSE 9090

CMD ["catalina.sh", "run"]

