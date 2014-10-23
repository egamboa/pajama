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
                    return ((patListTest)([any], x.slice(0, 1)) && (any)(x));
                })(n)) return (function(x) {
                    return (x[0] + arguments[0](x[0]));
                })(n);
                else return (c)(n);
            })(x, fail);
        });
    })(a);
}