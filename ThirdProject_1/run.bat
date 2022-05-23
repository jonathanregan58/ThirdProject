cd projectLocation=C:\Users\user\git\ThirdProject_1\ThirdProject_1
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testng.xml
pause
