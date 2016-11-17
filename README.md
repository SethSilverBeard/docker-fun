# Seths Docker-Fun CHALLENGE!

## Task 1 - Switch from Jackson to Gson
1. Used http://docs.spring.io/spring/docs/current/spring-framework-reference/html/mvc.html#mvc-config-message-converters
1. Explored GsonHttpMessageConvertersConfiguration > Find usages of PREFERRED_MAPPER_PROPERTY
1. HttpMessageConvertersAutoConfiguration
1. Also used http://www.leveluplunch.com/java/tutorials/023-configure-integrate-gson-spring-boot/

## Task 2 - Run the Docker image that can be created with gradlew buildDocker.
`./gradlew buildDocker`

`docker ps -a`

`docker images`

`docker ps -a` 

`docker run sample/docker-fun` #mindblown

....Ctrl-C doesnt work, using Google I see docker no TTY by default so open new terminal

`docker ps`

`docker kill ac36ce7276b27e0a5cebcd8d09c3e8426e3abe0bbd4cdc45fb16462100bdac3b`

## Task 3 - Change Docker port
https://docs.docker.com/engine/reference/run/

`man docker run`

`docker run -p 81:8080 -d sample/docker-fun`

`docker run -p 82:8080 -d sample/docker-fun`

`docker ps`

`docker kill tender_williams`

`docker kill pedantic_roentgen`

## Fun Things I learned
1. yml files are cool
1. Started writing my own Spring properties CRUD, then I found out about actuators and http://.../env, /health, etc
1. Docker Toolbox uses Virtualbox but they have Docker for Windows that uses Hyper-V!  Needs Windows Pro tho ($99), but Hyper-V looks cool as it uses hardware directly!  Maybe it would speed up my own Linux development with the RemoteFX (3d acceleration stuff)?
1. Started running Main.java directly from Eclipse, was a lot faster and debugging was easier to setup

## Frustrations
### Gradle
1. No auto-refresh of dependencies in IntelliJ when adding dependencies to build.gradle file

## Seths Questions
1. Does Woodmen use Gradle for projects instead of maven? If so, why?
