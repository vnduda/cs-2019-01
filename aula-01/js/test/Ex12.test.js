const quadradoPerfeito = require("../Ex12.js");

test("Caso classico", () => {
  expect(quadradoPerfeito(4)).toBe(true);
});

test("5 nao satisfaz", () => {
    expect(quadradoPerfeito(5)).toBe(false);
});

test("argumento null/undefined", () => {
  expect(() => { quadradoPerfeito(); }).toThrow(Error);
});

test("argumento nao numerico", () => {
  expect(() => { quadradoPerfeito("abcd"); }).toThrow(TypeError);
});

test("valor fora da faixa", () => {
  expect(() => { quadradoPerfeito(0); }).toThrow(RangeError);
});
