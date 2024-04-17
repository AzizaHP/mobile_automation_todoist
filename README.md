This repo is build using Katalon Studio Arm64 and Android Studio for android emulator.

For Todoist android application is on file androidapp > com.todoist.apk (application id is com.todoist)

Part 1: To create test project via API:
- Run **tc-create_project** under Test Cases file.
  - Each API files is under Object Repository > API

Part 2: After new project created, run the android emulator then run this part.
You can use android emulator here https://github.com/AzizaHP/My_Application or you can use your own emulator. I use Device Manager Pixel 8 Pro VanillaIceCream.
- Run **tc-login_todoist**
  - It contains mobile automation for login to todoist app and check the new project was created.

Part 3: To create task under new project with mobile automation and check the new task is created with API.
- Run **tc-create_task**
  - It contains mobile automation for create new task under new project created and check the task is created by API.
  - This part is continued running from Part 2, not running from beginning login to the app.

If you want to running all parts, run the test suites **mobile_automation_todoist**. Find the file Test Suites > mobile_automation_todoist
