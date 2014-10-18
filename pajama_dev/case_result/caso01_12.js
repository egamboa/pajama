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
                    return ((patListTest)([any], x) && (function(x) {
                        return (patListTestEmpty)(x);
                    })(x));
                })(n)) return (function(x) {
                return true;
            })(n);
            else return (c)(n);
        })(x, fail);
    })(a);
}

function foo10(a) {
    return (function(x) {
        return (function(n, c) {
            if ((function(x) {
                    return ((patListTest)([function(x) {
                        return (x[0] === 1);
                    }], x) && (any)(x));
                })(n)) return (function(x) {
                return x.slice(1);
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
                            return 0;
                        })(x));
                    }], x);
                })(n)) return (function(x) {
                return (x[1] + 1);
            })(n);
            else return (c)(n);
        })(x, fail);
    })(a);
}