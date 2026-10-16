FROM palpy143/my-jenkins:lts-jdk21

COPY --from=docker:29-cli /usr/local/bin/docker /usr/local/bin/docker

COPY plugins.txt /usr/share/jenkins/ref/plugins.txt
RUN jenkins-plugin-cli -f /usr/share/jenkins/ref/plugins.txt