const diaSemana = require("../diaSemana.js");

test("Data satisfaz (caso classico)", () => {
  expect(diaSemana(5, 5 , 2019)).toBe(0);
});

test("Dia inválido", (dia) => {
  expect(diaSemana(32, 5, 2019)).toThrow(DataInvalidaError);
});

test("Mês inválido", (mes) => {
    expect(diaSemana(5, 13, 2019)).toThrow(DataInvalidaError);
});

test("Ano inválido", (ano) => {
   expect(diaSemana(5, 5, 1752)).toThrow(DataInvalidaError);
});