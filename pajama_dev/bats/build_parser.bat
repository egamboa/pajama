@echo off
REM Genera parser y visitors y los compila


call antlr4 -visitor  -o src/antlr -package pajama.compile -no-listener grammar/Pajama.g4 %*
if %ERRORLEVEL% == 1 (goto :error)
javac -d lib src/antlr/*.java
goto :end
:error 
echo "ANTLR failed compilation"
:end

