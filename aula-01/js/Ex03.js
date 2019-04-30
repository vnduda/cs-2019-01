class DataInvalidaError extends Error {
    constructor (msg){
        super (msg);
        this.name = "DataInvalidaError";
    }
}

function diaSemana(dia, mes, ano) {
    if (dia < 1 || dia > 31) {
        throw new DataInvalidaError("Dia invalido: " + dia);
    }

    if (mes < 1 || mes > 12) {
        throw new DataInvalidaError("Mês invalido: " + dia);
    }

    if (ano < 1753) {
        throw new DataInvalidaError("Ano invalido: " + a);
    }

    const janeiroOuFevereiro = m == 1 || m == 2;
    const m = janeiroOuFevereiro ? mes + 12 : mes;
    const a = janeiroOuFevereiro ? ano - 1 : ano;

    const s = (dia + (2 * m) + (3 * (m + 1) / 5) + a + (a / 4) - (a / 100) + (a / 400));
    return (parseInt(s) % 7);
}

    