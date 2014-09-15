function caso1(n) {
    return (function(x) {
        return (function(n, c) {
            if ((function(x) {
                return (x === 0);
            })(n)) return false;
            else return (c)(n);
        })(x, function(x) {
            return (function(n, c) {
                if ((function(x) {
                    return (x === 1);
                })(n)) return true;
                else return (c)(n);
            })(x, fail);
        });
    })(n);
}