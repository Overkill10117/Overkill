@rem
@rem Copyright 2015 the original author or authors.
@rem
@rem Licensed under the Apache License, Version 2.0 (the "License");
@rem you may not use this file except in compliance with the License.
@rem You may obtain a copy of the License at
@rem
@rem      https://www.apache.org/licenses/LICENSE-2.0
@rem
@rem Unless required by applicable law or agreed to in writing, software
@rem distributed under the License is distributed on an "AS IS" BASIS,
@rem WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
@rem See the License for the specific language governing permissions and
@rem limitations under the License.
@rem

@if "%DEBUG%" == "" @echo off
@rem ##########################################################################
@rem
@rem  untitled7 startup script for Windows
@rem
@rem ##########################################################################

@rem Set local scope for the variables with windows NT shell
if "%OS%"=="Windows_NT" setlocal

set DIRNAME=%~dp0
if "%DIRNAME%" == "" set DIRNAME=.
set APP_BASE_NAME=%~n0
set APP_HOME=%DIRNAME%..

@rem Resolve any "." and ".." in APP_HOME to make it shorter.
for %%i in ("%APP_HOME%") do set APP_HOME=%%~fi

@rem Add default JVM options here. You can also use JAVA_OPTS and UNTITLED7_OPTS to pass JVM options to this script.
set DEFAULT_JVM_OPTS=

@rem Find java.exe
if defined JAVA_HOME goto findJavaFromJavaHome

set JAVA_EXE=java.exe
%JAVA_EXE% -version >NUL 2>&1
if "%ERRORLEVEL%" == "0" goto execute

echo.
echo ERROR: JAVA_HOME is not set and no 'java' command could be found in your PATH.
echo.
echo Please set the JAVA_HOME variable in your environment to match the
echo location of your Java installation.

goto fail

:findJavaFromJavaHome
set JAVA_HOME=%JAVA_HOME:"=%
set JAVA_EXE=%JAVA_HOME%/bin/java.exe

if exist "%JAVA_EXE%" goto execute

echo.
echo ERROR: JAVA_HOME is set to an invalid directory: %JAVA_HOME%
echo.
echo Please set the JAVA_HOME variable in your environment to match the
echo location of your Java installation.

goto fail

:execute
@rem Setup the command line

set CLASSPATH=%APP_HOME%\lib\untitled7-3.1.jar;%APP_HOME%\lib\unirest-java-1.4.9.jar;%APP_HOME%\lib\emoji-java-3.2.0.jar;%APP_HOME%\lib\exp4j-0.4.8.jar;%APP_HOME%\lib\webapp-runner-8.5.11.3.jar;%APP_HOME%\lib\JDA-4.2.1_259.jar;%APP_HOME%\lib\botCommons-1.0.73.jar;%APP_HOME%\lib\logback-classic-1.2.3.jar;%APP_HOME%\lib\java-dotenv-5.1.1.jar;%APP_HOME%\lib\paste-client-java-1.0.16.jar;%APP_HOME%\lib\discord-webhooks-0.1.8.jar;%APP_HOME%\lib\lavaplayer-1.3.76.jar;%APP_HOME%\lib\HikariCP-3.4.1.jar;%APP_HOME%\lib\sqlite-jdbc-3.30.1.jar;%APP_HOME%\lib\httpasyncclient-4.1.1.jar;%APP_HOME%\lib\httpmime-4.5.2.jar;%APP_HOME%\lib\httpclient-4.5.10.jar;%APP_HOME%\lib\jda-utilities-examples-3.0.4.jar;%APP_HOME%\lib\jda-utilities-command-3.0.4.jar;%APP_HOME%\lib\jda-utilities-oauth2-3.0.4.jar;%APP_HOME%\lib\json-20180813.jar;%APP_HOME%\lib\tomcat-embed-jasper-8.5.11.jar;%APP_HOME%\lib\tomcat-embed-websocket-8.5.11.jar;%APP_HOME%\lib\tomcat-embed-core-8.5.11.jar;%APP_HOME%\lib\tomcat-embed-logging-juli-8.5.2.jar;%APP_HOME%\lib\tomcat-jasper-8.5.11.jar;%APP_HOME%\lib\tomcat-jasper-el-8.5.11.jar;%APP_HOME%\lib\tomcat-jsp-api-8.5.11.jar;%APP_HOME%\lib\jcommander-1.48.jar;%APP_HOME%\lib\lava-common-1.1.2.jar;%APP_HOME%\lib\commons-io-2.6.jar;%APP_HOME%\lib\trove4j-3.0.3.jar;%APP_HOME%\lib\jackson-databind-2.10.1.jar;%APP_HOME%\lib\jda-utilities-menu-3.0.4.jar;%APP_HOME%\lib\reliqua-2.4.8.jar;%APP_HOME%\lib\jsr305-3.0.2.jar;%APP_HOME%\lib\okhttp-4.0.1.jar;%APP_HOME%\lib\okio-2.2.2.jar;%APP_HOME%\lib\kotlin-stdlib-1.3.41.jar;%APP_HOME%\lib\annotations-16.0.1.jar;%APP_HOME%\lib\slf4j-api-1.7.25.jar;%APP_HOME%\lib\nv-websocket-client-2.14.jar;%APP_HOME%\lib\opus-java-1.1.0.pom;%APP_HOME%\lib\commons-collections4-4.1.jar;%APP_HOME%\lib\jda-utilities-doc-3.0.4.jar;%APP_HOME%\lib\jda-utilities-commons-3.0.4.jar;%APP_HOME%\lib\jsoup-1.12.1.jar;%APP_HOME%\lib\logback-core-1.2.3.jar;%APP_HOME%\lib\lavaplayer-natives-1.3.14.jar;%APP_HOME%\lib\base64-2.3.9.jar;%APP_HOME%\lib\jackson-core-2.10.1.jar;%APP_HOME%\lib\httpcore-nio-4.4.4.jar;%APP_HOME%\lib\httpcore-4.4.12.jar;%APP_HOME%\lib\commons-logging-1.2.jar;%APP_HOME%\lib\tomcat-embed-el-8.5.11.jar;%APP_HOME%\lib\ecj-4.5.1.jar;%APP_HOME%\lib\tomcat-util-scan-8.5.11.jar;%APP_HOME%\lib\tomcat-api-8.5.11.jar;%APP_HOME%\lib\tomcat-servlet-api-8.5.11.jar;%APP_HOME%\lib\tomcat-util-8.5.11.jar;%APP_HOME%\lib\tomcat-juli-8.5.11.jar;%APP_HOME%\lib\tomcat-el-api-8.5.11.jar;%APP_HOME%\lib\jackson-annotations-2.10.1.jar;%APP_HOME%\lib\opus-java-api-1.1.0.jar;%APP_HOME%\lib\opus-java-natives-1.1.0.jar;%APP_HOME%\lib\kotlin-stdlib-common-1.3.41.jar;%APP_HOME%\lib\commons-codec-1.11.jar;%APP_HOME%\lib\jna-4.4.0.jar


@rem Execute untitled7
"%JAVA_EXE%" %DEFAULT_JVM_OPTS% %JAVA_OPTS% %UNTITLED7_OPTS%  -classpath "%CLASSPATH%" me.duncte123.jdatuts.Bot %*

:end
@rem End local scope for the variables with windows NT shell
if "%ERRORLEVEL%"=="0" goto mainEnd

:fail
rem Set variable UNTITLED7_EXIT_CONSOLE if you need the _script_ return code instead of
rem the _cmd.exe /c_ return code!
if  not "" == "%UNTITLED7_EXIT_CONSOLE%" exit 1
exit /b 1

:mainEnd
if "%OS%"=="Windows_NT" endlocal

:omega
