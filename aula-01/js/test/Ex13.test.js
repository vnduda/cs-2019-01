const raiz = require("../Ex13.js");

test("Caso classico", () => {
  expect(raiz(4, 25)).toBe(2);
});

test("argumento null/undefined", () => {
  expect(() => { raiz(); }).toThrow(Error);
});

test("argumento nao numerico", () => {
  expect(() => { raiz("abcd", 25); }).toThrow(TypeError);
});

test("valor fora da faixa", () => {
  expect(() => { raiz(-1, 2); }).toThrow(RangeError);
});
