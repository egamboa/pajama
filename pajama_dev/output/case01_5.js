|load('rt/util.js');

function foo(n) {
    return (function(x) {
        return (function(n, c) {
            if ((function(x) {
                return (patListTest)([
                    function(x) {
                        return (x[0] === 0);
                    },
                    function(x) {
                        return (patListTest)([
                            function(x) {
                                return (x[1][0] === 10);
                            },
                            function(x) {
                                return (x[1][1] === 11);
                            }
                        ], x);
                    },
                    function(x) {
                        return (x[2] === 2);
                    },
                    function(x) {
                        return (patListTest)([
                            function(x) {
                                return true;
                            }
                        ], x);
                    }
                ], x);
            })(n)) return x[3][0];
            else return (c)(n);
        })(x, fail);
    })(n);
}