const pi = require("../Ex09.js");

test("Caso classico", () => {
  expect(pi(5)).toBe(3.3396825396825403);
});

test("argumento null/undefined", () => {
  expect(() => { pi(); }).toThrow();
});

test("argumento nao numerico", () => {
  expect(() => { pi("abcd"); }).toThrow(TypeError);
});

test("valor negativo fora da faixa", () => {
  expect(() => { pi(-1); }).toThrow(RangeError);
});
