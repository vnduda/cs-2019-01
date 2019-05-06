const potencia = require("../Ex08.js");

test("Caso clássico", () => {
  expect(potencia(2, 2)).toBe(4);
});

test("Potencia nao satisfaz", () => {
  expect(potencia(2, 2)).toBe(5);
});

test("argumento null/undefined", () => {
  expect(() => { potencia(); }).toThrow();
});

test("valor negativo fora da faixa", () => {
  expect(() => { potencia(-1, 2); }).toThrow(RangeError);
});

test("valor negativo fora da faixa", () => {
    expect(() => { potencia(2, -1); }).toThrow(RangeError);
});