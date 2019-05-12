const primo = require("../primo.js");

test("Caso classico", () => {
  expect(primo(3)).toBe(true);
});

test("4 nao satisfaz", () => {
    expect(primo(4)).toBe(false);
});

test("argumento null/undefined", () => {
  expect(() => { primo(); }).toThrow(Error);
});

test("argumento nao numerico", () => {
  expect(() => { primo("abcd"); }).toThrow(TypeError);
});

test("valor fora da faixa", () => {
  expect(() => { primo(0); }).toThrow(RangeError);
});
