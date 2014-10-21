function MyException(msg, fail){
	this.msg = msg;
	this.fail = fail;
}


MyException.prototype.toString = function()this.msg;


function patListTest(lp, n){



	
	return Array.isArray(n)
			&& n.length == lp.length
			&& lp.reduce(function(z, p) z && p(n), true);
};


function patListTestEmpty(x)
	Array.isArray(x) && x.length == 0;

function patObjTest(lp, o){

	if(typeof o !='object') return false;
	var keys = Object.keys(lp);
	return keys.reduce(function(z, k)z&&lp[k](o), true);
}
function patObjectTestEmpty(o){
	return typeof o =='object' && Object.keys(o).length==0;
}
var FAIL = new java.lang.Exception("Pattern matching Exception");
function fail(){
	throw FAIL;
}

function any(x)true;


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