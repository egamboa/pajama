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
- [ ] Falta el _ para compartamiento default
- [ ] Falta el pipe para acceso de arrays
- [ ] FunInit para caso02 que acepte cosas como factorialCola([n-1, n*r])


Compilando en MAC:

antlr4 -visitor  -o src/antlr -package pajama.compile -no-listener grammar/Pajama.g4 $*
javac -d lib src/*/*.java
java -cp .:lib:$CLASSPATH pajama.compile.Pajamac cases/$1