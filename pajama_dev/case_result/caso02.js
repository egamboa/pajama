load('rt/util.js');

function factorialCola(a) {
    return (function(x) {
        return (function(n, c) {
            if ((function(x) {
                    return (patListTest)([function(x) {
                        return (x[0] === 0);
                    }, any], x);
                })(n)) return (function(x) {
                return x[1];
            })(n);
            else return (c)(n);
        })(x, function(x) {
            return (function(n, c) {
                if ((function(x) {
                        return (patListTest)([any, any], x);
                    })(n)) return (function(x) {
                    return factorialCola([(x[0] - 1), x[1]]);
                })(n);
                else return (c)(n);
            })(x, fail);
        });
    })(a);
}

function factorial(n) {
    return (function(x) {
        return (function(n, c) {
            if ((function(x) {
                    return ((any)(x) && (function(x) {
                        return 0;
                    })(x));
                })(n)) return (function(x) {
                return factorialCola([n, 1]);
            })(n);
            else return (c)(n);
        })(x, function(x) {
            return (function(n, c) {
                if ((any)(n)) return (function(x) {
                    return 0;
                })(n);
                else return (c)(n);
            })(x, fail);
        });
    })(n);
}

function largo(a) {
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
                    return (largo(x.slice(1)[0]) + 1);
                })(n);
                else return (c)(n);
            })(x, fail);
        });
    })(a);
}

function largoRC(a) {
    return (function(x) {
        return (function(n, c) {
            if ((function(x) {
                    return (patListTest)([function(x) {
                        return (patListTestEmpty)(x);
                    }, any], x);
                })(n)) return (function(x) {
                return x[1];
            })(n);
            else return (c)(n);
        })(x, function(x) {
            return (function(n, c) {
                if ((function(x) {
                        return (patListTest)([function(x) {
                            return ((patListTest)([any], x[0]) && (any)(x));
                        }, any], x);
                    })(n)) return (function(x) {
                    return larRC([x.slice(1)[0], (x[1] + 1)]);
                })(n);
                else return (c)(n);
            })(x, fail);
        });
    })(a);
}

function largo(a) {
    return (function(x) {
        return (function(n, c) {
            if ((any)(n)) return (function(x) {
                return largoRC([a, 0]);
            })(n);
            else return (c)(n);
        })(x, fail);
    })(a);
}