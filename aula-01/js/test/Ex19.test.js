const fibonacci = require("../Ex19.js");

test("Caso classico", () => {
  expect(fibonacci(10)).toBe(55);
});

test("argumento null/undefined", () => {
  expect(() => { fibonacci(); }).toThrow(Error);
});

test("argumento nao numerico", () => {
  expect(() => { fibonacci("abcd"); }).toThrow(TypeError);
});


test("valor negativo fora da faixa", () => {
  expect(() => { fibonacci(-1); }).toThrow(RangeError);
});

test("valor deve ser inteiro", () => {
  expect(() => fibonacci(10.3)).toThrow(RangeError);
});