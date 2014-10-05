load('rt/util.js');

function caso1(n) {
	print(n);
    return (function(x) {
    	print(x);
        return (function(n, c) {
        	print(n);
            if ((function(x) {
            	print(x);
                return (x[0] === 0);
            })(n)) return false;
            else return (c)(n);
        })(x, fail);
    })(n);
}