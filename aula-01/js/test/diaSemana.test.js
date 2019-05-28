const diaSemana = require("../diaSemana.js");

test("Data satisfaz (caso classico)", () => {
  expect(diaSemana(5, 5 , 2019)).toBe(0);
});

test("Dia inválido", () => {
  expect(() => diaSemana(32, 5, 2019)).toThrow(DataInvalidaError);
});

test("Mês inválido", () => {
  expect(() => diaSemana(5, 13, 2019)).toThrow(DataInvalidaError);
});

test("Ano inválido", () => {
  expect(() => diaSemana(5, 5, 1752)).toThrow(DataInvalidaError);
});