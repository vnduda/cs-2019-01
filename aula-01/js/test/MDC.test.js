const MDC = require("../MDC.js");

test("Caso classico", () => {
  expect(MDC(4, 2)).toBe(2);
});

test("argumento null/undefined", () => {
  expect(() => { MDC(); }).toThrow(Error);
});

test("argumento nao numerico", () => {
  expect(() => { MDC("abcd", 2); }).toThrow(TypeError);
});

test("valor fora da faixa", () => {
  expect(() => { MDC(2, -1); }).toThrow(RangeError);
});

test("valor fora da faixa", () => {
    expect(() => { MDC(0, 4); }).toThrow(RangeError);
});