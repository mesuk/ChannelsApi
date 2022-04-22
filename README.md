# Channels Api
Currently, we support below channels:
1. Facebook 
2. Youtube

* Each channel has different types of authentication and authorization mechanism.
* Also they has different types of permission. Suppose Youtube current API version, don't allow create post from API

**Build instructions**

Environment requirements:
* Java 8
* gradle

I used gradle for build dependency.

**Step 1 ->  Build project using gradle.**

To build project, you have to go to project directory. 
Suppose my work directory is :
```
/Users/sajedulkarim/workspace/ChannelsApi
```
* Run below gradle command to build jar
```
./gradlew clean build
```

After successfully build, an JAR will be create on below path
`PROJECT_DIRECTORY/build/libs/` named : **ChannelsApi.jar**

If **gradlew** have not executable permission, then have to provide executable permission
```
chmod +x gradlew
``` 
**Step 2 -> Run project**

* Now Run the JAR using below command
  ```
  java -jar build/libs/ChannelsApi.jar
  ```
**Output** 
* It will show execution results from Main class.
* I defaultly executed facebook and youtube functionalities. Those log will show in terminal
