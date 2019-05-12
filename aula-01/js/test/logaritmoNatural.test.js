const logaritmoNatural = require("../logaritmoNatural.js");

test("Caso classico", () => {
  expect(logaritmoNatural(3, 3)).toBe(243);
});

test("argumento null/undefined", () => {
  expect(() => { logaritmoNatural(); }).toThrow();
});

test("argumento nao numerico", () => {
  expect(() => { logaritmoNatural("abcd"); }).toThrow(TypeError);
});

test("valor fora da faixa", () => {
  expect(() => { logaritmoNatural(0, 3); }).toThrow(RangeError);
});

test("valor fora da faixa", () => {
  expect(() => logaritmoNatural(2, 1)).toThrow(RangeError);
});