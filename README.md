Pajama
======
Proyecto de Paradigmas version 1 primer proyecto
Andres Esteban Gamboa Arrieta
Bernal Araya Estrada
Diego Alonso Mendez

Casos listos:

Pendientes:

- [x] Casa01_5.js
- [x] Casa01_7.js
- [x] JSId Error to JSPoint
- [x] g(x) para el caso01_7
- [x] Falta el _ para compartamiento default
- [x] Falta el pipe para acceso de arrays
- [x] FunInit para caso02 que acepte cosas como factorialCola([n-1, n*r])
- [ ] Caso 2 Null Pointer Exception pajama.compile.Compiler.visitPId(Compiler.java:385)
- [ ] Caso 3 Null Pointer Exception pajama.compile.Compiler.visitPattRestId(Compiler.java:363)



Compilando en MAC:

antlr4 -visitor  -o src/antlr -package pajama.compile -no-listener grammar/Pajama.g4 $*
javac -d lib src/*/*.java
java -cp .:lib:$CLASSPATH pajama.compile.Pajamac cases/$1