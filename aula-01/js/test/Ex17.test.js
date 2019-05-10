const MDC2 = require("../Ex17.js");

test("Caso classico", () => {
  expect(MDC2(4, 2)).toBe(2);
});

test("argumento null/undefined", () => {
  expect(() => { MDC2(); }).toThrow(Error);
});

test("argumento nao numerico", () => {
  expect(() => { MDC2("abcd", 2); }).toThrow(TypeError);
});

test("valor fora da faixa", () => {
  expect(() => { MDC2(2, -1); }).toThrow(RangeError);
});

test("valor fora da faixa", () => {
    expect(() => { MDC2(0, 4); }).toThrow(RangeError);
});