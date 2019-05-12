const somaNaturais = require("../Ex05.js");

test("Caso classico", () => {
  expect(somaNaturais(3)).toBe(6);
});

test("valor fora da faixa", () => {
  expect(() => somaNaturais(0)).toThrow(RangeError);
});

test("argumento null/undefined", () => {
    expect(() => { somaNaturais(); }).toThrow();
});

test("argumento nao numerico", () => {
  expect(() => { somaNaturais("abcd"); }).toThrow(TypeError);
});