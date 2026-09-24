FROM tomcat:11-jdk17

RUN rm -rf /usr/local/tomcat/webapps/*

RUN sed -i 's/port="8080"/port="9090"/' /usr/local/tomcat/conf/server.xml

ADD target/UserRegistration.war /usr/local/tomcat/webapps/ROOT.war

EXPOSE 9090

CMD ["catalina.sh", "run"]
