# HVCC CISS 180 - Parrot Drone Project

This is a simple base repository based on the [Parrot SDK Sample](https://github.com/Parrot-Developers/Samples). You 
can use this modified repository, and instructions, to build your own Android App to fly one of the HVCC Parrot Drones.

*Currently this project is known to work only with the Parrot Mini Drone.*

Additional, and more clear, instructions will be added at a later date, however, the general steps are:

1. [Install Android Studio](https://developer.android.com/studio/index.html)
2. [Install Git](https://git-scm.com/downloads) (if not already installed)
3. Open Android Studio, Select `Check out project from Version Control` and choose `Git`.
4. Enter the Git Repository URL from GitHub and Clone this Repo into a new Project in Android Studio. *
5. Edit the `app/src/main/res/values/strings.xml` file and name your application
6. In the `edu.hvcc.ciss180.parrontdrone.preprogrammed` package, edit the `execute()` method of the `MiniDroneRoutine`
class. This is the routine that will run when the button is pushed in flight. (Additional help is available as comments
in that method.)
7. Run the Gradle `assemble` task. Two `.apk` files will be placed in the `app/build/outputs/apk/` directory.
8. Transfer the `app-debug.apk` file (it may be named slightly differently) to your Android Device and install.
9. Run the app, connect to your drone, take-off and press the `Execute Program` button to run your code.

*Note: If you want to use source code control while writing your app, and you have a GitHub account, you can fork this
repo to your account and then clone from your fork.