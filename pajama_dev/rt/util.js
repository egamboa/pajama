function MyException(msg, fail){
	this.msg = msg;
	this.fail = fail;
}


MyException.prototype.toString = function()this.msg;


function patListTest(lp, n)
	Array.isArray(n)
	&& n.length == lp.length
	&& lp.reduce(function(z, p) z && p(n), false)


function patListTestEmpty(x)
	Array.isArray(x) && x.length == 0;


function fail(){
	throw new FAIL;
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