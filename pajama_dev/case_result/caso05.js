load('rt/util.js');

function sumar(a) {
    return (function(x) {
        return (function(n, c) {
            if ((function(x) {
                    return (patListTestEmpty)(x);
                })(n)) return (function(x) {
                return 0;
            })(n);
            else return (c)(n);
        })(x, function(x) {
            return (function(n, c) {
                if ((function(x) {
                        return ((patListTest)([any], x) && (any)(x));
                    })(n)) return (function(x) {
                    return (x[0] + sumar(x.slice(1)[0]));
                })(n);
                else return (c)(n);
            })(x, fail);
        });
    })(a);
}