const raiz = require("../Ex13.js");

test("Caso classico", () => {
  expect(raiz(2, 2)).toBe(2);
});

test("argumento null/undefined", () => {
  expect(() => { raiz(); }).toThrow(Error);
});

test("argumento nao numerico", () => {
  expect(() => { raiz("abcd"); }).toThrow(TypeError);
});

test("valor fora da faixa", () => {
  expect(() => { raiz(0); }).toThrow(RangeError);
});