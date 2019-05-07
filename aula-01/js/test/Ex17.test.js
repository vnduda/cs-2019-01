const MDC2 = require("../Ex17.js");

test("Caso classico", () => {
  expect(MDC(4, 2)).toBe(2);
});

test("argumento null/undefined", () => {
  expect(() => { MDC(); }).toThrow(Error);
});

test("argumento nao numerico", () => {
  expect(() => { MDC("abcd"); }).toThrow(TypeError);
});

test("valor fora da faixa", () => {
  expect(() => { MDC(2, 0); }).toThrow(RangeError);
});

test("valor fora da faixa", () => {
    expect(() => { MDC(0, 4); }).toThrow(RangeError);
});