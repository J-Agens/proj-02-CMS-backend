# This is a commment in our Dockerfile
# Every Dockerfile starts with a FROM. FROM specifies what image you're building on top of
# FROM should at least specify the OS, which images you use you can check on DockerHub an decide on one you like
# This is alpine linux with openjdk 8 aleady installed
# our images are specified with imagename:tag. So this is the openjdk image tagged with 8-jdk-alpine
# We will often see imagename:latest, which refers to the most recent version of an image
FROM openjdk:8-jdk-alpine
# Our maven plugin uses an argument for our Dockerfile, we specify that here:
ARG JAR_FILE
#COPY is an important keyword, it copies files from our machine into the image.
# Here we're copying the jar file produced by maven into our docker image
# This adds an image layer on top of our base imgae, openjdk:8-jdk-alpine
COPY $JAR_FILE appcms.jar
# Now that we've run the COPY line, if we produced an image using this Dockerfile we'd have Alpine linux, JDK 8, AND our cmsservice in the image
# CMD lets us specify a command to be run when start a container from this image.
CMD ["java", "-jar", "appcms.jar"]
# Finally, we use EXPOSE to suggest a port to open on the machine running this container.
# Since our Docker containers are like VMs and have their own OS, they have their own ports.
# If we want the outside world to be able to access our Docker containers, we need to expose their ports
EXPOSE 5001/tcp