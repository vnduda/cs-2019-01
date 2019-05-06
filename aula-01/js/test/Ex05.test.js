const somaNaturais = require("../Ex05.js");

test("Caso classico", () => {
  expect(somaNaturais(3)).toBe(6);
});

test("Valor de n fora da faixa", () => {
  expect(somaNaturais(0)).toThrow(RangeError);
});

test("argumento null/undefined", () => {
    expect(() => { somaNaturais(); }).toThrow();
});
