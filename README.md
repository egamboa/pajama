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

Casos pendientes:

- Caso00 		pj[x] js[x]
- Caso01 		pj[x] js[x]
- Caso01_4 		pj[x] js[x]
- Caso01_5 		pj[x] js[x]
- Caso01_6 		pj[x] js[x]
- Caso01_7 		pj[x] js[ ] //Failed 
- Caso01_8 		pj[x] js[x]
- Caso01_9 		pj[x] js[x]
- Caso01_10 	pj[x] js[x]
- Caso01_11 	pj[x] js[x] 
- Caso01_12 	pj[x] js[x]
- Caso01_13 	pj[x] js[x] 
- Caso01_14 	pj[ ] js[ ] //PJ - JSFuncall.genCode(JSFuncall.java:20)
- Caso02 		pj[x] js[ ] //*** WARNING id not found
- Caso02_1 		pj[x] js[ ] //*** WARNING id not found
- Caso02_2 		pj[x] js[ ] //*** WARNING id not found
- Caso02_3 		pj[x] js[ ] //*** WARNING id not found
- Caso03 		pj[x] js[ ] //*** WARNING id not found
- Caso04 		pj[x] js[ ] //*** WARNING id not found
- Caso05 		pj[x] js[ ] //*** WARNING id not found




Compilando en MAC:

antlr4 -visitor  -o src/antlr -package pajama.compile -no-listener grammar/Pajama.g4 $*
javac -d lib src/*/*.java
java -cp .:lib:$CLASSPATH pajama.compile.Pajamac cases/$1
