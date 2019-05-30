const diaSemana = require("../diaSemana.js");

test("Data satisfaz (caso classico)", () => {
  expect(diaSemana.diaSemana(5, 5 , 2019)).toBe(0);
});

test("Dia inválido", () => {
  expect(() => diaSemana.diaSemana(32, 5, 2019)).toThrow(diaSemana.DataInvalidaError);
});

test("Mês inválido", () => {
  expect(() => diaSemana.diaSemana(5, 13, 2019)).toThrow(diaSemana.DataInvalidaError);
});

test("Ano inválido", () => {
  expect(() => diaSemana.diaSemana(5, 5, 1752)).toThrow(diaSemana.DataInvalidaError);
});