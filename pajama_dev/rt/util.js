function patListTest(lp, n)
   Array.isArray(n)
   && n.length >= lp.length
   && lp.reduce(function(z, p) z && p(n), true)

 function fail(){
   throw new java.lang.Exception("Pattern matching failed");
 }