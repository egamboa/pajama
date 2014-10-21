load('rt/util.js');

function caso0(n) {
    return (function(x) {
        return (function(n, c) {
            if ((function(x) {
                return (x === 0);
            })(n)) return (function(x) {
                return false;
            })(n);
            else return (c)(n);
        })(x, fail);
    })(n);
}