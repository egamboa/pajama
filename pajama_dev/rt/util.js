function MyException(msg, fail){
	this.msg = msg;
	this.fail = fail;
}


MyException.prototype.toString = function()this.msg;

function patListTest(lp, n){
	if (n.length != lp.length) {
		return false;
	}
	if(!Array.isArray(n)){
		return false;
	}
	if(!lp.reduce(function(z, p) z && p(n), true)){
		return false;
	}
	return true;
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