const pi = require("../Ex09.js");

test("Caso classico", () => {
  expect(parseFloat(pi(1000))).toBe(3.14);
});

test("argumento null/undefined", () => {
  expect(() => { pi(); }).toThrow();
});

test("argumento nao numerico", () => {
  expect(() => { propriedade3025("abcd"); }).toThrow(TypeError);
});

test("valor negativo fora da faixa", () => {
  expect(() => { propriedade3025(-1); }).toThrow(RangeError);
});
