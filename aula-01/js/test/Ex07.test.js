const produto = require("../Ex07.js");

test("Caso clássico", () => {
  expect(produto(2, 2)).toBe(4);
});

test("Produto nao satisfaz", () => {
  expect(produto(2, 2)).toBe(5);
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
