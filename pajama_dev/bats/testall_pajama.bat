@echo off
REM Prueba una lista de casos de prueba
java -cp .;lib;dist/*;%CLASSPATH% pajama.test.TestPajama . %*