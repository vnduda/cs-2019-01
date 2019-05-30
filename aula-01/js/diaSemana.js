class DataInvalidaError extends Error {
    constructor (msg){
        super (msg);
        this.name = "DataInvalidaError";
    }
}

/**
 * Determina o dia da semana a partir de uma dada data
 * @param {Number} dia o dia da data 
 * @param {Number} mes o mês da data
 * @param {Number} ano o ano da data
 * @throws {DataInvalidaError} caso a data não seja válida
 * @returns {Number} retorna o numero equivalente ao dia da semana que foi calculado
 */

function diaSemana(dia, mes, ano) {
    if (dia < 1 || dia > 31) {
        throw new DataInvalidaError("Dia invalido: " + dia);
    }

    if (mes < 1 || mes > 12) {
        throw new DataInvalidaError("Mês invalido: " + mes);
    }

    if (ano < 1753) {
        throw new DataInvalidaError("Ano invalido: " + ano);
    }

    const janeiroOuFevereiro = mes == 1 || mes == 2;
    const m = janeiroOuFevereiro ? mes + 12 : mes;
    const a = janeiroOuFevereiro ? ano - 1 : ano;

    const drDobbsExp = (dia + (2 * m) + (3 * (m + 1) / 5) + a + (a / 4) - (a / 100) + (a / 400));
    return (parseInt(drDobbsExp) % 7);
}

module.exports = {
    diaSemana:diaSemana, 
    DataInvalidaError:DataInvalidaError
};
    