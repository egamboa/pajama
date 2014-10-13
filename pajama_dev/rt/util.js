function MyException(msg, fail){
	this.msg = msg;
	this.fail = fail;
}


MyException.prototype.toString = function()this.msg;

var aux = 0;
function patListTest(lp, n){
	aux++;
	print('TESTING patListTest'+aux);
	print('============== LP ===============');
	print(lp.length);
	print(lp);
	print('============== N ===============');
	print(n.length);
	print(n);
	print('============== Casos ==============='+aux);
	if (n.length != lp.length) {
		print('============== Fail Caso 1 ==============='+aux);
		return false;
	}
	if(!Array.isArray(n)){
		print('============== Fail Caso 2 ==============='+aux);
		return false;
	}
	if(!lp.reduce(function(z, p) z && p(n), true)){
		print('============== Fail Caso 3 ==============='+aux);
		return false;
	}
	return true;
	print('============== End ===============');
}


function patListTestEmpty(x)
	Array.isArray(x) && x.length == 0;


function fail(){
	throw new java.lang.Exception("Pattern matching failed");
}


function expectEQ(expr, r){
	try{
		return (eval(expr).toString() === r) 
	} catch(e){
		return false;
	}
}


function expectFAIL(expr){	
	try{
		eval(expr);
		throw new MyException("exception to FAIL but it did not: " + expr, true);
	}
	catch(e){
		if (e.fail) return true;
		throw e.toString();
	}
}


function FUNCALL_TO_BE_DONE(){
	return "+something needed to be done!!!";
}

function any(x)true;

function unshift(a, x){a.unshift(x);return a;}