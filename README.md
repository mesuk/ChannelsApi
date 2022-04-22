# Channels Api
Currently, we support below channels:
1. Facebook 
2. Youtube
3. Optimizely

* Each channel has different types of authentication and authorization mechanism.
* Also they has different types of permission. Suppose Youtube current API version, don't allow create post from API

**Project Structure and Output after Run**

[To view files, please browse this drive link](https://drive.google.com/drive/folders/1FBiJr9YiFRMoOpbGdrii5wbFUU6Q-zia?usp=sharing)

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

**How it works**

* Step 1 : Get Channel from ChannelsFactory using channelName

  `Channel facebookChannel = ChannelsFactory.getChannel(ChannelConstants.CHANNEL_FACEBOOK);`

If no channel found, it will throw `ChannelNotImplementedException` exception.
Before providing channel, it will automatically initialize authorization/authentication and generate sessionToken.
Each channel may have different security mechanism. In this case it will implement on it's on Auth class
 
* Step 2: Access Post List

  `List<FacebookPost> facebookPosts = facebookChannel.getChannelsActionService().facebookPostList();`

Here, we have channel and using it's action service it will call SDK/Background Service to fetch posts

* Step 3: Create Post

  `FacebookPost facebookPost = facebookChannel.getChannelsActionService().createFacebookPost(buildFacebookPost());`

Using channel, user can upload facebook post using SDK/API call. This API is facebook specific, if any other channel require create post facility, it have to implement fron their end.
