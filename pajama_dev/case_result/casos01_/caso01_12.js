load('rt/util.js');

function foo8(a) {
    return (function(x) {
        return (function(n, c) {
            if ((function(x) {
                    return (patListTestEmpty)(x);
                })(n)) return (function(x) {
                return true;
            })(n);
            else return (c)(n);
        })(x, fail);
    })(a);
}

function foo9(a) {
    return (function(x) {
        return (function(n, c) {
            if ((function(x) {
                    return ((patListTest)([any], x.slice(0, 1)) && (function(x) {
                        return (patListTestEmpty)(x.slice(1));
                    })(x));
                })(n)) return (function(x) {
                return true;
            })(n);
            else return (c)(n);
        })(x, fail);
    })(a);
}

function foo11(a) {
    return (function(x) {
        return (function(n, c) {
            if ((function(x) {
                    return (patListTest)([function(x) {
                        return (x[0] === 1);
                    }, function(x) {
                        return ((any)(x) && (function(x) {
                            return (x[1] > 0);
                        })(x));
                    }], x);
                })(n)) return (function(x) {
                return (x[1] + 1);
            })(n);
            else return (c)(n);
        })(x, fail);
    })(a);
}