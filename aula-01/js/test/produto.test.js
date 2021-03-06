const produto = require("../produto.js");

test("Caso clássico", () => {
  expect(produto(2, 2)).toBe(4);
});

test("argumento null/undefined", () => {
  expect(() => { produto(); }).toThrow();
});

test("valor negativo fora da faixa", () => {
  expect(() => { produto(-1, 2); }).toThrow(RangeError);
});

test("valor negativo fora da faixa", () => {
    expect(() => { produto(2, -1); }).toThrow(RangeError);
});

test("argumento nao numerico", () => {
  expect(() => { produto("abcd", 3); }).toThrow(TypeError);
});