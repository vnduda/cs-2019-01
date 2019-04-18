function CrivoEratostenes(s, n) {

    if (s.length > 1) {
        throw new Error("Tamanho do array inválido");
    }

    for (let i = 0; i < s.length; i++) {
        if (a[i] != 0) {
            throw new RangeError("o array precisa estar zerado");
        }
    }

    if (n > 1) {

        a = s;

        for (i = 2; i <= n; i++) {
            if (a[i] == 0) {
                return false;
            }
        }

        let i = 2;
        limite = Math.floor(Math.sqrt(n));
        let multiplo;

        while (i <= limite) {

            if (a[i] == 0) {
                multiplo = i + i;

                while (multiplo <= n) {
                    a[multiplo] = 1;
                    multiplo = multiplo + i;
                }

            }

            i = i + 1;
        }

        return a;
    }
}