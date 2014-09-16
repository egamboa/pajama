antlr4 -visitor  -o src/antlr -package pajama.compile -no-listener grammar/Pajama.g4
javac -d lib src/*/*.java