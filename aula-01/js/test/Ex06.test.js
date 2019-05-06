const fatorial = require("../Ex06.js");

test("Caso classico", () => {
  expect(fatorial(3)).toBe(6);
});

test("Valor de n fora da faixa", () => {
  expect(fatorial(0)).toThrow(RangeError);
});

test("argumento null/undefined", () => {
    expect(() => { fatorial(); }).toThrow(Error);
});

test("argumento nao numerico", () => {
    expect(() => { fatorial("abcd"); }).toThrow(TypeError);
  });